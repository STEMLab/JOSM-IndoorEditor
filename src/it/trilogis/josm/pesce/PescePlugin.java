// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce;

import org.openstreetmap.josm.gui.MapFrame;
import org.openstreetmap.josm.gui.preferences.PreferenceSetting;
import org.openstreetmap.josm.io.FileExporter;
import org.openstreetmap.josm.io.FileImporter;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;
import org.openstreetmap.josm.actions.ExtensionFileFilter;

// Example -> http://127.0.0.1:8111/import?url=http://pastebin.com/raw.php?i=LV52bAAn

public class PescePlugin extends Plugin {
    
    public PescePlugin() {
        super(null);
    }
    
    public PescePlugin(final PluginInformation info) {
        super(info);
        //MainMenu.add(Main.main.menu.moreToolsMenu, new SimplifyAreaAction());
        
        FileImporter importer = new PesceImporter();
        FileExporter exporter = new PesceExporter();
        
        ExtensionFileFilter.importers.add(importer);
        ExtensionFileFilter.exporters.add(exporter);
        //
    }
    
    @Override
    public PreferenceSetting getPreferenceSetting() {
        return null;
        //return new SimplifyAreaPreferenceSetting();
    }
    
    @Override
    public void mapFrameInitialized(MapFrame oldFrame, MapFrame newFrame) {
        
    }
}
