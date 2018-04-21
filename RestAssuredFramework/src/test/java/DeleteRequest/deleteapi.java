package DeleteRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteapi {

     // Delete is to delete the resource
	@Test
	public void testDeleteAPI()
	{
	  RequestSpecification request =RestAssured.given();
	  
	  Response response = request.delete("http://localhost:3000/posts/1141");
	  int statuscode = response.getStatusCode();
	  
	  Assert.assertEquals(statuscode,200);
	  
	}
}
