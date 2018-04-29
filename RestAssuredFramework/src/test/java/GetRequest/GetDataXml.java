package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.util.Node;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetDataXml {

	@Test
	public void Getxmldata(){
		
	   Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22");
	   int code = resp.getStatusCode();
	   System.out.println("Status code is "+code);
	   Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testBodyxml()
	{
	  Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22");
	  String data = resp.asString();
	  System.out.println("Data is "+data);
	}
	
	

	
	
	
}
