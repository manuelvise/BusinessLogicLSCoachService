package introsde.business.ws;

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
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface BusinessLogicLSCoach {
	
	@WebMethod(operationName="syncWeightToDB")
    @WebResult(name="boolean") 
    public Boolean syncWeightsToDB(@WebParam(name="accessToken") String accessToken);

	@WebMethod(operationName="syncActivitiesToDB")
    @WebResult(name="boolean") 
    public Boolean syncActivitiesToDB(@WebParam(name="accessToken") String accessToken);
	
	
	@WebMethod(operationName="syncPersonToDB")
    @WebResult(name="personSynchronized") 
    public Person syncPersonToDB(@WebParam(name="accessToken") String accessToken);
	
	@WebMethod(operationName="setupNewDefinitioMeasure")
    @WebResult(name="newMeasureDefinition") 
    public MeasureDefinition setupNewDefinitionMeasure(@WebParam(name="name") String name, @WebParam(name="type") String type);
	
   }

