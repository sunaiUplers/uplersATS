package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/featureFiles/Test.feature" },
		glue = { "stepDefinition"},
//		tags = { "~@ignore"},
		plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml"},
		monochrome = true
)
public class TestAppRunner {
	
	public static Map<String, String> config;
	public static Scenario scenario;
}
