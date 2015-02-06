package introsde.business.ws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import introsde.storage.ws.HealthMeasureHistory;
import introsde.storage.ws.Measure;
import introsde.storage.ws.MeasureDefinition;
import introsde.storage.ws.People;
import introsde.storage.ws.PeopleStorageService;
import introsde.storage.ws.Person;

import javax.jws.WebService;
import javax.xml.ws.BindingProvider;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.client.BindingProviderProperties;

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

		List<HealthMeasureHistory> listWeightsMeasure = storageServicePeople
				.readPersonRemoteWeightHistory(accessToken);

		Long pId = storageServicePeople.readRemotePersonId(accessToken);
		Person p = storageServicePeople.readPerson(pId);

		if (p == null) {
			p = syncPersonToDB(accessToken);
		}

		String measureDefinitionJson = storageServicePeople
				.getCompleteMeasureTypeFromName(WEIGHT_TYPE);
		
		MeasureDefinition measureDefinition = null;
		
		try {
			ObjectMapper mapper = new ObjectMapper();

			measureDefinition = mapper.readValue(measureDefinitionJson, MeasureDefinition.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (measureDefinition == null) {
			measureDefinition = setupNewDefinitionMeasure(WEIGHT_TYPE,
					STRING_TYPE);
		}

		for (HealthMeasureHistory healthMeasureHistory : listWeightsMeasure) {

			Measure measure = new Measure();
			measure.setMDefinition(measureDefinition);
			measure.setTimestamp(healthMeasureHistory.getTimestamp());
			measure.setValue(healthMeasureHistory.getValue());

			storageServicePeople
					.saveIfnotExistPersonMeasurement(p.getIdPerson(), measure);
		}

		return true;
	}

	@Override
	public Person syncPersonToDB(String accessToken) {

		try {

			Person personRemote = storageServicePeople
					.readRemotePerson(accessToken);

			Long id = storageServicePeople.readRemotePersonId(accessToken);

			personRemote.setIdPerson(id);

			// URL url = new URL("http://localhost:6900/ws/hello?wsdl");
			// // 1st argument service URI, refer to wsdl document above
			// // 2nd argument is service name, refer to wsdl document above
			// QName qname = new QName("http://ws.introsde/",
			// "HelloWorldImplService");
			// Service service = Service.create(url, qname);
			// HelloWorld hello = service.getPort(HelloWorld.class);
			// System.out.println(hello.getHelloWorldAsString("Pinco"));
			
//			PeopleStorageService serviceStorage = new PeopleStorageService();
//			
//			storageServicePeople = serviceStorage.getPeopleImplPort();


			
			ObjectMapper mapperJson = new ObjectMapper();
			String personToSaveJson = null;
			try {
				personToSaveJson = mapperJson.writeValueAsString(personRemote);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Person personSaved = storageServicePeople.createPerson(personToSaveJson);


			return personSaved;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MeasureDefinition setupNewDefinitionMeasure(String name, String type) {
		MeasureDefinition newMeasureDef = new MeasureDefinition();
		newMeasureDef.setMeasureName(name);
		newMeasureDef.setMeasureType(type);
		
		
		ObjectMapper mapperJson = new ObjectMapper();
		String mDefToSaveJson = null;
		try {
			mDefToSaveJson = mapperJson.writeValueAsString(newMeasureDef);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return storageServicePeople.saveMeasureDefinition(mDefToSaveJson);
	}

}
