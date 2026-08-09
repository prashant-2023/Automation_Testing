package stepDefinitions;
											import org.apache.logging.log4j.LogManager;
//************Cucumber Runner File***********
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinitions"},
		tags="@SmokeTestScenario",
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber-reports.html"}
		)
public class CucumberTestRunner {
	
}
