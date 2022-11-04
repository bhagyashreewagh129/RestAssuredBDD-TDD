package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		 features = {"./src//test//java//feature"},
		 glue =  "stepDefination",
		 dryRun = true,
		 monochrome = true,
		 plugin="pretty"
		
		)

public class Runner extends AbstractTestNGCucumberTests {


}
