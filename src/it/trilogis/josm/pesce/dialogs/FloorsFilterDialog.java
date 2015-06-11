// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce.dialogs;


import static org.openstreetmap.josm.tools.I18n.tr;
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
import java.util.HashSet;
import java.util.List;
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
import javax.swing.tree.TreePath;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.search.SearchAction;
import org.openstreetmap.josm.data.osm.Filter;
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
    
    public static final String TREELABELALL = "All"; // FloorsFilterDialog.TREELABELALL
    
    private FilterIndoorLevel filterLevel;
    
 /**
  * Constructs a new {@code FilterDialog}
  */
 public FloorsFilterDialog() {
     super(tr("Floors selector"), "floors", tr("Select the floor to view"),
             null, 162);
     setIsButtonHiding(ButtonHidingType.ALWAYS_HIDDEN);
     filterLevel = new FilterIndoorLevel();
     build();
 }

 @Override
 public void showNotify() {
    DatasetEventManager.getInstance().addDatasetListener(this, FireMode.IN_EDT_CONSOLIDATED);

 }

 @Override
 public void hideNotify() {
     DatasetEventManager.getInstance().removeDatasetListener(this);
     Main.map.mapView.repaint();
 }

 protected void build() {

     FloorMutableTreeNode root = new FloorMutableTreeNode("Floors",true);
     
     FloorMutableTreeNode all = new FloorMutableTreeNode(TREELABELALL,false);
     
     FloorMutableTreeNode fu1 = new FloorMutableTreeNode("-1",true);
     FloorMutableTreeNode f0 = new FloorMutableTreeNode("0",true);
     FloorMutableTreeNode f1 = new FloorMutableTreeNode("1",true);
     
     final JTree tree = new JTree(root);
     
     root.add(all);
     root.add(f0);
     f0.add(new FloorMutableTreeNode("Example Fake Node",false));
     root.add(f1);
     f1.add(new FloorMutableTreeNode("Example Fake Node",false));
     f1.add(new FloorMutableTreeNode("Example Fake Node",false));
     f1.add(new FloorMutableTreeNode("Example Fake Node",false));
     root.add(fu1);
     fu1.add(new FloorMutableTreeNode("Example Fake Node",false));
     fu1.add(new FloorMutableTreeNode("Example Fake Node",false));
     
     tree.setShowsRootHandles(true);
     tree.setRootVisible(false);
     
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
             Main.debug("[valueChanged] "+((String)((FloorMutableTreeNode)p.getLastPathComponent()).getUserObject()));
             
             DefaultMutableTreeNode floorNode = (DefaultMutableTreeNode)p.getPath()[TREEFLOOR-1];
             
             String label = (String)floorNode.getUserObject();
             
             Main.debug(label);

             Integer level;
             if(FloorsFilterDialog.TREELABELALL.equals(label)) {
                 // Do not filter levels
                 level = null;
             } else {
                 level = Integer.parseInt(label);
             }
             if(null != filterLevel) {
                 filterLevel.show(level);
             } else {
                 Main.error("WTF: filterLevel == null");
             }
             
             if(p.getPathCount() > TREEFLOOR) {
                 // TODO: The level 3 () is selected: the state
                 Main.debug("D: You are clicking fake states");
             }
         }
     });
     
//     SideButton addButton = new SideButton(new AbstractAction() {
//         {
//             //putValue(NAME, tr("Add"));
//             //putValue(SHORT_DESCRIPTION,  tr("Add filter."));
//             putValue(SMALL_ICON, ImageProvider.get("dialogs","floors"));
//         }
//         @Override
//         public void actionPerformed(ActionEvent e) {
//             Main.debug("PRESS add");
//         }});
//     addButton.setPreferredSize(new Dimension(200, 100));
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
     add(tree,BorderLayout.CENTER);
//     this.add(downButton,BorderLayout.PAGE_END);

 }

 @Override
 public void destroy() {
     super.destroy();
 }



 /**
  * Returns the list of primitives whose filtering can be affected by change in primitive
  * @param primitives list of primitives to check
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
             for (OsmPrimitive n: ((Way)p).getNodes()) {
                 stack.push(n);
             }
         } else if (p instanceof Relation) {
             for (RelationMember rm: ((Relation)p).getMembers()) {
                 stack.push(rm.getMember());
             }
         }

         for (OsmPrimitive ref: p.getReferrers()) {
             stack.push(ref);
         }
     }

     return result;
 }

 @Override
 public void dataChanged(DataChangedEvent event) {
     Main.debug("\t\ta");
 }

 @Override
 public void nodeMoved(NodeMovedEvent event) {
     // Do nothing
 }

 @Override
 public void otherDatasetChange(AbstractDatasetChangedEvent event) {
     Main.debug("\t\tb");
 }

 @Override
 public void primitivesAdded(PrimitivesAddedEvent event) {
     Main.debug("\t\tc");
 }

 @Override
 public void primitivesRemoved(PrimitivesRemovedEvent event) {
 }

 @Override
 public void relationMembersChanged(RelationMembersChangedEvent event) {
     Main.debug("\t\td");
 }

 @Override
 public void tagsChanged(TagsChangedEvent event) {
     Main.debug("\t\te");
 }

 @Override
 public void wayNodesChanged(WayNodesChangedEvent event) {
     Main.debug("\t\tf");
 }

 static private class FloorMutableTreeNode extends DefaultMutableTreeNode implements Comparable<FloorMutableTreeNode> {

    public FloorMutableTreeNode(Object userObject, boolean allowsChildren) {
        super(userObject, allowsChildren);
    }
    
    @SuppressWarnings("unchecked")
    void sortChildren() {
        Collections.sort((List<FloorMutableTreeNode>)children);
    }

    @Override
    public int compareTo(FloorMutableTreeNode o) {
        String x = (String)this.getUserObject();
        String y = (String)o.getUserObject();
        
        if(FloorsFilterDialog.TREELABELALL.equals(x)) {
            return -1;
        }
        if(FloorsFilterDialog.TREELABELALL.equals(y)) {
            return 1;
        }  
        return Integer.compare(Integer.parseInt(x), Integer.parseInt(y));
    }
 }
 
}
