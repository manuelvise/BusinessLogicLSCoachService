
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonMeasurementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonMeasurementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleMeasureOfPersonById" type="{http://ws.storage.introsde/}healthMeasureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonMeasurementResponse", propOrder = {
    "singleMeasureOfPersonById"
})
public class ReadPersonMeasurementResponse {

    protected HealthMeasureHistory singleMeasureOfPersonById;

    /**
     * Gets the value of the singleMeasureOfPersonById property.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public HealthMeasureHistory getSingleMeasureOfPersonById() {
        return singleMeasureOfPersonById;
    }

    /**
     * Sets the value of the singleMeasureOfPersonById property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public void setSingleMeasureOfPersonById(HealthMeasureHistory value) {
        this.singleMeasureOfPersonById = value;
    }

}
