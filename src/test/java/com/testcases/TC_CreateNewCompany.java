package com.testcases;

import java.lang.reflect.Method;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applicationPages.CreateNewCompanyPage;
import com.applicationPages.LandingCRMPage;
import com.applicationPages.LoginCRMPage;
import com.commons.BaseTest;
import com.utils.JSONReader;
import com.utils.TestUtils;

public class TC_CreateNewCompany extends BaseTest{

	JSONObject parentnodetestdata;
	CreateNewCompanyPage newcompanypage = new CreateNewCompanyPage();
	LoginCRMPage logincrmpage = new LoginCRMPage();
	LandingCRMPage landingcrmpage = new LandingCRMPage();


	@BeforeMethod
	public void getjsondata(Method method) throws Exception {

		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
	}

	@Test
	public void CreateNewCompany() {


		String compname = parentnodetestdata.get("Name").toString();
		String email =parentnodetestdata.get("Email").toString();
		String address =parentnodetestdata.get("Address").toString();
		String status = parentnodetestdata.get("Status").toString();
		String source =parentnodetestdata.get("Source").toString();
		String city = parentnodetestdata.get("City").toString();
		String state =parentnodetestdata.get("State").toString();
		String zipcode =parentnodetestdata.get("ZipCode").toString();
		String industry =parentnodetestdata.get("Industry").toString();

		logincrmpage.logintoCRM();
		landingcrmpage.verifyTitle();

		newcompanypage.enterDealData(compname,email, address, city, state, zipcode,industry );

		newcompanypage.selectStatus(status);
		newcompanypage.selectSource(source);
		
		newcompanypage.clickSave();

		newcompanypage.validateCompany(compname);
		//TestUtils.takeScreenshot("CreateNewCompany");

	}


}
