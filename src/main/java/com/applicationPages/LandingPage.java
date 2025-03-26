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
import com.constants.Constants;



public class LandingPage extends BaseTest{
	
	public LandingPage() {

		PageFactory.initElements(webdriversession(), this);

	}
	@FindBy(xpath="//*[@class='slds-truncate'][@title='Sales']")
	WebElement salesTitle;
	
	@FindBy(xpath="//a[@title='Leads']")
	WebElement leadBtn;
	
	public void verifyLandingPage() {
		
		WebDriverWait  wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOf(salesTitle));
		
		String title = webdriversession().getTitle();
		
		if(title.equalsIgnoreCase("Home")) {
			
			Logger().info("User is landed on home page");
		}
		
		else {
			
			Logger().info("Page is still loadiing");
		}
	}
	
	public void clickonleadBtn() {
		
		WebElement element = webdriversession().findElement(By.xpath("//a[@title='Leads']"));
		((JavascriptExecutor) webdriversession()).executeScript("arguments[0].click();", element);
		
		
	}


}
