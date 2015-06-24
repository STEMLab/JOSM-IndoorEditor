// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce.dialogs;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.josm.pesce.Constants;
import it.trilogis.josm.pesce.FilterIndoorLevel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import javax.swing.AbstractAction;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.search.SearchAction;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Filter;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.RelationMember;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.event.AbstractDatasetChangedEvent;
import org.openstreetmap.josm.data.osm.event.DataChangedEvent;
import org.openstreetmap.josm.data.osm.event.DataSetListener;
import org.openstreetmap.josm.data.osm.event.DatasetEventManager;
import org.openstreetmap.josm.data.osm.event.DatasetEventManager.FireMode;
import org.openstreetmap.josm.data.osm.event.NodeMovedEvent;
import org.openstreetmap.josm.data.osm.event.PrimitivesAddedEvent;
import org.openstreetmap.josm.data.osm.event.PrimitivesRemovedEvent;
import org.openstreetmap.josm.data.osm.event.RelationMembersChangedEvent;
import org.openstreetmap.josm.data.osm.event.TagsChangedEvent;
import org.openstreetmap.josm.data.osm.event.WayNodesChangedEvent;
import org.openstreetmap.josm.gui.SideButton;
import org.openstreetmap.josm.gui.dialogs.FilterTableModel;
import org.openstreetmap.josm.gui.dialogs.ToggleDialog;
import org.openstreetmap.josm.tools.ImageProvider;
import org.openstreetmap.josm.tools.InputMapUtils;
import org.openstreetmap.josm.tools.MultikeyActionsHandler;
import org.openstreetmap.josm.tools.MultikeyShortcutAction;
import org.openstreetmap.josm.tools.Shortcut;

/**
 *
 * @author Petr_Dlouh
 */
public class FloorsFilterDialog extends ToggleDialog implements DataSetListener {

    // Types of nodes of 
    private static final int TREEROOT = 1;
    private static final int TREEFLOOR = 2;
    private static final int TREESTATES = 3;

    public static final String TREELABELALL = "All"; // TODO FloorsFilterDialog.TREELABELALL

    private FilterIndoorLevel filterLevel;

    private FloorMutableTreeNode root = null;

    /**
     * Constructs a new {@code FilterDialog}
     */
    public FloorsFilterDialog() {
        super(tr("Floors selector"), "floors", tr("Select the floor to view"), null, 162);
        setIsButtonHiding(ButtonHidingType.ALWAYS_HIDDEN);
        filterLevel = new FilterIndoorLevel();
        build();
    }

    @Override
    public void showNotify() {
        DatasetEventManager.getInstance().addDatasetListener(this, FireMode.IN_EDT_CONSOLIDATED);
        build();
        // Repaint of the dialog
    }

    @Override
    public void hideNotify() {
        DatasetEventManager.getInstance().removeDatasetListener(this);
        Main.map.mapView.repaint();
        
    }

    private boolean isItNull(Object o, String name) {
        Main.debug("Is " + name + " null? " + (null==o ? "Yes" : "No"));
        return null==o;
    }

    public void removeNodes(FloorMutableTreeNode root) {

        Main.debug("removeNodes()");
       root.removeAllChildren();
    }
    
