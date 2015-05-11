package it.trilogis.josm.pesce;

import java.util.Collection;
import java.util.HashSet;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.FilterMatcher.FilterType;

public class FilterIndoorLevel {

    private DataSet ds;
    private final String LEVEL = "indoor:level"; // TODO: move to...
    
    public FilterIndoorLevel() {
        ds = Main.main.getCurrentDataSet();
        
    }
    
    public void showAll() {
        show(null);
    }
    public void show(Integer showLevel) {
        boolean changed = false || true; // FIXME
        Collection<OsmPrimitive> deselect = new HashSet<>();
        Main.debug("Filter on level="+showLevel);
        try {
            ds.beginUpdate();
            final Collection<OsmPrimitive> all = ds.allNonDeletedCompletePrimitives();
            
            for (OsmPrimitive p : all) {
                Main.debug(p instanceof Relation ? "Relation" : p instanceof Way ? "Way" : p instanceof Node ? "Node" : "Error");
                
                Integer wayLevel = p instanceof Way ? getLevel((Way)p) : null;
                
                if(p.getKeys().containsKey(LEVEL) || null != wayLevel) {
                    int primitiveLevel = p.getKeys().containsKey(LEVEL) ? Integer.parseInt(p.get(LEVEL)) : wayLevel;
                    Main.debug("Modify this. Now="+primitiveLevel);
                    if(null == showLevel || primitiveLevel == showLevel) {
                        // show
                        Main.debug("show");
                        //if(p.isDisabled()) changed = true; // FIXME
                        //p.setDisabledState(false);
                        p.unsetDisabledState();
                    } else {
                        // disable
                        Main.debug("disable");
                        //if(!p.isDisabled()) changed = true; // FIXME
                        //p.setDisabledState(true);
                        //p.setVisible(true);
                        changed |= p.setDisabledState(false);
                        p.setDisabledType(true); // E` un filtro esplicito? Pare
                    }
                    
                    if (p.isSelected() && p.isDisabled()) {
                        deselect.add(p);
                    }
                }
                
            }
            
            // TODO: de-select hidden primitives: ds.clearSelection(Collection<OsmPrimitive>);
        } finally {
            ds.endUpdate();
            if(changed) repaint();
            
            if(!deselect.isEmpty()) ds.clearSelection(deselect);
            
        }
    }
    
    private void repaint() {
        if (Main.isDisplayingMapView()) {
            Main.map.mapView.repaint();
            //Main.map.filterDialog.updateDialogHeader();
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
