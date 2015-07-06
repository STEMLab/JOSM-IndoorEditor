/**
 * 
 */
package trilogis.net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.CurvePropertyType;

/**
 * @author Nicola Dorigatti
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLineFeatureMember", propOrder = { "geometry" })
public class CustomLineFeatureMember extends AbstractFeatureType {

    protected CurvePropertyType             geometry;

    /**
     * 
     */
    public CustomLineFeatureMember() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return possible object is {@link CurvePropertyType }
     */
    public CurvePropertyType getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *            allowed object is {@link CurvePropertyType }
     */
    public void setGeometry(CurvePropertyType value) {
        this.geometry = value;
    }

    /*
     * (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.CopyTo#createNewInstance()
     */
    @Override
    public Object createNewInstance() {
        return new CustomLineFeatureMember();
    }

}
