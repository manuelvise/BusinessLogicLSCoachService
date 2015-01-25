
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCompleteMeasureTypeFromName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCompleteMeasureTypeFromName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCompleteMeasureTypeFromName", propOrder = {
    "typeMeasure"
})
public class GetCompleteMeasureTypeFromName {

    protected String typeMeasure;

    /**
     * Gets the value of the typeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeMeasure() {
        return typeMeasure;
    }

    /**
     * Sets the value of the typeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeMeasure(String value) {
        this.typeMeasure = value;
    }

}
