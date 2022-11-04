package Operation;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import basepackage.BaseClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.*;
public class PostReq extends BaseClass
{
	@Test
	public void Post()
	{
		baseURI="http://localhost:8080";
	    JSONObject obj=new JSONObject();
		obj.put("email","pankajpatil560@gmail.com");
		obj.put("name","Shree");
		obj.put("password", "Pankaj@11");
		obj.put("phone_no",8308205619l);
		
		given()
		.contentType(ContentType.JSON)
        .body(obj)
		.when()
		.post("/user")
		.then()
		.assertThat().statusCode(200)
		.assertThat().body("message", equalTo("successful"))
		.assertThat().contentType(ContentType.JSON)
		.log().all();
	}

	
}

		
	

