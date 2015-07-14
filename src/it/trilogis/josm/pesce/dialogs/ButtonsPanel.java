package it.trilogis.josm.pesce.dialogs;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.josm.pesce.Constants;
import it.trilogis.josm.pesce.PescePlugin;
import it.trilogis.josm.pesce.PescePlugin.LayerType;
import it.trilogis.josm.pesce.PescePlugin.UploadInfo;
import it.trilogis.josm.pesce.dialogs.FloorsFilterDialog.FloorMutableTreeNode;
import it.trilogis.josm.pesce.dialogs.FloorsFilterDialog.PrimitiveUserObject;
import it.trilogis.josm.pesce.serverconnection.IlocateUploadTask;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.gui.SideButton;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.progress.NullProgressMonitor;
import org.openstreetmap.josm.tools.ImageProvider;

public class ButtonsPanel extends JPanel {
    
    private static final String IGMLLABEL = "IndoorGML mode";
    private static final String BUILDINLABEL = "Buildings mode"; 
    private static final String[] enableFiltersIcons = {"filter-off","filter-on"};
    private static final String[] enableFiltershints = {"Enable filters", "Disable filters"};
    
    private FloorsFilterDialog dialog;
    
    private SideButton refreshButton;
    private SideButton enableFiltersButton;
    private SideButton linkButton;
    private SideButton uploadButton;
    private SideButton modeButton = null;
    private SideButton newGraphButton;
    private SideButton newLevelButton;
    private SideButton newLayerButton;
    
    public ButtonsPanel(FloorsFilterDialog dialog) {
        super(new GridLayout(2, 4));
        this.dialog = dialog;
        
        build();
        addButtons();
    }
    
    private void build() {
        

        refreshButton = new SideButton(new AbstractAction() {
            {
                //putValue(NAME, tr(""));
                putValue(SHORT_DESCRIPTION, tr("Redraw the plugin interface"));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", "refresh"));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.build(false);
            }
            
        });
        
        enableFiltersButton = new SideButton(new AbstractAction() {
            
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
                dialog.getFilterLevel().setEnabled(filtersEnabled);
                putValue(SHORT_DESCRIPTION, tr(enableFiltershints[filtersEnabled ? 1 : 0]));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", enableFiltersIcons[filtersEnabled ? 1 : 0]));
                dialog.build(false);
            }
            
        });
        
        uploadButton = Constants.COMO ? null : new SideButton(new AbstractAction() {
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

        linkButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("Link"));
                putValue(SHORT_DESCRIPTION, tr("Select 2 states and link them"));
                putValue(SMALL_ICON, ImageProvider.get("dialogs", "linknodes"));
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Main.debug("[FloorsFilterDialog.linkButton.actionPerformed] Create a link");

                // TODO: take the 2 selected nodes and create a link 
                TreePath[] paths = dialog.getTree().getSelectionPaths();
                if (2 == dialog.getTree().getSelectionCount() && paths[0].getPathCount() == FloorsFilterDialog.TREESTATES && paths[1].getPathCount() == FloorsFilterDialog.TREESTATES) {
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

                        // Select the level and the graph of the new link
                        
                        dialog.getTree().setSelectionPath(paths[0].getParentPath());
                        DefaultMutableTreeNode rootGraphs = (DefaultMutableTreeNode) dialog.getTreeGraphs().getModel().getRoot();
                        
                        @SuppressWarnings("unchecked")
                        Enumeration<DefaultMutableTreeNode> ee = rootGraphs.children();
                        while (ee.hasMoreElements()) {
                            DefaultMutableTreeNode node = ee.nextElement();
                            if (((PrimitiveUserObject)node.getUserObject()).id.equals(relation1.getPrimitiveId())) {
                                dialog.getTreeGraphs().setSelectionPath(new TreePath(node.getPath()));
                                break;
                            }
                        }
                        //treeGraphs.setSelectionPath(getTreePath(relation1)); // TODO TODO TODO
                        
                        Way link = new Way();

                        link.addNode(node1);
                        link.addNode(node2);

                        // IL -> InterLayer 
                        // Lexically order the names
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
                       // It is not needed anymore thanks to Batch insert
                       //relation1.addMember(new RelationMember(Constants.OSM_RELATION_ROLE_TRANSITION, link));

                    } else {
                        // TODO: create a message for the user: this link exists yet.
                        Main.debug("[FloorsFilterDialog.linkButton.actionPerformed] This link exists yet");
                    }

                } else {
                    // TODO error message
                    Main.debug("Quality or quantity of selectec features aren't suitable to create a link. Number: " + dialog.getTree().getSelectionCount());
                }

