package it.trilogis.josm.pesce;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.FilterMatcher.FilterType;
import org.openstreetmap.josm.gui.layer.Layer;

public class FilterIndoorLevel {

    public final static String LEVEL = "indoor:level"; // TODO: move to...
    
    private int currentLevel = Constants.ALLLEVELS;
    private IsMember isInGraph;
    private boolean enabled;
    
    public FilterIndoorLevel() {
        enable();
        isInGraph = new AlwaysMember();
    }
    
    public void setEnabled(boolean enabled) {
        if(enabled)
            enable();
        else
            disable();
    }
    
    public void enable() {
        enabled = true;
    }
    
    public void disable() {
        // Show all before disable
        show(Constants.ALLLEVELS,null,true);
        enabled = false;
    }
    
    private static class IsMember {
        private Set<OsmPrimitive> primitives;
        public IsMember(Relation graph) {
            if(null!=graph) {
                this.primitives = graph.getMemberPrimitives();
            }
        }
        
        boolean isMember(OsmPrimitive primitive) {
            return primitives.contains(primitive);
        }
    }
    private static class AlwaysMember extends IsMember {
        
        public AlwaysMember() {
            super(null);
        }
        @Override
        boolean isMember(OsmPrimitive primitive) {
            return true;
        }
    }
    
    
    
    public void show(int level, Relation graph, boolean allGraphs) {
        if(!enabled) {
            return;
        }
        boolean changed = false;
        Collection<OsmPrimitive> deselect = new HashSet<>();
        Main.debug("Filter on level="+level);
        
        if(null == PescePlugin.ds) {
            Main.debug("[...show] PescePlugin.ds ot initialized");
            return;
        }
        
        if(Constants.PREVIOUSLEVEL == level) {
            level = currentLevel;
            Main.debug("PREVIOUSLEVEL, so: level="+level);
        }
        
        boolean showPreviousGraph = null == graph && !allGraphs;
        
        Main.debug("[...show] level="+(level==Constants.ALLLEVELS ? "All" : level)+" showPreviousGraph="+showPreviousGraph+" allGraphs="+allGraphs);
        
        if(allGraphs) {
            isInGraph = new AlwaysMember();
        } else if(!showPreviousGraph) {
            isInGraph = new IsMember(graph);
        }
      
        //try
        {
            PescePlugin.ds.beginUpdate();
            final Collection<OsmPrimitive> all = PescePlugin.ds.allNonDeletedCompletePrimitives();
            for (OsmPrimitive p : all) {
                //Main.debug(p instanceof Relation ? "Relation" : p instanceof Way ? "Way" : p instanceof Node ? "Node" : "Error");
                
                Integer wayLevel = p instanceof Way ? getLevel((Way)p) : null;
                
                if(p.getKeys().containsKey(LEVEL) || null != wayLevel) {
                    int primitiveLevel = p.getKeys().containsKey(LEVEL) ? Integer.parseInt(p.get(LEVEL)) : wayLevel;
                    //Main.debug("Modify this. Now="+primitiveLevel);

                    if((primitiveLevel == level || Constants.ALLLEVELS == level) && isInGraph.isMember(p)) {
                        // show
                        changed |= p.unsetDisabledState();
                    } else {
                        // disable
                        changed |= p.setDisabledState(!isInGraph.isMember(p)); // hide the other graphs
                        p.setDisabledType(true); // Explicit filter
                    }
                    
                    if (p.isSelected() && p.isDisabled()) {
                        deselect.add(p);
                    }
                }
            }
            
            // TODO: de-select hidden primitives: ds.clearSelection(Collection<OsmPrimitive>);
            PescePlugin.ds.clearSelection(deselect);
        } 
        //finally 
        {
            PescePlugin.ds.endUpdate();
            Main.debug("changed="+changed);
            if(changed) repaint();
            
            if(!deselect.isEmpty()) PescePlugin.ds.clearSelection(deselect);
            
            currentLevel = level;
        }
    }
    
    public void show(Relation graph, boolean allGraphs) {
        show(Constants.PREVIOUSLEVEL, graph, allGraphs);
    }
    
    public void show(int level) {
        show(level, null, false); // null, false -> previousGraph 
    }
    public void showAllGraphs() {
        show(Constants.PREVIOUSLEVEL, null, true);
    }
    public void showAllLevels() {
        show(Constants.ALLLEVELS, null, false);
    }
    
    private void repaint() {
        if (Main.isDisplayingMapView()) {
            Main.debug("Main.map.mapView.repaint();");
            Main.map.mapView.repaint();
            // Main.map.mapView.requestFocus();
            //Main.map.filterDialog.updateDialogHeader();
            
            // Repaint doesn't work. Neither Layer.toggleVisible
//            Layer l = PescePlugin.getLayer(ds); 
//            l.toggleVisible();
//            l.toggleVisible();
        }
    }
    
    /**
     * The level is defined if all the tagged nodes show the same level
     * @param way
     * @return
     */
    private Integer getLevel(Way way) {
        Integer guest = null;
        for(Node n : way.getNodes()) {
            if(n.getKeys().containsKey(LEVEL)) {
                int nextGuest = Integer.parseInt(n.get(LEVEL));
                if(null == guest) {
                    guest = nextGuest;
                } else {
                    if(guest != nextGuest) {
                        // The way cover at least 2 levels
                        return null;
                    }
                }
            }
        }
        return guest;
    }
    
}
