// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce.dialogs;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.josm.pesce.Constants;
import it.trilogis.josm.pesce.FilterIndoorLevel;
import it.trilogis.josm.pesce.PescePlugin;
import it.trilogis.josm.pesce.PescePlugin.LayerType;
import it.trilogis.josm.pesce.PescePlugin.UploadInfo;
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
    private static final int TREEROOT = 1;
    private static final int TREEFLOOR = 2;
    private static final int TREESTATES = 3;

    public static final String IGMLLABEL = "IndoorGML mode";
    public static final String BUILDINLABEL = "Buildings mode"; 

    public static final String TREELABELALL = "All"; // TODO FloorsFilterDialog.TREELABELALL
    public static final String GRAPHSLABEL = "Graphs"; // TODO FloorsFilterDialog.GRAPHSLABEL

    final static String[] enableFiltersIcons = {"filter-off","filter-on"};
    final static String[] enableFiltershints = {"Enable filters", "Disable filters"};
    
    public static FloorsFilterDialog INSTANCE = null;
    
    private JTree tree = null; // Very final
    private JTree treeGraphs = null;
    
    // Edit mode
    private SideButton modeButton = null;
    private Map<DataSet,LayerType> dsToType = null;
   
    //final static private Set<String> specialFloors = new HashSet<>(Arrays.asList(new String[]{ TREELABELALL }));

    private FilterIndoorLevel filterLevel;
    

    private TreePath[] sp; // selected paths
    
    private List<Integer> newLevels = null;
    
    boolean rawCreationMode;
    
    // WORKAROUND
