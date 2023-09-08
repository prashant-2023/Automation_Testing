package stepDefinitions;
											//************Cucumber Runner File***********
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinitions"}, monochrome=false,
plugin= {"json", "json:target/JSONReports/report.json"}
		)
public class CucumberTestRunner {
	
	
}