    final static private Set<String> specialFloors = new HashSet<>(Arrays.asList(new String[]{"All"}));
    /**
     * addNodes/updateNodes() Call this method after build()
     */ 
    public void addNodes(FloorMutableTreeNode root) {

        Main.debug("addNodes()");
        
        DataSet ds = Main.main.getCurrentDataSet();
        Map<Integer, FloorMutableTreeNode> floors = new HashMap<>();
        
        //Main.debug("Is ds null? " + (null==ds ? "Yes" : "No"));
        
        if(isItNull(ds,"ds")) {
            return; // I can't add nothing now
        }
        
        //Main.debug("Is root null? " + (null==root ? "Yes" : "No"));
        if(isItNull(root,"root")) {
            return;
        }
        
//        // Read existent floors of the tree. Why? TODO
//        @SuppressWarnings("unchecked")
//        Enumeration<FloorMutableTreeNode> e = root.children();
//        while (e.hasMoreElements()) {
//            Main.debug("=");
//            FloorMutableTreeNode floor = e.nextElement();
//            Main.debug("==");
//            String label = (String) floor.getUserObject();
//            Main.debug("===");
//            if(specialFloors.contains(label)) {
//                Main.debug("===*");
//                // Not a real floor
//                continue;
//            }
//            Main.debug("====");
//            int iFloor;
//            try {
//                Main.debug("=====");
//                iFloor = Integer.parseInt(label);
//                floors.put(iFloor, floor);
//            } catch (Exception e1) {
//                Main.info(label + " is not a floor and it is not included into specialFloors");
//            }
////         Enumeration<FloorMutableTreeNode> f = root.children();
////         while (f.hasMoreElements()) {
////             FloorMutableTreeNode node = e.nextElement();
////         }
//
//        }
//        Main.debug("First cycle gone");
//        //floors.get(-1).add(new FloorMutableTreeNode("-1 test", false));
//        //floors.get(0).add(new FloorMutableTreeNode("0 test", false));
//

        Main.debug("======");
        
        try {
            ds.beginUpdate();
            final Collection<OsmPrimitive> all = ds.allNonDeletedCompletePrimitives();
            Main.debug("Number of osm primitives >>>>> "+all.size());
            for (OsmPrimitive primitive : all) {

                if (!(primitive instanceof Node)) {
                    // Insert only nodes
                    continue;
                }
                Main.debug("I'm happy!!! A node "+primitive.getName());
                int primitiveLevel = primitive.getKeys().containsKey(FilterIndoorLevel.LEVEL) ? Integer.parseInt(primitive.get(FilterIndoorLevel.LEVEL)) : Constants.MISSEDLEVEL;
                
                FloorMutableTreeNode floor = floors.get(primitiveLevel);
                if (null == floor) {
                    Main.debug("Create a floor: "+primitiveLevel);
                    floors.put(primitiveLevel, floor = new FloorMutableTreeNode(""+primitiveLevel));
                    root.add(floor);
                    Main.debug("Add to root "+primitiveLevel+" "+floor);
                }
                floor.add(new FloorMutableTreeNode(primitive.getName(), false));
            }

            // Order all children

            // TODO: de-select hidden primitives: ds.clearSelection(Collection<OsmPrimitive>);
        } catch(Exception e1) {
            Main.debug("ERORE "+e1.getMessage());
        }
        finally {
            ds.endUpdate();
//            Main.debug("changed=" + changed);
//            if (changed)
//                repaint();
        }
        Main.debug(">>>>>>>>>>>>>>>> "+floors.size());
        
        FloorMutableTreeNode all = new FloorMutableTreeNode("All");
        root.add(all);
        //fu1.add(new FloorMutableTreeNode("eee", false));
        //fu1.add(new FloorMutableTreeNode("rrr", false));
        
        for(int i : floors.keySet()) {
            Main.debug("Add to root "+i);
            FloorMutableTreeNode floor = floors.get(i);
            //root.add(floor); //moved up
        }
    }
    
    private JTree tree = null; // Very final

    protected void build() {

        Main.debug("build()");
        
        FloorMutableTreeNode root;
        if(null == tree) {
            Main.debug("Init tree");
            tree = new JTree(root = new FloorMutableTreeNode("Floors"));
            
            add(tree, BorderLayout.CENTER);
        } else {
            Main.debug("get tree");
            root = (FloorMutableTreeNode) tree.getModel().getRoot();
            removeNodes(root);
            FloorMutableTreeNode all = new FloorMutableTreeNode(TREELABELALL, false);
            //root.add(all);
        }

        

        FloorMutableTreeNode fu1 = new FloorMutableTreeNode("-2"+new Random().nextInt(100));
        FloorMutableTreeNode f0 = new FloorMutableTreeNode("10");
        FloorMutableTreeNode f1 = new FloorMutableTreeNode("11");

//        root.add(f0);
//        f0.add(new FloorMutableTreeNode("Example Fake Node", false));
//        root.add(f1);
//        f1.add(new FloorMutableTreeNode("Example Fake Node", false));
//        f1.add(new FloorMutableTreeNode("Example Fake Node", false));
//        f1.add(new FloorMutableTreeNode("Example Fake Node", false));
//        root.add(f0);Main.debug("f0");
//        root.add(f1);Main.debug("fu1");
//        root.add(fu1);Main.debug("fu1");
//        fu1.add(new FloorMutableTreeNode("Example Fake Node", false));
//        fu1.add(new FloorMutableTreeNode("Example Fake Node", false));

        tree.setShowsRootHandles(true);
        tree.setRootVisible(false);

        
        addNodes(root);

        root.sortChildren();

        @SuppressWarnings("unchecked")
        Enumeration<FloorMutableTreeNode> e = root.children();
        while (e.hasMoreElements()) {
            tree.makeVisible(new TreePath(e.nextElement().getPath()));
        }

        tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                filterLevel.updateDataset(); // I don't know when this is needed
                //selectedLabel.setText(e.getPath().toString());
                TreePath p = e.getPath();

                //Main.debug("@"+tree.getRowForPath(p));
                Main.debug("[valueChanged] " + ((String) ((FloorMutableTreeNode) p.getLastPathComponent()).getUserObject()));

                DefaultMutableTreeNode floorNode = (DefaultMutableTreeNode) p.getPath()[TREEFLOOR - 1];

                String label = (String) floorNode.getUserObject();

                Main.debug(label);

                int level;
                if (FloorsFilterDialog.TREELABELALL.equals(label)) {
                    // Do not filter levels
                    level = Constants.ALLLEVELS;
                } else {
                    level = Integer.parseInt(label);
                }
                filterLevel.show(level);

                if (p.getPathCount() > TREEFLOOR) {
                    // TODO: The level 3 () is selected: the state
                    Main.debug("D: You are clicking states");
                }
            }
        });

     SideButton uploadButton = new SideButton(new AbstractAction() {
         {
             putValue(NAME, tr("Upload"));
             putValue(SHORT_DESCRIPTION,  tr("Upload all layers to {0}","i-locate"));
             putValue(SMALL_ICON, ImageProvider.get("dialogs","up"));
         }
         @Override
         public void actionPerformed(ActionEvent e) {
             Main.debug("Upload all datasets! (Or refresh filters)");
             
             filterLevel.show(Constants.PREVIOUSLEVEL);
             
             if (Main.isDisplayingMapView()) {
                 Main.map.mapView.repaint();
                /// Main.map.filterDialog.updateDialogHeader();
             }
         }});
     //uploadButton.setPreferredSize(new Dimension(200, 100));
     
