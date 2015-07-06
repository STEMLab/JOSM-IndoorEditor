/**
 * 
 */
package trilogis.net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.PointPropertyType;

/**
 * @author Nicola Dorigatti
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomPointFeatureMember", propOrder = { "geometry" })
public class CustomPointFeatureMember extends AbstractFeatureType {

    protected PointPropertyType geometry;

    /**
     * 
     */
    public CustomPointFeatureMember() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return possible object is {@link PointPropertyType }
     */
    public PointPropertyType getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *            allowed object is {@link PointPropertyType }
     */
    public void setGeometry(PointPropertyType value) {
        this.geometry = value;
    }

    /*
     * (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.CopyTo#createNewInstance()
     */
    @Override
    public Object createNewInstance() {
        return new CustomPointFeatureMember();
    }

}
