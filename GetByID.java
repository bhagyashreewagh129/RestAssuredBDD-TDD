package stepDefination;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByID {
     Response res;
     ValidatableResponse validate;
     
	
     @When("User wants to Fetch the data by using URI as {string}")
     public void user_wants_to_fetch_the_data_by_using_uri_as(String s1) {
        res=RestAssured.get(s1); 
     }

     @Then("User wants to Verify the status code as {int}")
     public void user_wants_to_verify_the_status_code_as(Integer int1) {
         validate.assertThat().statusCode(int1) 
         .log().all();
     }
}