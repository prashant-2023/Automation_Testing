package com.testcases;

import java.lang.reflect.Method;
//import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.SkipException;
//import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.applicationPages.CreateNewCompanyPage;
import com.applicationPages.LandingCRMPage;
import com.applicationPages.LoginCRMPage;
import com.commons.BaseTest;
import com.utils.ExcelReader;
import com.utils.JSONReader;
//import com.utils.TestUtils;

public class TC_CreateNewCompany extends BaseTest{

	JSONObject parentnodetestdata;
	CreateNewCompanyPage newcompanypage = new CreateNewCompanyPage();
	LoginCRMPage logincrmpage = new LoginCRMPage();
	LandingCRMPage landingcrmpage = new LandingCRMPage();
	ExcelReader excelreader = new ExcelReader();


	@BeforeMethod
	public void getjsondata(Method method) throws Exception {

		parentnodetestdata = JSONReader.getparentnodedata(method.getName());
	}

	@Test()
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
		//Map<String,String> map = excelreader.readExcelData("CreateNewCompany");
		//String name = map.get("Name");

		logincrmpage.logintoCRM();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(landingcrmpage.verifyTitle());
		//Assert.assertEquals();

		newcompanypage.enterDealData(compname,email, address, city, state, zipcode,industry );

		newcompanypage.selectStatus(status);
		newcompanypage.selectSource(source);
		
		newcompanypage.clickSave();

		newcompanypage.validateCompany(compname);
		//TestUtils.takeScreenshot("CreateNewCompany");
		softassert.assertAll();
	}
	

}
