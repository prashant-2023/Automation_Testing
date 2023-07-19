package com.applicationPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.commons.BaseTest;



public class LandingPage extends BaseTest{
	
	public LandingPage() {

		PageFactory.initElements(webdriversession(), this);

	}
	@FindBy(xpath="//*[@class='slds-truncate'][@title='Sales']")
	WebElement salesTitle;
	
	@FindBy(xpath="//a[@title='Leads']")
	WebElement leadBtn;
	
	public void verifyLandingPage() {
		
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(com.constants.Constants.IMPLICIT_WAIT_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOf(salesTitle));
		
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Home")) {
			
			log.info("User is landed on home page");
		}
		
		else {
			
			log.info("Page is still loadiing");
		}
	}
	
	public void clickonleadBtn() {
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Leads']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
		
	}


}
