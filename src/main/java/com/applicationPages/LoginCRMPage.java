package com.applicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commons.BaseTest;
import com.utils.EncryptionUtils;


public class LoginCRMPage extends BaseTest{

	public LoginCRMPage() {
		
		PageFactory.initElements(webdriversession(), this);
	}
	
	@FindBy (xpath="//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy (name="password")
	WebElement paswrd;
	
	@FindBy (xpath="//*[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	
	public void logintoCRM() {
		
		email.sendKeys(prop.getProperty("username"));
		paswrd.sendKeys(EncryptionUtils.decode(prop.getProperty("correctpassword")));
		loginbtn.click();
		
	}
	
}
