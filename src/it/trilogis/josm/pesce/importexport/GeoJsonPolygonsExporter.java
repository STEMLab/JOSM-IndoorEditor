package it.trilogis.josm.pesce.importexport;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.io.File;
import java.io.IOException;

import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.gui.layer.Layer;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.io.FileExporter;

public class GeoJsonPolygonsExporter extends FileExporter {

    private final static String EXT = "geojson";
    public final static ExtensionFileFilter GEOJSON_FILE_FILTER = new ExtensionFileFilter(
            EXT,
            EXT, tr("Geojson polygons file") + " (*."+EXT+")");
    
    public GeoJsonPolygonsExporter() {
        super(GEOJSON_FILE_FILTER);
    }

    @Override
    public boolean acceptFile(File pathname, Layer layer) {
        if (!(layer instanceof OsmDataLayer))
            return false;
        return super.acceptFile(pathname, layer);
    }

    @Override
    public void exportData(File file, Layer layer) throws IOException {
        
        //exportData(file, layer, false);
    }
    
}
