package Operation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.baseURI; 
public class PutReq extends BaseClass{
	@Test
	public void put() {
		
		     baseURI="http://localhost:8080";									
		    JSONObject obj=new JSONObject();
		    obj.put("email","bhagyashreepatil12@gmail.com");
			obj.put("name","Bhagyashree wagh");
			obj.put("password", "Wagh@242");
			obj.put("userId", 45);
			obj.put("phone_no",8308205619l);
			
			
			given()
			.contentType(ContentType.JSON)
			.body(obj)
			.when()
			.put("/user/45")
			.then()
			.assertThat().statusCode(200)
			.assertThat().contentType(ContentType.JSON)
			.assertThat().body("message", equalTo("successful"))
			.log().all();
			
		
	}
}