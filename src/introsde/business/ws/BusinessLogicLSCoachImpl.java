package introsde.business.ws;
import java.util.List;

import introsde.storage.ws.HealthMeasureHistory;
import introsde.storage.ws.Measure;
import introsde.storage.ws.MeasureDefinition;
import introsde.storage.ws.People;
import introsde.storage.ws.PeopleStorageService;
import introsde.storage.ws.Person;

import javax.jws.WebService;


//Service Implementation

@WebService(endpointInterface = "introsde.business.ws.BusinessLogicLSCoach", serviceName = "BusinessLogicLSCoachService")
public class BusinessLogicLSCoachImpl implements BusinessLogicLSCoach {

	private People storageServicePeople;
	
	private static final String WEIGHT_TYPE = "weight";
	private static final String STRING_TYPE = "String";
	
	public BusinessLogicLSCoachImpl() {		
		PeopleStorageService serviceStorage = new PeopleStorageService();
		storageServicePeople = serviceStorage.getPeopleImplPort();
	}
	
	@Override
	public Boolean syncWeightsToDB(String accessToken) {
		
		List<HealthMeasureHistory> listWeightsMeasure = storageServicePeople.readPersonRemoteWeightHistory(accessToken);

		Long pId = storageServicePeople.readRemotePersonId(accessToken);
		Person p = storageServicePeople.readPerson(pId);
		
		if(p==null){
			p = syncPersonToDB(accessToken);
		}
			
		MeasureDefinition weightDefinition = storageServicePeople.getCompleteMeasureTypeFromName(WEIGHT_TYPE);
		if(weightDefinition==null){
			weightDefinition = setupNewDefinitioMeasure(WEIGHT_TYPE, STRING_TYPE);
		}
		
		for (HealthMeasureHistory healthMeasureHistory : listWeightsMeasure) {
			
			Measure measure = new Measure();
			measure.setMeasureDefinition(weightDefinition);
			measure.setTimestamp(healthMeasureHistory.getTimestamp());
			measure.setValue(healthMeasureHistory.getValue());
			
			
			storageServicePeople.savePersonMeasurement(p.getIdPerson(), measure);
		}
		
		return true;
	}

	@Override
	public Person syncPersonToDB(String accessToken) {
		
		Person personRemote = storageServicePeople.readRemotePerson(accessToken);
		
		Long id = storageServicePeople.createPerson(personRemote);
		return storageServicePeople.readPerson(id);
		
	}

	@Override
	public MeasureDefinition setupNewDefinitioMeasure(String name, String type) {
		MeasureDefinition newMeasureDef = new MeasureDefinition();
		newMeasureDef.setMeasureName(name);
		newMeasureDef.setMeasureType(type);
		return storageServicePeople.saveMeasureDefinition(newMeasureDef);
	}



}
