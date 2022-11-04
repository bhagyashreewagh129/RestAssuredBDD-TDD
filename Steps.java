package stepDefination;

import org.json.simple.JSONObject;

import groovy.util.logging.Log;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class Steps {
	 Response res;
	 RequestSpecification req;
	 ValidatableResponse validate;
	
	 @Given("User wants to create data in database")
	public void user_wants_to_create_data_in_database() {
	   JSONObject obj=new JSONObject();
	   obj.put("email", "bhagyashreewagh129@gmail.com");
	   obj.put("name","Ishu Patil");
	   obj.put("phone_no",0);
	   req = RestAssured.given()
			   .body(obj)
			   .contentType(ContentType.JSON);
	}
	
	@When("User create data by using URI {string}")
	public void user_create_data_by_using_uri(String s1) {
	  res=req.when().post(s1); 
	}

	@Then("verify the status code {int}")
	public void verify_the_status_code(Integer int1) {
	   validate.statusCode(int1)
	   .log().all();
       

	}
}