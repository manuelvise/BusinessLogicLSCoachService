
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePersonMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePersonMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measure" type="{http://ws.storage.introsde/}measure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonMeasure", propOrder = {
    "idMeasure",
    "measure"
})
public class UpdatePersonMeasure {

    protected int idMeasure;
    protected Measure measure;

    /**
     * Gets the value of the idMeasure property.
     * 
     */
    public int getIdMeasure() {
        return idMeasure;
    }

    /**
     * Sets the value of the idMeasure property.
     * 
     */
    public void setIdMeasure(int value) {
        this.idMeasure = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setMeasure(Measure value) {
        this.measure = value;
    }

}
