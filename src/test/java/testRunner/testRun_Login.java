package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

// @RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		monochrome = true,
		features={"src/test/resources/Features/Login.feature"},
		glue={"stepDefinitions"},
		plugin= {"pretty", 
				"html:test-output",
				"html:target/cucumber-reports",
				"junit:target/JUnitReports/report.xml", 
				"junit:target/cucumber-reports/Cucumber.xml",
				"json:target/JSON_Reports/report.json",
				"json:target/cucumber-reports/Cucumber.json",
		 },

		tags= {"@smokeTest or @regression"}
		//		tags= {"@smokeTest or @regression and @important"}
		//		tags= {"(@smokeTest or @regression) and @important"}
		//		tags= {"@smokeTest and not @regression"}
		//    	tags= {"(@smokeTest or @regression) and not @important"}
		//		tags= {"@smokeTest", "@regression"}  --> depricated
		//	    tags={"@smokeTest"}
		//	    tags={"@smokeTest and @fast"}
		//	    tags={"@gui or @database"}
		//	    tags={"@fast and not @slow"}
		)

public class testRun_Login extends AbstractTestNGCucumberTests{
 
}
