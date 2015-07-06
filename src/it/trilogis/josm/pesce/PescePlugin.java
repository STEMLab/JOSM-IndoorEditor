// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import it.trilogis.josm.pesce.dialogs.FloorsFilterDialog;
import it.trilogis.josm.pesce.serverconnection.IlocateImporter;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.FilterMatcher;
import org.openstreetmap.josm.gui.MapFrame;
import org.openstreetmap.josm.gui.layer.Layer;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.preferences.PreferenceSetting;
import org.openstreetmap.josm.io.FileExporter;
import org.openstreetmap.josm.io.FileImporter;
import org.openstreetmap.josm.io.remotecontrol.RemoteControl;
import org.openstreetmap.josm.io.remotecontrol.RequestProcessor;
import org.openstreetmap.josm.io.remotecontrol.handler.ImportHandler;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;
import org.openstreetmap.josm.actions.ExtensionFileFilter;

// Example -> http://127.0.0.1:8111/import?url=http://pastebin.com/raw.php?i=LV52bAAn

public class PescePlugin extends Plugin {
    
    private FloorsFilterDialog dialog;
    
    static private List<UploadInfo> uploadInfo = null;
    static PescePlugin instance = null;
    
    public PescePlugin() {
        super(null);
    }
    
    public PescePlugin(final PluginInformation info) {
        super(info);
        //MainMenu.add(Main.main.menu.moreToolsMenu, new SimplifyAreaAction());
        
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalAccessError("Cannot instantiate plugin twice !");
        }
        
        FileImporter importer = new PesceImporter();
        FileExporter exporter = new PesceExporter();
        
        ExtensionFileFilter.importers.add(importer);
        ExtensionFileFilter.exporters.add(exporter);

        new RemoteControl().addRequestHandler(
                SetContextHandler.command,
                SetContextHandler.class);
        
        new RemoteControl().addRequestHandler(
                IlocateImporter.command,
                IlocateImporter.class);
        
        //FilterIndoorLevel filter = new FilterIndoorLevel();
    }
    
    @Override
    public PreferenceSetting getPreferenceSetting() {
        return null;
        //return new SimplifyAreaPreferenceSetting();
    }
    
    @Override
    public void mapFrameInitialized(MapFrame oldFrame, MapFrame newFrame) {
        Main.debug(String.format("Signal: mapFrameInitialized %s %s", null==oldFrame ? "null" : "defined", null==newFrame ? "null" : "defined"));
        
        // if new frame is just created
        if(null==oldFrame && null!=newFrame) {
          newFrame.addToggleDialog(dialog = new FloorsFilterDialog());    
        } else if(null!=oldFrame && null==newFrame) {
            // destroy dialog. Is this needed? FIXME
            //dialog.destroy();    
          } 
        
    }
    
    // Save here information about downloaded layers
    public static enum LayerType {
        IGML,
        GEOJSON
    }
    public static List<UploadInfo> getUploadInfo() {
        if(null == uploadInfo) {
            uploadInfo = new ArrayList<>();
        }
        return uploadInfo;
    }
    
    public static void addUploadInfo(String layerName, DataSet dataSet, String url, LayerType type) {
        Main.debug("[PescePlugin.addUploadInfo] "+layerName+" "+dataSet.toString()+" "+url);
        getUploadInfo().add(new UploadInfo(layerName, dataSet, url, type));
    }
    
    public static class UploadInfo {
        public String layerName;
        public DataSet dataSet;
        public String url;
        public LayerType type;
        public UploadInfo(String layerName, DataSet dataSet, String url, LayerType type) {
            this.layerName = layerName;
            this.dataSet = dataSet;
            this.url = url;
            this.type = type;
        }
    }
    
    // Utility
    
    
    static public OsmDataLayer getLayer(DataSet data) {
        if (!Main.isDisplayingMapView()) return null;
        Collection<Layer> layers = Main.map.mapView.getAllLayersAsList();
        for (Layer layer : layers) {
            if (layer instanceof OsmDataLayer && ((OsmDataLayer) layer).data==data)
                return (OsmDataLayer) layer;
        }
        return null;
    }
}
