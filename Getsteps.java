package stepDefination;

import groovy.util.logging.Log;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getsteps {
   Response res;
   ValidatableResponse validate;
   
	
   @When("User wants to fetch the data by using URI as {string}")
   public void user_wants_to_fetch_the_data_by_using_uri_as(String url) {
	   res = RestAssured.get(url);
   }
   

   @Then("User wants to Verify the status code as {string}")
   public void user_wants_to_verify_the_status_code_as(Integer code) 
 {
	   validate.assertThat().statusCode(code).log().all();
 }
     
   }



