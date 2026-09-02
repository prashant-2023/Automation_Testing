package com.testcases;

//import org.testng.annotations.Test;

import com.applicationPages.CreateContactPage;
import com.applicationPages.LandingCRMPage;
import com.applicationPages.LoginCRMPage;
import com.commons.BaseTest;
import com.utils.ExcelReader;
import com.utils.JSONReader;
import com.utils.TestUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
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
	//ExcelReader reader = new ExcelReader();
	
	@BeforeMethod
	public void getjsondata(Method method) throws Exception {

		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
	}
	
	  /*public void getjsondata(Method method) throws Exception {
		
		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
	  }*/
	

	
  @Test
  public void NewContact() {
	 // System.out.println(parentnodetestdata);
	  
	String firstname 	= 	parentnodetestdata.get("FirstName").toString();
	String lastname 	= 	parentnodetestdata.get("LastName").toString();
	String company 		=	parentnodetestdata.get("Company").toString();
	String email 		=	parentnodetestdata.get("Email").toString();
	String address 		=	parentnodetestdata.get("Address").toString();
	String status 		= 	parentnodetestdata.get("Status").toString();
	String source 		=	parentnodetestdata.get("Source").toString();
	String city 		= 	parentnodetestdata.get("City").toString();
	String state 		=	parentnodetestdata.get("State").toString();
	String phnumbr 		=	parentnodetestdata.get("PhNumber").toString();
	String country 		=	parentnodetestdata.get("Country").toString();
	String zipcode 		=	parentnodetestdata.get("ZipCode").toString();
	
		  
	  //logincrmpage.logintoCRM();
	 // landingcrmpage.verifyTitle();
	  genericwait(4000);
	  createcontact_page.contactdetails(firstname, lastname, email, address, city, state, zipcode,company);
	
	  createcontact_page.selectStatus(status);
	  createcontact_page.selectSource(source);
	
	  createcontact_page.enterPh(country, phnumbr);
	  genericwait(4000);
	  createcontact_page.clickSave();
	  
	  genericwait(4000);
	  
	 // TestUtils.takeScreenshot("New_Contact");
	  
	   
	  
	 
  }
  

}
