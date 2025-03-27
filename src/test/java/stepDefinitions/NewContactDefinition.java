package stepDefinitions;

import com.commons.BaseTest;
import com.testcases.TC_CreateNewContact;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class NewContactDefinition extends BaseTest{
	
	//TC_CreateNewContact newContact;
		
		
	@Given("Create new contact")
	public void newcontact() throws Throwable{
		
		try {
			webdriversession();
			sc.log("URL launched successfully");
			
		}
		catch(Exception e){
			
			sc.log("Issue in launching URL");
		}
		
		
		TC_CreateNewContact tc_CreateNewContact = new TC_CreateNewContact();
		tc_CreateNewContact.NewContact();
		
		
	}

}
