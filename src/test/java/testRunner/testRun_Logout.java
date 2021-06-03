package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome = true,
			dryRun = false,
			features = {"src/test/resources/Features/Logout_BackgroundDemo.feature"},
			glue = {"stepDefinitions/LogoutSteps"},
			plugin = {"html:target/htmlReport/report.html", "json:target/JSON_Report/report.json",
					"junit:target/JUnitReport/report.xml", "json:target/cucumber.json"},
			tags = {}
			
			)
	public class testRun_Logout {
}