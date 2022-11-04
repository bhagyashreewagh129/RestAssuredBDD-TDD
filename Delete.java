package Operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import basepackage.BaseClass;

public class Delete extends BaseClass{
   @Test
   public void delete()
   {
	    baseURI="http://localhost:8080";
		when()
		.delete("/user?id=36")
		
		.then()
		.assertThat().statusCode(200)
		.assertThat().body("data", equalTo("User deleted"))
		.log().all();
		
   }
}