                //filterLevel.show(Constants.PREVIOUSLEVEL);

                if (Main.isDisplayingMapView()) {
                    Main.map.mapView.repaint();
                }
            }
        });

        newGraphButton = new SideButton(new AbstractAction() {
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
                    DefaultMutableTreeNode rootGraphs = (DefaultMutableTreeNode) dialog.getTreeGraphs().getModel().getRoot();
                    
                    Relation graph = new Relation();
                    graph.put("name", name); // TODO: inser all Indoor graph here. TODO TODO: Create a newIndoorGraph somewhere
                    graph.put("type", Constants.OSM_RELATION_TYPE_SPACELAYER); 
                    PescePlugin.ds.addPrimitive(graph);
                    
                    rootGraphs.add(new DefaultMutableTreeNode(new PrimitiveUserObject(graph.getPrimitiveId(), graph.getName())));
                    // Refresh the gui
                    dialog.build(false);
                }
            }

        });
        
        newLevelButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("New level"));
                putValue(SHORT_DESCRIPTION, tr("Add a new indoor level"));
                //putValue(SMALL_ICON, ImageProvider.get("dialogs", "??"));
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLevel = JOptionPane.showInputDialog("Enter the new level");
                if(null != inputLevel) {
                    if(!FloorsFilterDialog.isNumber(inputLevel)) {
                        JOptionPane.showMessageDialog(null, "Level must be integer");
                        return;
                    }
                    
                    
                    dialog.addNewLevel(inputLevel);
                 // TODO: put these 5 lines into a method! (newLevel)
//                    FloorMutableTreeNode floor = new FloorMutableTreeNode(inputLevel);
//                    DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();
//                    FloorMutableTreeNode root = (FloorMutableTreeNode) treeModel.getRoot();
//                    treeModel.insertNodeInto(floor, root, root.getChildCount());
//                    getNewLevels().add(Integer.parseInt(inputLevel));
                }
            }

            
        });
        
        newLayerButton = new SideButton(new AbstractAction() {
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
                LayerType type = dialog.getLayerType();
                if(null == type) {
                    dialog.setLayerType(LayerType.IGML);
                    type = LayerType.IGML;
                }
                
                switch(type) {
                case IGML:
                    dialog.setLayerType(LayerType.BUILDING);
                    putValue(NAME, tr(BUILDINLABEL));
                    break;
                case BUILDING:
                    dialog.setLayerType(LayerType.IGML);
                    putValue(NAME, tr(IGMLLABEL));
                    break;
                } 
            }

        });
    }
    
    private void addButtons() {
        add(refreshButton);
        add(enableFiltersButton);
        add(linkButton);
        if(!Constants.COMO) {
            add(uploadButton);
        } else {
            add(new JLabel());
        }
        add(modeButton);
        add(newGraphButton);
        add(newLevelButton);
        add(newLayerButton);      
    }
    
    static String chooseLevel(Node a, Node b) {
        String l = a.get(Constants.OSM_KEY_LEVEL);
        String m = b.get(Constants.OSM_KEY_LEVEL);
        if(null == l)
            return m;
        if(null == m)
            return l;
        return Integer.parseInt(l) < Integer.parseInt(m) ? l : m;
    }

    public void setModeButtonBuildingsEditMode() {
        if(null != modeButton && null != modeButton.getAction()) {
            modeButton.getAction().putValue(Action.NAME, BUILDINLABEL);
        }
    }
    public void setModeButtonIndoorgmlEditMode() {
        if(null != modeButton && null != modeButton.getAction()) {
            modeButton.getAction().putValue(Action.NAME, IGMLLABEL);
        }
    }
}
