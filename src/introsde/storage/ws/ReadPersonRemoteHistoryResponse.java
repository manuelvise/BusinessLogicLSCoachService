
package introsde.storage.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonRemoteHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonRemoteHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remoteHistory" type="{http://ws.storage.introsde/}healthMeasureHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonRemoteHistoryResponse", propOrder = {
    "remoteHistory"
})
public class ReadPersonRemoteHistoryResponse {

    protected List<HealthMeasureHistory> remoteHistory;

    /**
     * Gets the value of the remoteHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthMeasureHistory }
     * 
     * 
     */
    public List<HealthMeasureHistory> getRemoteHistory() {
        if (remoteHistory == null) {
            remoteHistory = new ArrayList<HealthMeasureHistory>();
        }
        return this.remoteHistory;
    }

}
