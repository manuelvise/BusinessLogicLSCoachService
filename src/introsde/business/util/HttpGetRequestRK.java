package introsde.business.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpGetRequestRK {

	private String host;
	private String query;
	private String token;
	private String accept;

	public HttpGetRequestRK(String host, String query, String token, String accept) {
		this.host = host;
		this.query = query;
		this.token = token;
		this.accept = accept;
	}

	public String getResponse() {

		String output = null;

		try {

			URL url = new URL(host + "/" + query);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", accept);
			conn.setRequestProperty("Authorization", "Bearer " + token);

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return output;

	}

}
