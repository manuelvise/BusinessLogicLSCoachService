
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePersonMeasurementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePersonMeasurementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleMeasureSaved" type="{http://ws.storage.introsde/}lifeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonMeasurementResponse", propOrder = {
    "singleMeasureSaved"
})
public class SavePersonMeasurementResponse {

    protected LifeStatus singleMeasureSaved;

    /**
     * Gets the value of the singleMeasureSaved property.
     * 
     * @return
     *     possible object is
     *     {@link LifeStatus }
     *     
     */
    public LifeStatus getSingleMeasureSaved() {
        return singleMeasureSaved;
    }

    /**
     * Sets the value of the singleMeasureSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeStatus }
     *     
     */
    public void setSingleMeasureSaved(LifeStatus value) {
        this.singleMeasureSaved = value;
    }

}
