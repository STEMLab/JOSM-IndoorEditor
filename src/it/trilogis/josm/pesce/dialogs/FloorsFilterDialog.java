// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce.dialogs;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.josm.pesce.Constants;
import it.trilogis.josm.pesce.FilterIndoorLevel;
import it.trilogis.josm.pesce.PescePlugin;
import it.trilogis.josm.pesce.PescePlugin.LayerType;
import it.trilogis.josm.pesce.PescePlugin.UploadInfo;
import it.trilogis.josm.pesce.Utils;
import it.trilogis.josm.pesce.serverconnection.IlocateUploadTask;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Robot;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.UpdateDataAction;
import org.openstreetmap.josm.actions.search.SearchAction;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Filter;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.PrimitiveId;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.RelationMember;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.event.AbstractDatasetChangedEvent;
import org.openstreetmap.josm.data.osm.event.AbstractDatasetChangedEvent.DatasetEventType;
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
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.progress.NullProgressMonitor;
import org.openstreetmap.josm.io.BoundingBoxDownloader;
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
    public static final int TREEROOT = 1;
    public static final int TREEFLOOR = 2;
    public static final int TREESTATES = 3;

    public static final String TREELABELALL = "All"; // TODO FloorsFilterDialog.TREELABELALL
    public static final String GRAPHSLABEL = "Graphs"; // TODO FloorsFilterDialog.GRAPHSLABEL

    public static FloorsFilterDialog INSTANCE = null;
    
    private JTree tree = null; // Very final
    public JTree getTree() {
        return tree;
    }

    private JTree treeGraphs = null;
    
    public JTree getTreeGraphs() {
        return treeGraphs;
    }
    
    private ButtonsPanel buttonsPanel;

    // Edit mode
    private Map<DataSet,LayerType> dsToType = null;
   
    //final static private Set<String> specialFloors = new HashSet<>(Arrays.asList(new String[]{ TREELABELALL }));

    private FilterIndoorLevel filterLevel;
    

    public FilterIndoorLevel getFilterLevel() {
        return filterLevel;
    }

    private TreePath[] sp; // selected paths
    
    private List<Integer> newLevels = null;
    

    /**
     * Constructs a new {@code FilterDialog}
     */
    public FloorsFilterDialog() {
        super(tr("Indoor features"), "floors", tr("Fiter levels and graphs. Communication to the i-locate server."), null, 162);
        
        // WORKAROUND
//        __events_to_ignore = 0;
        
        if(null != INSTANCE) {
            Main.error("[FloorsFilterDialog.FloorsFilterDialog] Only one instance is allowed");
            System.exit(1);
        }
        INSTANCE = this;
        sp = new TreePath[2];
        sp[0] = null;
        sp[1] = null;
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

    public void removeNodes(DefaultMutableTreeNode node, DefaultTreeModel model) {

        Main.debug("removeNodes()");
        
//        @SuppressWarnings("unchecked")
//        Enumeration<DefaultMutableTreeNode> ch = node.children();
//        while(ch.hasMoreElements()) {
//            model.removeNodeFromParent(ch.nextElement());
//        }
        
        node.removeAllChildren();
        model.reload(node);
    }
    
    
    /**
     * addNodes/updateNodes() Call this method after build()
     * @param treeModel 
     */ 
    public void addFloorNodes(FloorMutableTreeNode root, DefaultTreeModel treeModel) {

        Main.debug("addFloorNodes()");
        
        Map<Integer, FloorMutableTreeNode> floors = new HashMap<>();
        
        //Main.debug("Is ds null? " + (null==ds ? "Yes" : "No"));
        
        if(isItNull(PescePlugin.ds,"ds")) {
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

        try {
            PescePlugin.ds.beginUpdate();
            final Collection<OsmPrimitive> all = PescePlugin.ds.allNonDeletedCompletePrimitives();
            Main.debug("Number of osm primitives: "+all.size());
                        
            for (OsmPrimitive primitive : all) {

                if (!(primitive instanceof Node)) {
                    // Insert only nodes
                    continue;
                }
                int primitiveLevel = primitive.getKeys().containsKey(FilterIndoorLevel.LEVEL) ? Integer.parseInt(primitive.get(FilterIndoorLevel.LEVEL)) : Constants.MISSEDLEVEL;
               
                
                FloorMutableTreeNode floor = floors.get(primitiveLevel);
                if (null == floor) {
                    Main.debug("Create a floor: "+primitiveLevel);
                    floors.put(primitiveLevel, floor = new FloorMutableTreeNode(Constants.MISSEDLEVEL == primitiveLevel ? Constants.MISSEDLEVEL_STRING : String.valueOf(primitiveLevel)));
                    treeModel.insertNodeInto(floor, root, root.getChildCount());
                    Main.debug("Add to root floor "+floor+" (label)");
                    
                    // TODO: use -> addNewLevel(newLevel);
                }
                String name = primitive.getName();
                floor.add(new FloorMutableTreeNode(new PrimitiveUserObject(primitive.getPrimitiveId(), name==null ? String.valueOf(primitive.getPrimitiveId()) : name), false));
            }
            
            // If some newLevels are missed, I explicit add them
            for(Integer newLevel : getNewLevels()) {
                if(!floors.containsKey(newLevel)) {
                    FloorMutableTreeNode floor = new FloorMutableTreeNode(String.valueOf(newLevel));
                    treeModel = (DefaultTreeModel)tree.getModel();
                    root = (FloorMutableTreeNode) treeModel.getRoot();
                    treeModel.insertNodeInto(floor, root, root.getChildCount());
                }
            }
            
            // Yet into the tree
            //root.add(new FloorMutableTreeNode("All"));
            
            // Order all children

            // TODO: de-select hidden primitives: ds.clearSelection(Collection<OsmPrimitive>);
        } catch(Exception e1) {
            Main.debug("ERORE "+e1.getMessage());
        }
        finally {
            PescePlugin.ds.endUpdate();
//            Main.debug("changed=" + changed);
//            if (changed)
//                repaint();
        }
        Main.debug("[...] Number of floors: "+floors.size());
        //fu1.add(new FloorMutableTreeNode("eee", false));
        //fu1.add(new FloorMutableTreeNode("rrr", false));
        
//        for(int i : floors.keySet()) {
//            Main.debug("Add to root "+i);
//            FloorMutableTreeNode floor = floors.get(i);
//            //root.add(floor); //moved up
//        }
    }
    
    void build() {
        build(false,false);
    }
    void build(boolean dataSetChanged, boolean saveSelections) {

        //DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG
        if(PescePlugin.ds != Main.main.getCurrentDataSet()) {
            Main.error("[...build] DATASET NOT UPDATED!!!! ");
            PescePlugin.ds = Main.main.getCurrentDataSet();
        }
        
        //DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG DEBUG
        
        Main.debug("[FloorsFilterDialog] build()");
        
        if(dataSetChanged) {
            Main.debug("Here I'd create a new interface based on the new dataset");
            String log = "";
            
            log += "tree "+tree+"\n";
            
            FloorMutableTreeNode root = (FloorMutableTreeNode) tree.getModel().getRoot();
            log += "root "+root+"\n";
            log += "morechildren "+root.children().hasMoreElements()+"\n";
            
            Main.debug(log);
            
            // Update button label
            LayerType type = getLayerType(); 
            if(null == type) {
                type = LayerType.IGML;
            }
            switch(type) {
            case IGML:
                setIndoorgmlEditMode();
                break;
            case BUILDING:
                setBuildingsEditMode();
                break;
            }
        }
        
        DefaultTreeModel  treeModel;
        FloorMutableTreeNode root;
        if (null == tree) {
            
            // I init the tree only once.
            
            Main.debug("Init tree");
            tree = new JTree(root = new FloorMutableTreeNode("Floors"));
            

            tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
                @Override
                public void valueChanged(TreeSelectionEvent e) {

                    if (2 == tree.getSelectionCount()) {
                        // I sected 2 objects, do nothing
                        return;
                    }

                    //selectedLabel.setText(e.getPath().toString());
                    TreePath p = e.getPath();

                    //Main.debug("@"+tree.getRowForPath(p));
                    if (p.getPathCount() == TREESTATES) {
                        // A node is selected

                        Main.debug("[valueChanged] Node: " + ((PrimitiveUserObject) ((FloorMutableTreeNode) p.getLastPathComponent()).getUserObject()));
                    } else {
                        Main.debug("[valueChanged] Not Node: " + ((String) ((FloorMutableTreeNode) p.getLastPathComponent()).getUserObject()));
                    }

                    DefaultMutableTreeNode floorNode = (DefaultMutableTreeNode) p.getPath()[TREEFLOOR - 1];

                    String floorLabel = (String) floorNode.getUserObject();

                    Main.debug(floorLabel);

                    int level;
                    if (FloorsFilterDialog.TREELABELALL.equals(floorLabel)) {
                        // Do not filter levels
                        level = Constants.ALLLEVELS;
                    } else if(Constants.MISSEDLEVEL_STRING.equals(floorLabel)) {
                        level = Constants.MISSEDLEVEL;
                    } else {
                        level = Integer.parseInt(floorLabel);
                    }
                    filterLevel.show(level);

                    if (p.getPathCount() > TREEFLOOR) {
                        // TODO: The level 3 () is selected: the state
                        Main.debug("You are clicking states, we'll work on selection here");

                        // I can work on selection here.
                        // Policy: keep selected 2 states clicked.
                        //         If 2 states is yet seceted, start from 
                        //         the begin and select only the clicked state.
                        //         click a floor cancel states selection
                        if (null == sp[0] || null != sp[0] && null != sp[1]) {
                            sp[0] = p;
                            sp[1] = null;
                        } else if (null == sp[1]) {
                            sp[1] = p;
                            tree.setSelectionPaths(sp);
                        } else {
                            Main.error("[FloorsFilterDialog.build.addTreeSelectionListener] Bug!");
                        }
                    } else {
                        sp[0] = null;
                        sp[1] = null;
                    }
                }
            });

             JScrollPane scrollableFloors = new JScrollPane(tree, 
                     JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                     JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
             JScrollPane scrollableGraphs = new JScrollPane(treeGraphs = new JTree(new DefaultMutableTreeNode(GRAPHSLABEL)), 
                     JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                     JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
             
             
             JPanel treesPanel = new JPanel(Main.pref.getBoolean("dialog.align.left", false)
                     ? new FlowLayout(FlowLayout.LEFT) : new GridLayout(1, 2));
             treesPanel.add(scrollableFloors);
             treesPanel.add(scrollableGraphs);
             
             add(treesPanel, BorderLayout.CENTER);
             
             buttonsPanel = new ButtonsPanel(this);
             
             this.add(buttonsPanel,BorderLayout.SOUTH);

             treeGraphs.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {

                @Override
                public void valueChanged(TreeSelectionEvent e) {
                    // TODO Restrict the visibility of:
                    // 0. Hide the objects on the map (real hiding);
                    // 1. Don't show the 
                    Main.debug("[FloorsFilterDialog.treeGraphs.addTreeSelectionListener] Graphs selection");
                    
                    TreePath p = e.getPath();
                    if(p.getPathCount() == 2) {
                        // A graph is selected
                        PrimitiveUserObject primitiveNode = (PrimitiveUserObject) ((DefaultMutableTreeNode) p.getLastPathComponent()).getUserObject();
                        
                        filterLevel.show((Relation) PescePlugin.ds.getPrimitiveById(primitiveNode.id), false);
                    } else {
                        // Show all graphs
                        filterLevel.showAllGraphs();
                    }
                }
                 
             });

            ///////////////////////////////////////
             
            treeModel = (DefaultTreeModel) tree.getModel();
            
            if(saveSelections) {
                Main.error("1s");
                saveTreeState(tree);
            }
            
        } else {
            Main.debug("get tree");
            if(saveSelections) {
                Main.error("2s");
                saveTreeState(tree);
            }
            treeModel = (DefaultTreeModel) tree.getModel();
            root = (FloorMutableTreeNode) treeModel.getRoot();
            removeNodes(root, treeModel);
            
        }

        FloorMutableTreeNode all = new FloorMutableTreeNode(TREELABELALL, false);
        treeModel.insertNodeInto(all, root, 0);


        tree.setShowsRootHandles(true);
        tree.setRootVisible(false);

        
        addFloorNodes(root, treeModel);

        root.sortChildren();

        tree.expandPath(new TreePath(root.getPath()));
        
        if(saveSelections) {
            Main.error("1r");
            restoreTreeState(tree);
        }

        // Compile Graphs part
        if(null != PescePlugin.ds) {
            
            if(saveSelections) {
                Main.error("g1s");
                saveTreeState(treeGraphs);
            }
            
            Main.debug(String.format("[FloorsFilterDialog.build] Add %d relations to the Graphs tree", PescePlugin.ds.getRelations().size()));
            DefaultTreeModel treeGhraphsModel = (DefaultTreeModel) treeGraphs.getModel();
            DefaultMutableTreeNode rootGraphs = (DefaultMutableTreeNode) treeGhraphsModel.getRoot();
            removeNodes(rootGraphs, treeGhraphsModel);
            for(Relation relation : PescePlugin.ds.getRelations()) {
                //rootGraphs.add(new DefaultMutableTreeNode(new PrimitiveUserObject(relation.getPrimitiveId(), relation.getName())));
                treeGhraphsModel.insertNodeInto(new DefaultMutableTreeNode(new PrimitiveUserObject(relation.getPrimitiveId(), relation.getName())), rootGraphs, rootGraphs.getChildCount());
            }
            
            //YYY ((DefaultMutableTreeNode)rootGraphs.children().nextElement()).

            treeGraphs.expandPath(new TreePath(rootGraphs.getPath()));
            
//            // Make them visible, it is needed only if I hide the root
//            @SuppressWarnings("unchecked")
//            Enumeration<DefaultMutableTreeNode> e1 = rootGraphs.children();
//            while (e.hasMoreElements()) {
//                treeGraphs.makeVisible(new TreePath(e1.nextElement().getPath()));
//            }
            
            if(saveSelections) {
                Main.error("g1r");
                restoreTreeState(treeGraphs);
            }
        } else {
            //Main.debug("[FloorsFilterDialog.build] DataSet not defined yet");
        }
        Main.debug("[...build] End of build()");
    }
    
    private List<Integer> getNewLevels() {
        if(null == newLevels) {
            newLevels = new ArrayList<>();
        }
        return newLevels;
    }
    
    // Edit mode manipulation
    public void setBuildingsEditMode() {
        buttonsPanel.setModeButtonBuildingsEditMode();
        setLayerType(LayerType.BUILDING);
    }


    public void setIndoorgmlEditMode() {
        buttonsPanel.setModeButtonIndoorgmlEditMode();
        setLayerType(LayerType.IGML);
    }
    /////////////////////////

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void primitivesAdded(PrimitivesAddedEvent event) {
        dataChangedOrAdded(event);
    }
    
    @Override
    public void dataChanged(DataChangedEvent event) {
        dataChangedOrAdded(event);
    }

    // Reminder:
    // public enum DatasetEventType {DATA_CHANGED, NODE_MOVED, PRIMITIVES_ADDED, PRIMITIVES_REMOVED,
    // RELATION_MEMBERS_CHANGED, TAGS_CHANGED, WAY_NODES_CHANGED, CHANGESET_ID_CHANGED}
    
    private void dataChangedOrAdded(AbstractDatasetChangedEvent event) {
        Main.debug("\n\n\n\t\tA dataChangedOrAdded "+event.getDataset());
        DatasetEventType type = event.getType();
        

        
        if(type == DatasetEventType.PRIMITIVES_ADDED &&  ((PrimitivesAddedEvent)event).wasIncomplete()) {
            Main.debug("\t\tc incompletePrimitivesAdded");
            return;
        }
        
        // Josm whips it's datasets back and forth.
        DataSet newDs = event.getDataset();
        if(newDs != PescePlugin.ds) {
            Main.debug("[FloorsFilterDialog.dataChangedOrAdded] Update the dataSet");
            PescePlugin.ds = newDs;
            build(true,false);
        } else {
            type = event.getType();
            // The DataSet is ok, what did it change?
            Main.debug("[FloorsFilterDialog.dataChangedOrAdded] The DataSet is ok, what did it change?");
            Main.debug("[FloorsFilterDialog.dataChangedOrAdded] type: "+type);
            Main.debug("[FloorsFilterDialog.dataChangedOrAdded] size: "+event.getPrimitives().size());
            
            Collection<AbstractDatasetChangedEvent> events;
            switch(type) {
            case PRIMITIVES_ADDED:
                events = new ArrayList<>();
                events.add(event);
                break;
            case DATA_CHANGED:
                events = ((DataChangedEvent)event).getEvents();
                break;
            default:
                Main.debug("[FloorsFilterDialog.dataChangedOrAdded] Change type ("+type+") not managed");
                return;
            }
            
            for(AbstractDatasetChangedEvent e : events) {
                type = e.getType();

                Collection<? extends OsmPrimitive> prim = e.getPrimitives();
                Main.debug("[FloorsFilterDialog.dataChangedOrAdded] size: "+prim.size());
                
                switch(type) {
                case PRIMITIVES_ADDED:
                    for(OsmPrimitive p : prim) {
                        Main.debug("[FloorsFilterDialog.dataChangedOrAdded] p: "+p.getName()+" "+p.getPrimitiveId()+" type: "+type);
                        
                        if(p instanceof Relation) {
                            // New graph, refresh treeGraph
                            // FIXME: this deselect the graph
                            // I could preserve selection in rebuild
                            //build(false);
                        } else {
                            
                            // Only in IndoorGML mode I'll manage graphs
                            if(getLayerType() == LayerType.IGML) {
                                // Node or Way
                                Relation graph = getActiveGraph();
                                
                                int level = getCurrentLevel();
                                
                                // Check if the graph is selected 
                                if(null == graph || !isDefinedLevel(level)) {
                                    // Remove also linked primitives (Ways linked to Node, I hope)
                                    for(OsmPrimitive lp : p.getReferrers()) {
                                        PescePlugin.ds.removePrimitive(lp);
                                    }
                                    PescePlugin.ds.removePrimitive(p); // Wrong way to do this
                                    
                                    JOptionPane.showMessageDialog(null,"You must select a graph and a level");
                                    return;
                                } else {
                                    Main.debug("[FloorsFilterDialog.dataChangedOrAdded] Active graph: "+graph.getPrimitiveId().getUniqueId());
                                    // TODO: add the node/transition to level
                                    
                                    // Add the node/transition to the graph
                                    if (p instanceof Node) {
                                        addToGraph((Node) p, graph);
                                    } else if (p instanceof Way) {
                                        addToGraph((Way) p, graph);
                                    } else {
                                        //BUG
                                    }
                                    addToLevel(p, level);
                                }
                                
                                // Test: add the connected relations the level
                                for(OsmPrimitive pr : p.getReferrers()) {
                                    if(pr instanceof Way && null == pr.get(Constants.OSM_KEY_LEVEL) ) {
                                        addToLevel(pr, level);                                        
                                    }
                                }
                                
                                // Batch insert mode
                                Main.debug("[dataChangedOrAdded.PRIMITIVES_ADDED] ESC"); 
                                pressEscape();
                                
                            } else {
                                Main.debug("[FloorsFilterDialog.dataChangedOrAdded] Buildings mode. Do nothing");
                            }
                            
                            // This is a sort of debug
                            p.put("name", String.valueOf(p.getPrimitiveId().getUniqueId()));
                            // Test: add the name to the connected ways
                            for(OsmPrimitive pr : p.getReferrers()) {
                                if(!(pr instanceof Relation) && null == pr.getName()) {
                                    pr.put("name", String.valueOf(pr.getPrimitiveId().getUniqueId()));
                                }
                            }
                            
                        }
                    }
                    // Add the new primitive to the gui
                    build(false,true); // same dataSet, save trees selections
                    break;
//                case CHANGESET_ID_CHANGED:
//                    break;
//                case DATA_CHANGED:
//                    break;
//                case NODE_MOVED:
//                    break;
//                case PRIMITIVES_REMOVED:
//                    break;
//                case RELATION_MEMBERS_CHANGED:
//                    break;
                case TAGS_CHANGED:
                    // Batch insert mode
                    for(OsmPrimitive p : event.getPrimitives()) {
                        if(p instanceof Way) {
                            Main.debug("[dataChangedOrAdded.TAGS_CHANGED] ESC"); 
                            pressEscape();
                            break;
                        }    
                    }
                    break;
//                case WAY_NODES_CHANGED:
//                    break;
                default:
                    Main.debug("[FloorsFilterDialog.dataChangedOrAdded] Change type ("+type+") not managed");
                    
                    Main.debug("[FloorsFilterDialog.dataChangedOrAdded] #primitives "+e.getPrimitives().size());
                    int i=0;
                    for(OsmPrimitive p : e.getPrimitives()) {
                        if(i++>3) break;
                        Main.debug("[FloorsFilterDialog.dataChangedOrAdded] "+i+" p type: "+(p instanceof Node ? "Node" : (p instanceof Way ? "Way" : "Relation")));
                        Main.debug("[FloorsFilterDialog.dataChangedOrAdded] "+i+" p id: "+p.getPrimitiveId().getUniqueId());
                    }
                    return;
                }
            }
        }
    }
    
    public LayerType getLayerType() {
        if(null == dsToType) {
            return null;
        }
        return dsToType.get(PescePlugin.ds);
    }
    public void setLayerType(LayerType layerType) {
        if(null == dsToType) {
            dsToType = new HashMap<>();
        }
        dsToType.put(PescePlugin.ds, layerType);
    }

    // TODO: Move from here
    /**
     * @return Can be null
     */
    public Relation getActiveGraph() {
        if(0 == treeGraphs.getSelectionCount()) {
            return null;
        }
        TreePath selected = treeGraphs.getSelectionPath();
        if(2 != selected.getPathCount()) {
            // An element is selected, but it is not a graph
            return null;
        }
        PrimitiveUserObject userObj = (PrimitiveUserObject) ((DefaultMutableTreeNode) selected.getLastPathComponent()).getUserObject();
        return (Relation) PescePlugin.ds.getPrimitiveById(userObj.id);
    }
    
    public int getCurrentLevel() {
        TreePath selected = tree.getSelectionPath();
        if(0 == tree.getSelectionCount() || 2 != selected.getPathCount()) {
            return Constants.MISSEDLEVEL;
        }
        return stringToLevel((String)((FloorMutableTreeNode) selected.getLastPathComponent()).getUserObject());
    }
    
    public void addNewLevel(String newLevel) {
        
        FloorMutableTreeNode floor = new FloorMutableTreeNode(newLevel);
        DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();
        FloorMutableTreeNode root = (FloorMutableTreeNode) treeModel.getRoot();
        
        treeModel.insertNodeInto(floor, root, root.getChildCount());
        getNewLevels().add(Integer.parseInt(newLevel));
    }
    
    public boolean isDefinedLevel(int level) {
        return level != Constants.ALLLEVELS && level != Constants.PREVIOUSLEVEL && level != Constants.MISSEDLEVEL;
    }
    
    private String levelToString(int level) {
        switch(level) {
        case Constants.ALLLEVELS:
            return Constants.ALLLEVELS_STRING;
        case Constants.PREVIOUSLEVEL:
            return Constants.PREVIOUSLEVEL_STRING;
        case Constants.MISSEDLEVEL:
            return Constants.MISSEDLEVEL_STRING;
        default:
            return String.valueOf(level);
        }
    }
    private int stringToLevel(String level) {
        if(Constants.ALLLEVELS_STRING.equals(level)) {
            return Constants.ALLLEVELS;
        }
        if(Constants.PREVIOUSLEVEL_STRING.equals(level)) {
            return Constants.PREVIOUSLEVEL;
        }
        if(Constants.MISSEDLEVEL_STRING.equals(level)) {
            return Constants.MISSEDLEVEL;
        }
        return Integer.parseInt(level);
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
    public void primitivesRemoved(PrimitivesRemovedEvent event) {
        Main.debug("\t\tcc primitivesRemoved");
        event.wasComplete();
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

    // TODO: move from here
    public void addToGraph(Node n, Relation g) {
        if(!g.getMemberPrimitives().contains(n)) {
            Main.debug("> Add node to relation");
            g.addMember(new RelationMember(Constants.OSM_RELATION_ROLE_STATE, n));
            // WORKAROUND2: Add to the graph the ways linked to the node
            for(OsmPrimitive p : n.getReferrers(false)) {
                if(p instanceof Way) {
                    Main.debug("> I found a related way");
                    addToGraph((Way)p, g);
                }
            }
        }
    }
    // TODO: move from here
    public void addToGraph(Way t, Relation g) {
        if(!g.getMemberPrimitives().contains(t)) { 
            Main.debug("> Add way to relation");
            g.addMember(new RelationMember(Constants.OSM_RELATION_ROLE_TRANSITION, t));
        }
    }
    
    public void addToLevel(OsmPrimitive p, int level) {
        p.put(Constants.OSM_KEY_LEVEL, String.valueOf(level));
    }
    
    static public boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    
    static public class FloorMutableTreeNode extends DefaultMutableTreeNode implements Comparable<FloorMutableTreeNode> {

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
            boolean isXNumber = isNumber(x), isYNumber = isNumber(y);
            int r;
            //Main.debug("x="+x+" y="+y);
            if(isXNumber && isYNumber) {
                r = Integer.compare(Integer.parseInt(x), Integer.parseInt(y));
            } else if(!isXNumber && isYNumber) {
                r = Integer.compare(0, 1);
            } else if(isXNumber && !isYNumber) {
                r = Integer.compare(1, 0);
            } else {
                // String String
                r = x.compareTo(y);
            }
            return r;
        }
    }

    static public class PrimitiveUserObject {
        public String label;
        public PrimitiveId id;
        
        @Override
        public String toString() {
            return label;
        }
        
        public PrimitiveUserObject(PrimitiveId id, String label) {
            this.id = id;
            this.label = label;
        }
    }
    
    private Robot robot = null;

    private void pressEscape() {
        try {
            if (null == robot) {
                robot = new Robot();
            }
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e1) {
            e1.printStackTrace();
        }
    }
    
    private Map<JTree, Object[]> treesSelections = null;
    
    public Map<JTree, Object[]> getTreesSelections() {
        if(null == treesSelections) {
            treesSelections = new HashMap<>();
        }
        return treesSelections;
    }

    @SuppressWarnings("unchecked")
    private void saveTreeState(JTree tree) {

        if(null==tree) return;
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)tree.getModel().getRoot();
        
        Set<String> selected = new HashSet<>();
        
        Set<TreePath> selectedPaths = new HashSet<>();
        for(TreePath row : tree.getSelectionPaths()) {
            selectedPaths.add(row);
        }
        
        // Save selection
        for(Object node : Utils.iterable(root.depthFirstEnumeration())) {
            if(selectedPaths.contains(new TreePath(((DefaultMutableTreeNode)node).getPath()))) {
                String uo = ((DefaultMutableTreeNode)node).getUserObject().toString();
                selected.add(uo);
                Main.debug("[...saveSelection] selected uo: "+uo.toString());    
            }
        }
        
        // Save expansion
        Set<String> expandedNodesDepth1 = new HashSet<>();
        for(Object ch : Utils.iterable(root.children())) {
            
            if(tree.isExpanded(new TreePath(((DefaultMutableTreeNode)ch).getPath()))) {
                String uo = ((DefaultMutableTreeNode)ch).getUserObject().toString();
                expandedNodesDepth1.add(uo);
                Main.debug("[...saveSelection] expanded uo: "+uo.toString());    
            }
        }
        Main.debug("[...saveSelection] "+expandedNodesDepth1.size());
//        List<TreePath> expandedNodesDepth1 = Collections.list(tree.getExpandedDescendants(new TreePath(((DefaultMutableTreeNode)tree.getModel().getRoot()).getPath())));
//        Main.debug("[...saveSelection] "+expandedNodesDepth1.size());
//        for(TreePath p : expandedNodesDepth1) {
//            Main.debug("[...saveSelection] > "+p.toString());
//        }
        getTreesSelections().put(tree, new Object[] {selected, expandedNodesDepth1});
        
        // Plan B
//        tree.setSelectionPaths(null);
//        tree.getSelectionPaths();
        // Plan A
//        tree.setSelectionRows(null);
//        tree.getSelectionRows();
        
        
    }
    @SuppressWarnings("unchecked")
    private void restoreTreeState(JTree tree) {
        if(null==tree) return;
        Object[] o = getTreesSelections().get(tree);
        //tree.setSelectionPaths((TreePath[])o[0]);
        Set<String> selected = (Set<String>)o[0];
//        for(TreePath path : (List<TreePath>)o[1]) {
//            Main.debug("[...restoreSelection] > restoring >> "+path.toString());
//            tree.expandPath(path);
//        }
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)tree.getModel().getRoot();
        
        // Restore selection
        TreePath[] selectedPaths = new TreePath[selected.size()];
        int i=0;
        
        tree.setSelectionPaths(selectedPaths);
        
        for(Object node : Utils.iterable(root.depthFirstEnumeration())) {
            String repr = (String) ((DefaultMutableTreeNode)node).getUserObject().toString();
            if((selected.contains(repr))) {
                Main.debug("[...restoreSelection] uo: "+repr);
                selectedPaths[i++] = new TreePath(((DefaultMutableTreeNode)node).getPath()); 
                
            } else
                Main.debug("[...restoreSelection] !uo: "+repr.toString());
        }
        tree.setSelectionPaths(selectedPaths);
        
        // Restore expansion
        for(Object ch : Utils.iterable(root.children())) {
            String repr = (String) ((DefaultMutableTreeNode)ch).getUserObject().toString();
            if(((Set<String>)o[1]).contains(repr)) {
                Main.debug("[...restoreSelection] uo: "+repr);
                tree.expandPath(new TreePath(((DefaultMutableTreeNode)ch).getPath()));
            } else
                Main.debug("[...restoreSelection] !uo: "+repr.toString());
        }
    }
}
