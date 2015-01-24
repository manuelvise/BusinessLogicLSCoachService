package introsde.business.model;

import introsde.business.model.MeasureDefinition;
import introsde.business.model.Person;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the "HealthMeasureHistory" database table.
 * 
 */
@XmlRootElement
public class HealthMeasureHistory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6863281406708752877L;
	
	private int idMeasureHistory;
	private Long timestamp;
	private String value;
	private MeasureDefinition measureDefinition;
	private Person person;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MeasureDefinition getMeasureDefinition() {
		return measureDefinition;
	}

	public void setMeasureDefinition(MeasureDefinition measureDefinition) {
		this.measureDefinition = measureDefinition;
	}

	public HealthMeasureHistory() {
	}

	public int getIdMeasureHistory() {
		return this.idMeasureHistory;
	}
	
	public void setIdMeasureHistory(int idMeasureHistory) {
		this.idMeasureHistory = idMeasureHistory;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person param) {
	    this.person = param;
	}

	}
