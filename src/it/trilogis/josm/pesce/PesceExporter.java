package it.trilogis.josm.pesce;

import static org.openstreetmap.josm.tools.I18n.tr;

import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.io.OsmExporter;

public class PesceExporter extends OsmExporter {
    
    private static String EXT = "xml";
    public final static ExtensionFileFilter INDOOR_FILE_FILTER = new ExtensionFileFilter(
            String.format("%s,%s.gz,%s.bz2", EXT, EXT, EXT),
            EXT, tr("IndoorGML files") + " (*."+EXT+"[.gz|.bz2])");
    
    public PesceExporter() {
        super(INDOOR_FILE_FILTER);
    }
}
