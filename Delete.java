package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
public class Delete {
   Response res;
   ValidatableResponse validate;
   
	@When("user want to delete user by using URI {string}")
	public void user_want_to_delete_user_by_using_uri(String s1) {
	   res=when().delete(s1);
	}

	@Then("verify status code is {int}")
	public void verify_status_code_is(Integer int1) {
	  res.then()
	  .log().all()
	  .assertThat().statusCode(int1);
	}

}
