
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveIfnotExistPersonMeasurementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveIfnotExistPersonMeasurementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleMeasureSaved" type="{http://ws.storage.introsde/}healthMeasureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveIfnotExistPersonMeasurementResponse", propOrder = {
    "singleMeasureSaved"
})
public class SaveIfnotExistPersonMeasurementResponse {

    protected HealthMeasureHistory singleMeasureSaved;

    /**
     * Gets the value of the singleMeasureSaved property.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public HealthMeasureHistory getSingleMeasureSaved() {
        return singleMeasureSaved;
    }

    /**
     * Sets the value of the singleMeasureSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public void setSingleMeasureSaved(HealthMeasureHistory value) {
        this.singleMeasureSaved = value;
    }

}