//    private long __events_to_ignore;

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
        rawCreationMode = false;
        sp = new TreePath[2];
        sp[0] = null;
        sp[1] = null;
        setIsButtonHiding(ButtonHidingType.ALWAYS_HIDDEN);
        filterLevel = new FilterIndoorLevel();
        build(false);
    }

    @Override
    public void showNotify() {
        DatasetEventManager.getInstance().addDatasetListener(this, FireMode.IN_EDT_CONSOLIDATED);
        build(false);
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

    private void build(boolean dataSetChanged) {

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

         
         //uploadButton.setPreferredSize(new Dimension(200, 100));
         
//         SideButton downButton = new SideButton(new AbstractAction() {
//             {
//                 //putValue(NAME, tr("Down"));
//                 //putValue(SHORT_DESCRIPTION, tr("Move filter down."));
//                 putValue(SMALL_ICON, ImageProvider.get("dialogs", "pin"));
//             }
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 Main.debug("PRESS down");
//             }
//         });
    //
//         downButton.setPreferredSize(new Dimension(100, 100));
            //this.add(new JLabel("Container doesn't use BorderLayout!"),BorderLayout.PAGE_START);
            //this.add(downButton,BorderLayout.CENTER);
         
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
             
             final JPanel buttonRowPanel = new JPanel(Main.pref.getBoolean("dialog.align.left", false)
                     ? new FlowLayout(FlowLayout.LEFT) : new GridLayout(1, 2));


             
             buttons(buttonRowPanel);
             
             this.add(buttonRowPanel,BorderLayout.SOUTH);

             //setIndoorgmlEditMode();
             
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
             
                          
//             this.add(uploadButton,BorderLayout.PAGE_END);
//             this.add(linkButton,BorderLayout.PAGE_END);  
//             
//             createLayout(this, true, Arrays.asList(new SideButton[] {
//                     uploadButton, linkButton
//             }));
             
            ///////////////////////////////////////
             
            treeModel = (DefaultTreeModel) tree.getModel();
            
        } else {
            Main.debug("get tree");
            treeModel = (DefaultTreeModel) tree.getModel();
            root = (FloorMutableTreeNode) treeModel.getRoot();
            removeNodes(root, treeModel);
            
        }

        FloorMutableTreeNode all = new FloorMutableTreeNode(TREELABELALL, false);
        treeModel.insertNodeInto(all, root, 0);

//        FloorMutableTreeNode fu1 = new FloorMutableTreeNode("-2"+new Random().nextInt(100));
//        FloorMutableTreeNode f0 = new FloorMutableTreeNode("10");
//        FloorMutableTreeNode f1 = new FloorMutableTreeNode("11");

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

        
        addFloorNodes(root, treeModel);

        root.sortChildren();

        //public void expandPath(TreePath path)
        tree.expandPath(new TreePath(root.getPath()));
//        @SuppressWarnings("unchecked")
//        Enumeration<FloorMutableTreeNode> e = root.children();
//        while (e.hasMoreElements()) {
//            tree.makeVisible(new TreePath(e.nextElement().getPath()));
//        }

        
        // Compile Graphs part
        if(null != PescePlugin.ds) {
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
        } else {
            //Main.debug("[FloorsFilterDialog.build] DataSet not defined yet");
        }
        Main.debug("[...build] End of build()");
    }
    
    private void buttons(final JPanel panel) {

        SideButton refreshButton = new SideButton(new AbstractAction() {
            {
                //putValue(NAME, tr(""));
                putValue(SHORT_DESCRIPTION, tr("Redraw the plugin interface"));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", "refresh"));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                build(false);
            }
            
        });
        
        SideButton enableFiltersButton = new SideButton(new AbstractAction() {
            
            boolean filtersEnabled;
            {
                filtersEnabled = true;
                //putValue(NAME, tr(""));
                putValue(SHORT_DESCRIPTION, tr(enableFiltershints[1]));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", enableFiltersIcons[1]));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                filtersEnabled = !filtersEnabled;
                filterLevel.setEnabled(filtersEnabled);
                putValue(SHORT_DESCRIPTION, tr(enableFiltershints[filtersEnabled ? 1 : 0]));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", enableFiltersIcons[filtersEnabled ? 1 : 0]));
                build(false);
            }
            
        });
        
        SideButton uploadButton = Constants.COMO ? null : new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("Upload"));
                putValue(SHORT_DESCRIPTION, tr("Upload all layers to {0}", "i-locate"));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", "up"));
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Main.debug("Upload all datasets!");

                for (UploadInfo info : PescePlugin.getUploadInfo()) {
                    Main.debug("[FloorsFilterDialog.uploadButton.actionPerformed] " + info.layerName + " " + info.dataSet.toString());
                    IlocateUploadTask task = new IlocateUploadTask(info.layerName, NullProgressMonitor.INSTANCE, false);

                    Main.worker.submit(task);
                }

                //filterLevel.show(Constants.PREVIOUSLEVEL);

                if (Main.isDisplayingMapView()) {
                    Main.map.mapView.repaint();
                    /// Main.map.filterDialog.updateDialogHeader();
                }
            }
        });

        SideButton linkButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("Link"));
                putValue(SHORT_DESCRIPTION, tr("Select 2 states and link them"));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", "linknodes"));
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Main.debug("[FloorsFilterDialog.linkButton.actionPerformed] Create a link");

                // TODO: take the 2 selected nodes and create a link 
                TreePath[] paths = tree.getSelectionPaths();
                if (2 == tree.getSelectionCount() && paths[0].getPathCount() == TREESTATES && paths[1].getPathCount() == TREESTATES) {
                    // GOOD
                    PrimitiveUserObject treeNode1 = (PrimitiveUserObject) ((FloorMutableTreeNode) paths[0].getLastPathComponent()).getUserObject();
                    PrimitiveUserObject treeNode2 = (PrimitiveUserObject) ((FloorMutableTreeNode) paths[1].getLastPathComponent()).getUserObject();

                    // TODO: link them

                    Main.debug(treeNode1 + "," + treeNode2);

                    Node node1 = (Node) PescePlugin.ds.getPrimitiveById(treeNode1.id);
                    Node node2 = (Node) PescePlugin.ds.getPrimitiveById(treeNode2.id);

                    Relation relation1 = null, relation2 = null;
                    // Problem:
                    // The link between A and B has to be unique
                    // And belong to the same graph
                    Set<Long> node1Ways = new HashSet<>(), node2Ways = new HashSet<>();
                    for (OsmPrimitive ref : node1.getReferrers()) {
                        if (ref instanceof Way) {
                            node1Ways.add(ref.getUniqueId());
                        } else if (ref instanceof Relation) {
                            // This has to be unique
                            if (null != relation1) {
                                Main.warn("[...linkButton.actionPerformed] The node belongs to more than one relation.");
                            }
                            relation1 = (Relation) ref;
                        }
                    }
                    for (OsmPrimitive ref : node2.getReferrers()) {
                        if (ref instanceof Way) {
                            node2Ways.add(ref.getUniqueId());
                        } else if (ref instanceof Relation) {
                            // This has to be unique
                            if (null != relation2) {
                                Main.warn("[...linkButton.actionPerformed] The node belongs to more than one relation.");
                            }
                            relation2 = (Relation) ref;
                        }
                    }

                    // Check the format
                    if (null == relation1 || null == relation2) {
                        Main.warn("[...linkButton.actionPerformed] node1 or node2 doesn't have a Graph");
                        // TODO: create a message for the user: node1 or node2 doesn't have a Graph
                        return;
                    }
                    if (relation1 != relation2) {
                        Main.warn("[...linkButton.actionPerformed] relation1 and relation2 are different. Wrong data format");
                        // TODO: create a message for the user: relation1 and relation2 are different. Wrong data format
                        return;
                    }

                    if (Collections.disjoint(node1Ways, node2Ways)) {

                        Way link = new Way();

                        link.addNode(node1);
                        link.addNode(node2);

                        // IL -> InterLayer 
                        // Lexically order the names
                        rawCreationMode = true;
                        link.put("name", "IL" + (node1.getName().compareTo(node2.getName()) < 0 ? node1.getName() + node2.getName() : node2.getName() + node1.getName()));
                        link.put(Constants.OSM_KEY_LEVEL, chooseLevel(node1, node2));

//                     Main.debug("ZZZ "+ds.getRelations().contains(relation1));
//                     Main.debug("ZZZ "+ds.getNodes().contains(node1));
//                     Main.debug("ZZZ "+ds.getNodes().contains(node2));
//                     Main.debug("ZZZ "+ds.getWays().contains(link));

                       PescePlugin.ds.addPrimitive(link);

//                     Main.debug("ZZZ "+ds.getWays().contains(link));
//
//                     Main.debug("XXX "+ds.isSelected(relation1));
//                     Main.debug("XXX "+ds.isSelected(node1));
//                     Main.debug("XXX "+ds.isSelected(node2));

                        // Add link to relation1/2
                        relation1.addMember(new RelationMember(Constants.OSM_RELATION_ROLE_TRANSITION, link));

                    } else {
                        // TODO: create a message for the user: this link exists yet.
                        Main.debug("[FloorsFilterDialog.linkButton.actionPerformed] This link exists yet");
                    }

                } else {
                    // TODO error message
                    Main.debug("Quality or quantity of selectec features aren't suitable to create a link. Number: " + tree.getSelectionCount());
                }

                //filterLevel.show(Constants.PREVIOUSLEVEL);

                if (Main.isDisplayingMapView()) {
                    Main.map.mapView.repaint();
                }
            }
        });

        SideButton newGraphButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("New graph"));
                putValue(SHORT_DESCRIPTION, tr("Add a new IndoorGML graph"));
                //putValue(SMALL_ICON, ImageProvider.get("dialogs", "newgraph"));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter the graph name");
                if(null != name) {
                    // TODO: check null pointer exception?
                    DefaultMutableTreeNode rootGraphs = (DefaultMutableTreeNode) treeGraphs.getModel().getRoot();
                    
                    Relation graph = new Relation();
                    graph.put("name", name); // TODO: inser all Indoor graph here. TODO TODO: Create a newIndoorGraph somewhere
                    graph.put("type", Constants.OSM_RELATION_TYPE_SPACELAYER); 
                    PescePlugin.ds.addPrimitive(graph);
                    
                    rootGraphs.add(new DefaultMutableTreeNode(new PrimitiveUserObject(graph.getPrimitiveId(), graph.getName())));
                    // Refresh the gui
                    build(false);
                }
            }

        });
        
        SideButton newLevelButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("New level"));
                putValue(SHORT_DESCRIPTION, tr("Add a new indoor level"));
                //putValue(SMALL_ICON, ImageProvider.get("dialogs", "??"));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLevel = JOptionPane.showInputDialog("Enter the new level");
                if(null != inputLevel) {
                    if(!isNumber(inputLevel)) {
                        JOptionPane.showMessageDialog(null, "Level must be integer");
                        return;
                    }
                    
                    
                    addNewLevel(inputLevel);
                 // TODO: put these 5 lines into a method! (newLevel)
//                    FloorMutableTreeNode floor = new FloorMutableTreeNode(inputLevel);
//                    DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();
//                    FloorMutableTreeNode root = (FloorMutableTreeNode) treeModel.getRoot();
//                    treeModel.insertNodeInto(floor, root, root.getChildCount());
//                    getNewLevels().add(Integer.parseInt(inputLevel));
                }
            }

            
        });
        
        SideButton newLayerButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("New layer"));
                putValue(SHORT_DESCRIPTION, tr("Add a new JOSM layer"));
                //putValue(SMALL_ICON, ImageProvider.get("dialogs", "newgraph"));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter the layer name");
                if(null != name) {
                    if (name.isEmpty()) {
                        name = OsmDataLayer.createNewName();
                    }
                    DataSet ds;
                    OsmDataLayer layer = new OsmDataLayer(ds = new DataSet(), name, null);
                    ds.setUploadDiscouraged(true); // Do not upload these data. (It does not seem useful)
                    Main.main.addLayer(layer); // null -> computeBbox(bounds)
                }
            }

        });
        
        modeButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr(IGMLLABEL));
                putValue(SHORT_DESCRIPTION, tr("Set the type of active layer"));
                // putValue(SMALL_ICON, ImageProvider.get("dialogs", "newgraph"));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                // First time:
                LayerType type = getLayerType();
                if(null == type) {
                    setLayerType(LayerType.IGML);
                    type = LayerType.IGML;
                }
                
                switch(type) {
                case IGML:
                    setLayerType(LayerType.BUILDING);
                    putValue(NAME, tr(BUILDINLABEL));
                    break;
                case BUILDING:
                    setLayerType(LayerType.IGML);
                    putValue(NAME, tr(IGMLLABEL));
                    break;
                } 
            }

        });
        
        final JPanel gridPanel = new JPanel(new GridLayout(2, 4)); 
        panel.add(gridPanel);
        
        gridPanel.add(refreshButton);
        gridPanel.add(enableFiltersButton);
        gridPanel.add(linkButton);
        if(!Constants.COMO) {
            gridPanel.add(uploadButton);
        } else {
            gridPanel.add(new JLabel());
        }
        gridPanel.add(modeButton);
        gridPanel.add(newGraphButton);
        gridPanel.add(newLevelButton);
        gridPanel.add(newLayerButton);
    }
    
    String chooseLevel(Node a, Node b) {
        String l = a.get(Constants.OSM_KEY_LEVEL);
        String m = b.get(Constants.OSM_KEY_LEVEL);
        if(null == l)
            return m;
        if(null == m)
            return l;
        return Integer.parseInt(l) < Integer.parseInt(m) ? l : m;
    }
    
    private List<Integer> getNewLevels() {
        if(null == newLevels) {
            newLevels = new ArrayList<>();
        }
        return newLevels;
    }
    
    // Edit mode manipulation
    public void setBuildingsEditMode() {
        if(null != modeButton && null != modeButton.getAction()) {
            modeButton.getAction().putValue(Action.NAME, BUILDINLABEL);
            setLayerType(LayerType.BUILDING);
        }
    }


    public void setIndoorgmlEditMode() {
        if(null != modeButton && null != modeButton.getAction()) {
            modeButton.getAction().putValue(Action.NAME, IGMLLABEL);
            setLayerType(LayerType.IGML);
        }
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
            build(true);
        } else {
            type = event.getType();
            // The DataSet is ok, what did it change?
            Main.debug("[FloorsFilterDialog.dataChangedOrAdded] The DataSet is ok, what did it change?");
            Main.debug("[FloorsFilterDialog.dataChangedOrAdded] type: "+type);
            Main.debug("[FloorsFilterDialog.dataChangedOrAdded] size: "+event.getPrimitives().size());
            
            boolean primitivesAddedRootEvent = false;
            Collection<AbstractDatasetChangedEvent> events;
            switch(type) {
            case PRIMITIVES_ADDED:
                primitivesAddedRootEvent = true;
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

                
                // WORKAROUND
//                if(__events_to_ignore >0) {
//                    
//                    __events_to_ignore--;
//                    if(type != DatasetEventType.PRIMITIVES_ADDED && type != DatasetEventType.RELATION_MEMBERS_CHANGED) {
//                        Main.debug("\t\tWORKAROUND: ignore this event. type: "+type+" __: "+__events_to_ignore);
//                        return;
//                    } else {
//                        Main.debug("\t\tWORKAROUND: don't skip this because of type. "+__events_to_ignore);
//                    }
//                }
                
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
    
    private LayerType getLayerType() {
        if(null == dsToType) {
            return null;
        }
        return dsToType.get(PescePlugin.ds);
    }
    private void setLayerType(LayerType layerType) {
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
    
    private void addNewLevel(String newLevel) {
        
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
    
    static private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch(Exception e) {
            return false;
        }
        return true;
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

    static private class PrimitiveUserObject {
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
            if(null == robot) {
                robot = new Robot();   
            }

//        new Thread(new Runnable() {
//            
//            @Override
//            public void run() {
//                try {
//                    // TODO Auto-generated method stub
//                    Thread.sleep(500);
//            // Simulate a key press
//
//                } catch (InterruptedException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//                
//            }
//        }).start();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

        } catch (AWTException e1) {
            e1.printStackTrace();
        }
    }
}
