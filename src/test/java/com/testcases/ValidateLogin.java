package com.testcases;

import java.lang.reflect.Method;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.applicationPages.*;
import com.commons.BaseTest;
import com.utils.EncryptionUtils;
import com.utils.JSONReader;
import com.utils.TestUtils;

import org.testng.Assert;



public class ValidateLogin extends BaseTest{
	
	Method method;
	JSONObject parentnodetestdata;
	
	
	LoginCRMPage logincrmpage;
	LandingCRMPage landingcrmpage;

	public ValidateLogin() {

		super();
	}
	@BeforeMethod
	public void readtestdata(Method method) throws Exception {
		
		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
		
		//webdriversession().get(prop.getProperty("crmURL"));
		
	}
	
	@DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"pk19960708@gmail.com", "TUByYXRob24xMjM0"},
            {"pk19960708@gmail.com", "TUByYXRob24xMjM1"}
            
        };
    }
	
	@Test(dataProvider = "loginData")
	public void validateCRMlogin(String username, String password) {
		
		
		//******************Fetching data from parent node of json**************//
		
		//String usrname = parentnodetestdata.get("UserName").toString();
	//	String paswd = parentnodetestdata.get("correctpassword").toString();

		logincrmpage = new LoginCRMPage();
		landingcrmpage = new LandingCRMPage();


		WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(webdriversession().findElement(By.name("email"))));
		//logincrmpage.logintoCRM();
		
		
		webdriversession().findElement(By.name("email")).sendKeys(username);
		webdriversession().findElement(By.name("password")).sendKeys(EncryptionUtils.decode(password));
		webdriversession().findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
		
		
		
		/*
		try {
			TestUtils.takeSnapShot(method.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		if(landingcrmpage.verifyTitle()) {
			
			System.out.println("Login success.");
			TestUtils.takeSnapShot("login_success");
			
			Assert.assertTrue(landingcrmpage.verifyTitle(), "Title not found.");
			Logger().info("Title not found.");
			
			landingcrmpage.logout();
			
		}
		else if(landingcrmpage.verifyinvalidlogintext()) {
			
			System.out.println("Entered incorrect credentials.");
			TestUtils.takeSnapShot("login_failed");
			Assert.assertTrue(landingcrmpage.verifyinvalidlogintext(), "Login attempt failed.");
			
		}
		else {
			Assert.fail("Problem occurred with CRM login.");
			TestUtils.takeSnapShot("Problem occurred with login.");
		}
		
		
		
	}
	



}
