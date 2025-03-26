package com.testcases;

import org.testng.annotations.Test;

import com.applicationPages.*;

import com.commons.BaseTest;

public class NewLead extends BaseTest{

	loginPage login = new loginPage();
	LandingPage landingpage = new LandingPage();
	LeadsLandingPage leadslandingpage = new LeadsLandingPage();
	
	public NewLead() {

		super();
	}
	@Test
	public void createNewLead() {
		
		//webdriversession().get(prop.getProperty("appFourURL"));
		login.login();
		landingpage.verifyLandingPage();
		
		landingpage.clickonleadBtn();
		leadslandingpage.clickonNewBtn();
		leadslandingpage.selectLeadStatus("New");
	}
	/*
	@AfterMethod(alwaysRun = true)
	public void driverQuitter(){
	    if(webdriversession() != null){
	        log.info("Closing browser after TestClass");
	        webdriversession().quit();
	        map.remove(Thread.currentThread().getId());
	        
	    }else{
	    	log.error("Driver is null at AfterTest (TestBase)");
	    }
	    log.info("Teardown - Exiting");
	    */
	}
	



