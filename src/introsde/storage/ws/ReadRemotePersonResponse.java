
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readRemotePersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readRemotePersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remotePerson" type="{http://ws.storage.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readRemotePersonResponse", propOrder = {
    "remotePerson"
})
public class ReadRemotePersonResponse {

    protected Person remotePerson;

    /**
     * Gets the value of the remotePerson property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getRemotePerson() {
        return remotePerson;
    }

    /**
     * Sets the value of the remotePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setRemotePerson(Person value) {
        this.remotePerson = value;
    }

}
