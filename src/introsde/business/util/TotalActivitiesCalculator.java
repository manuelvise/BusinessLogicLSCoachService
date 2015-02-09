package introsde.business.util;

import introsde.storage.ws.LifeStatus;
import introsde.storage.ws.MeasureDefinition;

import java.util.ArrayList;
import java.util.List;

public class TotalActivitiesCalculator {

	private List<LifeStatus> lfList;

	public TotalActivitiesCalculator(List<LifeStatus> lfList) {
		this.setLfList(lfList);
	}

	public List<LifeStatus> calculate() {

		MeasureDefSplitter defSplitter = new MeasureDefSplitter(lfList);
		List<MeasureDefinition> listDefM = defSplitter.split();

		List<LifeStatus> finalListStatus = new ArrayList<LifeStatus>();

		for (MeasureDefinition measureDefinition : listDefM) {


				// weight
				if (measureDefinition.getMeasureName().equals("weight")) {
					LifeStatus weightStatus = extractWeightStatus(measureDefinition);
					finalListStatus.add(weightStatus);
				}else {
					LifeStatus lifeStatusActivityTotal = sumTotalForMeasureDefinition(measureDefinition);
					finalListStatus.add(lifeStatusActivityTotal);
				}

			

		}

		return finalListStatus;

	}

	private LifeStatus extractWeightStatus(MeasureDefinition measureDefinition) {
		
		LifeStatus weightLifeStatus = new LifeStatus();
		for (LifeStatus lifeStatus : lfList) {
			
			if (lifeStatus.getMeasureDefinition().equals(measureDefinition)) {

				weightLifeStatus.setMeasureDefinition(measureDefinition);
				weightLifeStatus.setValue(lifeStatus.getValue());
				break;
			}
		}

		return weightLifeStatus;
	}

	private LifeStatus sumTotalForMeasureDefinition(
			MeasureDefinition measureDefinition) {

		Double valueTotal = (double) 0;

		for (LifeStatus lifeStatus : lfList) {
			if (lifeStatus.getMeasureDefinition().equals(measureDefinition)) {
				valueTotal += Double.valueOf(lifeStatus.getValue());
			}
		}

		LifeStatus totalLifeStatus = new LifeStatus();
		totalLifeStatus.setMeasureDefinition(measureDefinition);
		totalLifeStatus.setValue(String.valueOf(valueTotal));

		return totalLifeStatus;

	}

	public List<LifeStatus> getLfList() {
		return lfList;
	}

	public void setLfList(List<LifeStatus> lfList) {
		this.lfList = lfList;
	}

}
