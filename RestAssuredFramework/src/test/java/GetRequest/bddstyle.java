package GetRequest;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class bddstyle {

  @BeforeClass
  public void setBaseUri () {

    RestAssured.baseURI = "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
  }
  
  @Test
  public void test01()  {
    Response res  =given ().param ("appid","b6907d289e10d714a6e88b30761fae22")
    .when()
    .get ("2643743")
    .then()
    .statusCode(200)
     .extract().response();

    System.out.println (res.asString ());

  }

}