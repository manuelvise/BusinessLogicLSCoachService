package introsde.business.model;

import introsde.business.model.MeasureDefinition;

public class Measure {
	private String value;
	private MeasureDefinition measureDefinition;

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

}
