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


    
    private DataSet ds;
    public final static String LEVEL = "indoor:level"; // TODO: move to...
    
    private int currentLevel = Constants.ALLLEVELS;
    private Relation currentGraph;
    
    public FilterIndoorLevel() {
        updateDataset();
        
    }
    
    public void updateDataset() {
        ds = Main.main.getCurrentDataSet();
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
        boolean changed = false;
        Collection<OsmPrimitive> deselect = new HashSet<>();
        Main.debug("Filter on level="+level);
        
        if(Constants.PREVIOUSLEVEL == level) {
            level = currentLevel;
            Main.debug("PREVIOUSLEVEL, so: level="+level);
        }
        
        boolean showPreviousGraph = null == graph && !allGraphs;
        
        IsMember isInGraph;
        if(allGraphs) {
            isInGraph = new AlwaysMember();
        } else if(showPreviousGraph) {
            isInGraph = new IsMember(currentGraph);
        } else {
            isInGraph = new IsMember(graph);
        }
        
        
        // Save graph for next call
        if(null != graph) {
            currentGraph = graph;
        }
        
        updateDataset();
        //try
        {
            ds.beginUpdate();
            final Collection<OsmPrimitive> all = ds.allNonDeletedCompletePrimitives();
            for (OsmPrimitive p : all) {
                Main.debug(p instanceof Relation ? "Relation" : p instanceof Way ? "Way" : p instanceof Node ? "Node" : "Error");
                
                Integer wayLevel = p instanceof Way ? getLevel((Way)p) : null;
                
                if(p.getKeys().containsKey(LEVEL) || null != wayLevel) {
                    int primitiveLevel = p.getKeys().containsKey(LEVEL) ? Integer.parseInt(p.get(LEVEL)) : wayLevel;
                    Main.debug("Modify this. Now="+primitiveLevel);
                    if((primitiveLevel == level || Constants.ALLLEVELS == level) && isInGraph.isMember(p)) {
                        // show
                        Main.debug("show");
                        //if(p.isDisabled()) changed = true; // FIXME
                        //p.setDisabledState(false);
                        changed |= p.unsetDisabledState();
                    } else {
                        // disable
                        Main.debug("disable");
                        //if(!p.isDisabled()) changed = true; // FIXME
                        //p.setDisabledState(true);
                        //p.setVisible(true);
                        changed |= p.setDisabledState(false);
                        p.setDisabledType(true); // Explicit filter
                        
                    }
                    
                    if (p.isSelected() && p.isDisabled()) {
                        deselect.add(p);
                    }
                }
            }
            
            // TODO: de-select hidden primitives: ds.clearSelection(Collection<OsmPrimitive>);
            ds.clearSelection(deselect);
        } 
        //finally 
        {
            ds.endUpdate();
            Main.debug("changed="+changed);
            if(changed) repaint();
            
            if(!deselect.isEmpty()) ds.clearSelection(deselect);
            
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
