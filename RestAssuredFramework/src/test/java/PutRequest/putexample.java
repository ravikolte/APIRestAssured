package PutRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putexample {

	// PUT request is to update 
	@Test
	public void testPost()
	{
	  RequestSpecification request =RestAssured.given();
	  
	  request.header("Content-Type","application/json");
	  JSONObject json = new JSONObject();
	 
	  json.put("title", "ravikkkkq");
	  json.put("author", "koltekkkkq");
	  
	  request.body(json.toJSONString());
	  
	  Response response = request.put("http://localhost:3000/posts/0122");
	  
	  int statuscode = response.getStatusCode();
	  
	  Assert.assertEquals(statuscode,200);
	  
	}
}
