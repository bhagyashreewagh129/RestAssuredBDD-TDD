package stepDefination;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutSteps {
	
	Response res;
	RequestSpecification req;
	ValidatableResponse validate;    

    @Given("User wants to update the data in database")
     public void user_wants_to_update_the_data_in_database() {
	 JSONObject obj=new JSONObject();
	   obj.put("email", "bhagyashreewagh129@gmail.com");
	   obj.put("name","Ishu Patil");
	   obj.put("password","Ishika@24");
	   obj.put("phone_no",7775364097l);
	  
	   req=RestAssured.given()
			   .body(obj)
			   .contentType(ContentType.JSON);
   }

    @When("User wants to update the data in database using URI as {string}")
    public void user_wants_to_update_the_data_in_database_using_uri_as(String url) {
	  res=req.when().put(url);
 }

      @Then("verify the status code is {int}")
      public void verify_the_status_code_is(Integer int1) {
    	 validate.statusCode(int1).log().all();
  }
}

