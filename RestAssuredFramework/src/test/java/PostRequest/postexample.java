package PostRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postexample {

	@Test
	public void testPost()
	{
	  RequestSpecification request =RestAssured.given();
	  
	  request.header("Content-Type","application/json");
	  JSONObject json = new JSONObject();
	  json.put("id","1112");
	  json.put("title", "ravi");
	  json.put("author", "kolte");
	  
	  request.body(json.toJSONString());
	  
	  Response response = request.post("http://localhost:3000/posts/");
	  
	  int statuscode = response.getStatusCode();
	  
	  Assert.assertEquals(statuscode,201);
	  
	}
}
