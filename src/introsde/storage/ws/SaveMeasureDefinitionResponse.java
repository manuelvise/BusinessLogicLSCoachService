
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveMeasureDefinitionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveMeasureDefinitionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleMeasureUpdated" type="{http://ws.storage.introsde/}measureDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveMeasureDefinitionResponse", propOrder = {
    "singleMeasureUpdated"
})
public class SaveMeasureDefinitionResponse {

    protected MeasureDefinition singleMeasureUpdated;

    /**
     * Gets the value of the singleMeasureUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getSingleMeasureUpdated() {
        return singleMeasureUpdated;
    }

    /**
     * Sets the value of the singleMeasureUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setSingleMeasureUpdated(MeasureDefinition value) {
        this.singleMeasureUpdated = value;
    }

}
