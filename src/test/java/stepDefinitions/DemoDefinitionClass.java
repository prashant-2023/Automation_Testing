package stepDefinitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.commons.BaseTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoDefinitionClass extends BaseTest{
		WebDriver driver;
		
	
  @Given("launching app")
  public void launchURL(String url) throws Throwable {
	  
	//  System.out.println("Inside given annotation");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
		  
  }

  @When("you are in when annotation")
  public void when() throws Throwable {
	  
	  System.out.println("Inside when annotation");
  }

  @And("you are in and annotation")
  public void and() throws Throwable {
	  
	  System.out.println("Inside and annotation");
  }
  
  @Then("you are in then annotation")
  public void then() throws Throwable {
	  
	  System.out.println("Inside then annotation");
  }

  

}
