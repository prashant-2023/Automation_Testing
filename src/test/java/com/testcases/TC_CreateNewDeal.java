package com.testcases;

import java.lang.reflect.Method;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applicationPages.CreateNewCompanyPage;
import com.applicationPages.CreateNewDealPage;
import com.applicationPages.LandingCRMPage;
import com.applicationPages.LoginCRMPage;
import com.commons.BaseTest;
import com.utils.JSONReader;
import com.utils.TestUtils;

public class TC_CreateNewDeal extends BaseTest{

	JSONObject parentnodetestdata;
	CreateNewDealPage newdealpage = new CreateNewDealPage();
	LoginCRMPage logincrmpage = new LoginCRMPage();
	LandingCRMPage landingcrmpage = new LandingCRMPage();


	@BeforeMethod
	public void getjsondata(Method method) throws Exception {

		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
	}

	@Test
	public void CreateNewDeal() {


		String compname = parentnodetestdata.get("Company").toString();
		String dealname =parentnodetestdata.get("DealName").toString();
		String product =parentnodetestdata.get("Product").toString();
		/*String status = parentnodetestdata.get("Status").toString();
		String source =parentnodetestdata.get("Source").toString();
		String city = parentnodetestdata.get("City").toString();
		String state =parentnodetestdata.get("State").toString();
		String zipcode =parentnodetestdata.get("ZipCode").toString();
		String industry =parentnodetestdata.get("Industry").toString();*/

		//logincrmpage.logintoCRM();
		//landingcrmpage.verifyTitle();

		newdealpage.enterDealData(dealname, compname, product);
		
		//newcompanypage.clickSave();

		//newcompanypage.validateCompany(compname);
		//TestUtils.takeScreenshot("CreateNewCompany");

	}


}
