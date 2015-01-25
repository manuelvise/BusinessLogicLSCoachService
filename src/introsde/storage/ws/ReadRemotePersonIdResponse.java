
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readRemotePersonIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readRemotePersonIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemotePersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readRemotePersonIdResponse", propOrder = {
    "remotePersonId"
})
public class ReadRemotePersonIdResponse {

    @XmlElement(name = "RemotePersonId")
    protected Long remotePersonId;

    /**
     * Gets the value of the remotePersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemotePersonId() {
        return remotePersonId;
    }

    /**
     * Sets the value of the remotePersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemotePersonId(Long value) {
        this.remotePersonId = value;
    }

}
