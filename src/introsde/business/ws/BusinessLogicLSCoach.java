package introsde.business.ws;

import introsde.business.model.Activities;
import introsde.business.model.Profile;
import introsde.business.model.Weights;
import introsde.storage.ws.MeasureDefinition;
import introsde.storage.ws.Person;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding
public interface BusinessLogicLSCoach {
	
	@WebMethod(operationName="syncWeightToDB")
    @WebResult(name="fitnessActivities") 
    public Boolean syncWeightsToDB(@WebParam(name="accessToken") String accessToken);
	
	@WebMethod(operationName="syncPersonToDB")
    @WebResult(name="personSynchronized") 
    public Person syncPersonToDB(@WebParam(name="accessToken") String accessToken);
	
	@WebMethod(operationName="setupNewDefinitioMeasure")
    @WebResult(name="newMeasureDefinition") 
    public MeasureDefinition setupNewDefinitioMeasure(@WebParam(name="name") String name, @WebParam(name="type") String type);


	
   }

