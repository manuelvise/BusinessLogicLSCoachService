package introsde.business.endpoint;
import introsde.business.ws.BusinessLogicLSCoachImpl;

import javax.xml.ws.Endpoint;

public class BusinessLogicLSCoachPublisher {
	public static String SERVER_URL = "http://localhost";
	public static String PORT = "6905";
	public static String BASE_URL = "/ws/lifecoach/businesslogic";
	
	public static String getEndpointURL() {
		return SERVER_URL+":"+PORT+BASE_URL;
	}
 
	public static void main(String[] args) {
		String endpointUrl = getEndpointURL();
		System.out.println("Starting business logic Service...");
		System.out.println("--> Published at = "+endpointUrl);
		Endpoint.publish(endpointUrl, new BusinessLogicLSCoachImpl());
    }
}

