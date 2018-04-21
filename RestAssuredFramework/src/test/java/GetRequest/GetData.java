package GetRequest;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetData {

	// GET is to send the request
	@Test
	public void testResponseCode()
	{
	  Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	  int code = resp.getStatusCode();
	  System.out.println("Status code is "+code);
	  Assert.assertEquals(code, 200);
	}
	

	@Test
	public void testBody()
	{
	  Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	  String data = resp.asString();
	  System.out.println("Data is "+data);
	  
	}
	
	@Test
	public void testid()
	{
	  Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	  int id = resp.path("id");
	  System.out.println("Id is "+id);
	  Assert.assertEquals(id,2643743);
	  
	}
	
	@Test
	public void testcityname()
	{
	  Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	  String name = resp.path("name");
	  System.out.println("City is "+name);
	  Assert.assertEquals(name,"London");
	  
	}
	
	@Test
	public void testsys()
	{
	  Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	  int sys = resp.path("sys.type");
	  System.out.println("Sys Id is "+sys);
	  Assert.assertEquals(sys,1);
	  
	}
	
	@Test
	public void GetWeather()
	{
	  Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	  ArrayList<Object> a = resp.jsonPath().get("weather.description");
	   for(Object o : a)
	   {
		   System.out.println(o);
		   Assert.assertEquals("light intensity drizzle", o);
	   }
	 
	}
	
}
