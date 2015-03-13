// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.gui.MainMenu;
import org.openstreetmap.josm.gui.MapFrame;
import org.openstreetmap.josm.gui.preferences.PreferenceSetting;
import org.openstreetmap.josm.io.FileImporter;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;
import org.openstreetmap.josm.actions.ExtensionFileFilter;

public class PescePlugin extends Plugin {

    private static PescePlugin instance = null;
    
    public PescePlugin() {
        super(null);
    }
    
    public PescePlugin(final PluginInformation info) {
        super(info);
        //MainMenu.add(Main.main.menu.moreToolsMenu, new SimplifyAreaAction());
        
        FileImporter importer = new PesceImporter();
        
        ExtensionFileFilter.importers.add(importer);
    }

    /* ???
    public static final PescePlugin getInstance() {
        return instance;
    } */

    @Override
    public PreferenceSetting getPreferenceSetting() {
        return null;
        //return new SimplifyAreaPreferenceSetting();
    }
    
    @Override
    public void mapFrameInitialized(MapFrame oldFrame, MapFrame newFrame) {
    }
}
