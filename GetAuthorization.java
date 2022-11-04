package BasicAuth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetAuthorization {

	public static void main(String[] args) {
	
	     baseURI="https://github.com";
		 
		 given().auth().basic("bhagyashreewagh129","pankaj@1124")  
		 
		   .when().get("/login")
		   .then().log().all();
	}
}

