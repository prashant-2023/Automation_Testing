package com.testcases;

import java.lang.reflect.Method;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applicationPages.*;
import com.commons.BaseTest;
import com.utils.EncryptionUtils;
import com.utils.JSONReader;
import com.utils.TestUtils;


public class LoginCRM extends BaseTest{
	
	Method method;
	JSONObject parentnodetestdata;
	
	
	LoginCRMPage logincrmpage;
	LandingCRMPage landingcrmpage;

	public LoginCRM() {

		super();
	}
	@BeforeMethod
	public void readtestdata(Method method) throws Exception {
		
		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
		
		webdriversession().get(prop.getProperty("crmURL"));
		
	}
	
	@Test
	public void CRMlogin() {
		
		
		//******************Fetching data from parent node of json**************//
		
		String usrname = parentnodetestdata.get("UserName").toString();
		String paswd = parentnodetestdata.get("Password").toString();

		logincrmpage = new LoginCRMPage();
		landingcrmpage = new LandingCRMPage();

		

		WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(webdriversession().findElement(By.name("email"))));
		//logincrmpage.logintoCRM();
		
		
		webdriversession().findElement(By.name("email")).sendKeys(usrname);
		webdriversession().findElement(By.name("password")).sendKeys(EncryptionUtils.decode(paswd));
		webdriversession().findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
		
		
		try {
			TestUtils.takeSnapShot(method.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		landingcrmpage.verifyTitle();
		landingcrmpage.logout();
		
	}
	



}
