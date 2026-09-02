package com.testcases;

import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.commons.BaseTest;
import com.utils.EncryptionUtils;
import com.utils.TestUtils;


public class LoginCRM extends BaseTest{
	
	Method method;
	//JSONObject parentnodetestdata;
	
	
	//LoginCRMPage logincrmpage;
	//LandingCRMPage landingcrmpage;

	public LoginCRM() {

		super();
	}
	/*@BeforeMethod
	public void readtestdata(Method method) throws Exception {
		
		//parentnodetestdata = JSONReader.getparentnodedata(method.getName());
		
		
		
	}*/
	
	@Test(priority=1)
	public void CRMlogin() {
		
		webdriversession().get(prop.getProperty("crmURL"));
		//******************Fetching data from parent node of json**************//
		
		/*String usrname = parentnodetestdata.get("UserName").toString();
		String paswd = parentnodetestdata.get("Password").toString();
*/
		//logincrmpage = new LoginCRMPage();
		//landingcrmpage = new LandingCRMPage();

		

		WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(webdriversession().findElement(By.id("email"))));
		//logincrmpage.logintoCRM();
		
		
		webdriversession().findElement(By.id("email")).sendKeys(prop.get("username").toString());
		webdriversession().findElement(By.id("password")).sendKeys(EncryptionUtils.decode(prop.get("correctpassword").toString()));
		webdriversession().findElement(By.xpath("//button[text()='Login']")).click();
		
		
		try {
			TestUtils.takeSnapShot("CRMLogin");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*landingcrmpage.verifyTitle();
		landingcrmpage.logout();
		*/
	}
	



}
