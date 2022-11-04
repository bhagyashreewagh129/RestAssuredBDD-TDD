package Operation;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import basepackage.BaseClass;
import io.restassured.http.ContentType;

public class Get extends BaseClass {
	@Test
	public void get()
	{
		baseURI="http://localhost:8080";
		when()
		.get("/user")
		
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().body("data[1].name", equalTo("Bhagyashree Patil"))
		.log().all();
	}
}
	


