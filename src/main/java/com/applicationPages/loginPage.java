package com.applicationPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.commons.BaseTest;

public class loginPage extends BaseTest{

	public loginPage() {

		PageFactory.initElements(webdriversession(), this);

	}


	@FindBy(id="user-name")
	WebElement usrname;

	@FindBy(id="password")
	WebElement paswd;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	public void login() {

		usrname.sendKeys(prop.getProperty("username"));
		paswd.sendKeys(prop.getProperty("password"));
		loginBtn.click();

		Reporter.log("User logged in successfully");
	}


}
