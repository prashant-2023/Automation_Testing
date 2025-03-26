package com.testcases;

//import org.testng.annotations.Test;

import com.applicationPages.CreateContactPage;
import com.applicationPages.LandingCRMPage;
import com.applicationPages.LoginCRMPage;
import com.commons.BaseTest;
import com.utils.ExcelReader;
import com.utils.JSONReader;
import com.utils.TestUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;

public class TC_CreateNewContact extends BaseTest{
	
	
	JSONObject parentnodetestdata;
	LoginCRMPage logincrmpage = new LoginCRMPage();
	LandingCRMPage landingcrmpage = new LandingCRMPage();
	CreateContactPage createcontact_page= new CreateContactPage();
	
	
	String sheet = this.getClass().getSimpleName().substring(3);
	ExcelReader reader = new ExcelReader();
	
	
	@BeforeMethod
	public Map<String,String> getExcelData() {
		
						
		return reader.readExcelData(sheet);
	}
	
	  /*public void getjsondata(Method method) throws Exception {
		
		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
	  }*/
	

	
  @Test
  public void NewContact() {
	
	String firstname 	= 	getExcelData().get("FirstName").trim();
	String lastname 	= 	getExcelData().get("LastName").trim();
	String company 		=	getExcelData().get("Company").trim();
	String email 		=	getExcelData().get("Email").trim();
	String address 		=	getExcelData().get("Address").trim();
	String status 		= 	getExcelData().get("Status").trim();
	String source 		=	getExcelData().get("Source").trim();
	String city 		= 	getExcelData().get("City").trim();
	String state 		=	getExcelData().get("State").trim();
	String phnumbr 		=	getExcelData().get("phNumber").trim();
	String country 		=	getExcelData().get("DOB").trim();
	String zipcode 		=	getExcelData().get("Country").trim();
	
		  
	  logincrmpage.logintoCRM();
	  landingcrmpage.verifyTitle();
	  genericwait(4000);
	  createcontact_page.contactdetails(firstname, lastname, email, address, city, state, zipcode,company);
	
	  createcontact_page.selectStatus(status);
	  createcontact_page.selectSource(source);
	
	  createcontact_page.enterPh(country, phnumbr);
	  genericwait(4000);
	  createcontact_page.clickSave();
	  
	  genericwait(4000);
	  
	 // TestUtils.takeScreenshot("New_Contact");
	  
	  try {
		  Logger().info("New Contact created");
	  }
	  catch(Exception e) {
		  
		  
		  
		  
	  }
	  
	  
	 
  }
  

  @AfterMethod
  public void closebrowser() {
	  
	  webdriversession().close();
	  map.remove(Thread.currentThread(), webdriversession());
  }

}
