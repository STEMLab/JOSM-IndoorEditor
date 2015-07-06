/**
 * 
 */
package it.trilogis.ingoorgml.utils;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * @author Nicola Dorigatti
 */
public class GMLNamespaceMapper extends NamespacePrefixMapper {
    private static final String GML_DEFAULT_PREFIX = "";//gml"; put empty string to set default namespace!
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
        if (GML_URI.equals(namespaceUri)) {// || INDOORGML_URI2.equals(namespaceUri)) {
            if (!requirePrefix){
                return GML_DEFAULT_PREFIX;
            }else{
                return GML_PREFIX;
            }
        } else if (XSI_URI.equals(namespaceUri)) {
            return XSI_PREFIX;
        } else if (XLINK_URI.equals(namespaceUri)) {
            return XLINK_PREFIX;
        }
        return suggestion;
    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] { GML_URI, XSI_URI, XLINK_URI };
    }
}
