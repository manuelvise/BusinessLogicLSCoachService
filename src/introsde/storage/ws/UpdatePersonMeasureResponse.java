
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePersonMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleMeasureUpdated" type="{http://ws.storage.introsde/}healthMeasureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonMeasureResponse", propOrder = {
    "singleMeasureUpdated"
})
public class UpdatePersonMeasureResponse {

    protected HealthMeasureHistory singleMeasureUpdated;

    /**
     * Gets the value of the singleMeasureUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public HealthMeasureHistory getSingleMeasureUpdated() {
        return singleMeasureUpdated;
    }

    /**
     * Sets the value of the singleMeasureUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public void setSingleMeasureUpdated(HealthMeasureHistory value) {
        this.singleMeasureUpdated = value;
    }

}
