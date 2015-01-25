
package introsde.storage.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonListByMeasurementRangeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonListByMeasurementRangeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfMeasureOnRange" type="{http://ws.storage.introsde/}person" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonListByMeasurementRangeResponse", propOrder = {
    "listOfMeasureOnRange"
})
public class ReadPersonListByMeasurementRangeResponse {

    @XmlElement(name = "ListOfMeasureOnRange")
    protected List<Person> listOfMeasureOnRange;

    /**
     * Gets the value of the listOfMeasureOnRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfMeasureOnRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfMeasureOnRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getListOfMeasureOnRange() {
        if (listOfMeasureOnRange == null) {
            listOfMeasureOnRange = new ArrayList<Person>();
        }
        return this.listOfMeasureOnRange;
    }

}
