
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveGoalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Goal" type="{http://ws.storage.introsde/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveGoalResponse", propOrder = {
    "goal"
})
public class SaveGoalResponse {

    @XmlElement(name = "Goal")
    protected Goal goal;

    /**
     * Gets the value of the goal property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * Sets the value of the goal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setGoal(Goal value) {
        this.goal = value;
    }

}
