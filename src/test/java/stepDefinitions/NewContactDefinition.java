package stepDefinitions;

import com.commons.BaseTest;
import com.testcases.TC_CreateNewContact;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class NewContactDefinition extends BaseTest{
	
	TC_CreateNewContact newContact;
		
		
	@Given("Create new contact")
	public void newcontact() throws Throwable{
		
		try {
			//webdriversession();
			newContact = new TC_CreateNewContact();
			newContact.NewContact();
			sc.log("New contact created successfully");
			
		}
		catch(Exception e){
			
			sc.log("Issue in creating new contact.");
		}
		
		
		
		
		
	}

}
