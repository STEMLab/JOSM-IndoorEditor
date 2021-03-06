/**
 * 
 */
package it.trilogis.ingoorgml.utils;

import org.openstreetmap.josm.Main;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * @author Nicola Dorigatti
 */
public class IndoorGMLNamespaceMapper extends NamespacePrefixMapper {
    private static final String INDOORGML_DEFAULT_PREFIX = "";//igml"; put empty string to set default namespace!
    private static final String INDOORGML_PREFIX = "igml";
    private static final String INDOORGML_URI    = "http://www.opengis.net/indoorgml/1.0/core";
    // private static final String INDOORGML_URI2 = "http://www.opengis.net/indoorgml/1.0/core";
    private static final String GML_PREFIX       = "gml";
    private static final String GML_URI          = "http://www.opengis.net/gml/3.2";
    // private static final String GML_URI_321 = "http://www.opengis.net/gml/3.2";
    private static final String XSI_PREFIX       = "xsi";
    private static final String XSI_URI          = "http://www.w3.org/2001/XMLSchema-instance";
    private static final String XLINK_PREFIX     = "xlink";
    private static final String XLINK_URI        = "http://www.w3.org/1999/xlink";

    /*
     * (non-Javadoc)
     * @see com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String, java.lang.String, boolean)
     */
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        Main.debug(String.format("String namespaceUri, String suggestion, boolean requirePrefix: %s %s %s",namespaceUri,suggestion,requirePrefix));
        if (INDOORGML_URI.equals(namespaceUri)) {// || INDOORGML_URI2.equals(namespaceUri)) {
            if (!requirePrefix){
                return INDOORGML_DEFAULT_PREFIX;
            }else{
                return INDOORGML_PREFIX;
            }
        } else if (GML_URI.equals(namespaceUri)) {// || GML_URI_321.equals(namespaceUri)) {
            return GML_PREFIX;
        } else if (XSI_URI.equals(namespaceUri)) {
            return XSI_PREFIX;
        } else if (XLINK_URI.equals(namespaceUri)) {
            return XLINK_PREFIX;
        }
        return suggestion;
    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] { INDOORGML_URI, GML_URI, XSI_URI, XLINK_URI };
    }
}