//     SideButton downButton = new SideButton(new AbstractAction() {
//         {
//             //putValue(NAME, tr("Down"));
//             //putValue(SHORT_DESCRIPTION, tr("Move filter down."));
//             putValue(SMALL_ICON, ImageProvider.get("dialogs", "pin"));
//         }
//         @Override
//         public void actionPerformed(ActionEvent e) {
//             Main.debug("PRESS down");
//         }
//     });
//
//     downButton.setPreferredSize(new Dimension(100, 100));
        //this.add(new JLabel("Container doesn't use BorderLayout!"),BorderLayout.PAGE_START);
        //this.add(downButton,BorderLayout.CENTER);
        
        
         this.add(uploadButton,BorderLayout.PAGE_END);

    }

    @Override
    public void destroy() {
        super.destroy();
    }

    /**
     * Returns the list of primitives whose filtering can be affected by change in primitive
     * 
     * @param primitives
     *            list of primitives to check
     * @return List of primitives whose filtering can be affected by change in source primitives
     */
    private Collection<OsmPrimitive> getAffectedPrimitives(Collection<? extends OsmPrimitive> primitives) {
        // Filters can use nested parent/child expression so complete tree is necessary
        Set<OsmPrimitive> result = new HashSet<>();
        Stack<OsmPrimitive> stack = new Stack<>();
        stack.addAll(primitives);

        while (!stack.isEmpty()) {
            OsmPrimitive p = stack.pop();

            if (result.contains(p)) {
                continue;
            }

            result.add(p);

            if (p instanceof Way) {
                for (OsmPrimitive n : ((Way) p).getNodes()) {
                    stack.push(n);
                }
            } else if (p instanceof Relation) {
                for (RelationMember rm : ((Relation) p).getMembers()) {
                    stack.push(rm.getMember());
                }
            }

            for (OsmPrimitive ref : p.getReferrers()) {
                stack.push(ref);
            }
        }

        return result;
    }

    @Override
    public void dataChanged(DataChangedEvent event) {
        Main.debug("\t\tA dataChanged");
    }

    @Override
    public void nodeMoved(NodeMovedEvent event) {
        // Do nothing
    }

    @Override
    public void otherDatasetChange(AbstractDatasetChangedEvent event) {
        Main.debug("\t\tb otherDatasetChange");
    }

    @Override
    public void primitivesAdded(PrimitivesAddedEvent event) {
        Main.debug("\t\tc primitivesAdded");
    }

    @Override
    public void primitivesRemoved(PrimitivesRemovedEvent event) {
    }

    @Override
    public void relationMembersChanged(RelationMembersChangedEvent event) {
        Main.debug("\t\td relationMembersChanged");
    }

    @Override
    public void tagsChanged(TagsChangedEvent event) {
        Main.debug("\t\te tagsChanged");
        // TODO: update filters.
        // TODO: add/move nodes into the tree
        filterLevel.show(Constants.PREVIOUSLEVEL);
        
        if (Main.isDisplayingMapView()) {
            Main.map.mapView.repaint();
           /// Main.map.filterDialog.updateDialogHeader();
        }
    }

    @Override
    public void wayNodesChanged(WayNodesChangedEvent event) {
        Main.debug("\t\tf wayNodesChanged");
    }

    static private class FloorMutableTreeNode extends DefaultMutableTreeNode implements Comparable<FloorMutableTreeNode> {

        public FloorMutableTreeNode(Object userObject, boolean allowsChildren) {
            super(userObject, allowsChildren);
        }

        public FloorMutableTreeNode(Object userObject) {
            super(userObject, true);
        }

        @SuppressWarnings("unchecked")
        void sortChildren() {
            if(null!=children) {
                Collections.sort((List<FloorMutableTreeNode>) children);
            }
        }

        @Override
        public int compareTo(FloorMutableTreeNode o) {
            String x = (String) this.getUserObject();
            String y = (String) o.getUserObject();
            int r;
            //Main.debug("x="+x+" y="+y);
            if (FloorsFilterDialog.TREELABELALL.equals(x)) {
                r = Integer.compare(0, 1);
            }
            else if (FloorsFilterDialog.TREELABELALL.equals(y)) {
                r =  Integer.compare(1, 0);
            } else {
                r = Integer.compare(Integer.parseInt(x), Integer.parseInt(y));
            }
            //Main.debug("Compare: "+x+" "+y+" "+r);
            return r;
        }
    }

}