package com.applicationPages;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.commons.BaseTest;

public class CreateContactPage extends BaseTest{
	
	WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(10));
	
	public CreateContactPage() {
		
		PageFactory.initElements(webdriversession(), this);
	}
	
	@FindBy (xpath="//i[@class='users icon']")
	WebElement contactBtn;
	
	@FindBy (xpath="//a[@href=\"/contacts/new\"]")
	WebElement createBtn;
	
	@FindBy (name="first_name")
	WebElement enterfn;
	
	@FindBy (name="last_name")
	WebElement enterln;
	
	@FindBy (xpath = "//*[@name=\"company\"]")
	WebElement selectcompany;
	
	@FindBy(xpath="//*[@placeholder=\"Email address\"]")
	WebElement enteremail;
		
	@FindBy (xpath= "//div[@name=\"country\"]")
	WebElement countrydrpdwn;
	
	@FindBy (xpath = "//*[@name=\"address\"]")
	WebElement enteraddress;
	
	@FindBy (xpath="//input[@name=\"city\"]")
	WebElement entercity;
	
	@FindBy (xpath="//input[@name=\"state\"]")
	WebElement enterstate;
	
	@FindBy (xpath="//input[@name=\"zip\"]")
	WebElement zip_code;
				
	@FindBy (xpath="//div[@name=\"hint\" and @class=\"ui search selection dropdown\"]")
	WebElement Ph_country;
	
	@FindBy (xpath="//input[@placeholder=\"Number\"]")
	WebElement enterphone;
	
	@FindBy (xpath= "//*[@class=\"ui linkedin button\"]")
	WebElement saveBtn;
	
	
	
	public void contactdetails(String fname, String lname, String email, String address, String city, String state, String zipcode, String comp ) {
	
		mouseHover(contactBtn);
		contactBtn.click();
		createBtn.click();
		
		enterfn.sendKeys(fname);
		enterln.sendKeys(lname);
		enteremail.sendKeys(email);
		enteraddress.sendKeys(address);
		entercity.sendKeys(city);
		enterstate.sendKeys(state);
		zip_code.sendKeys(zipcode);
		genericwait(4000);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(selectcompany));
			selectcompany.sendKeys(comp);
		}catch (ElementNotInteractableException e){
			
			wait.until(ExpectedConditions.visibilityOf(selectcompany));
			JavascriptExecutor jse = ((JavascriptExecutor)webdriversession());        	
			//WebElement email = driver.findElement(By.id("useremail"));
			try {
				jse.executeScript("arguments[0].value= '"+ comp + "'; ", selectcompany);
			}
			catch(NoSuchElementException exc) {
				System.out.println("Issue in executing java script.");
				exc.printStackTrace();
			}
			
			
		}
		
		
		
	
	}
	

	
	public void enterPh(String country, String numbr) {
		
		//selectByText(country, Ph_country);
		Ph_country.click();
		
		WebElement enterPh= webdriversession().findElement(By.xpath("//label[contains(text(),'Phone')]//following::div[4]/input[@class=\"search\" and @type=\"text\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(enterPh));
		
		enterPh.sendKeys(country);
		
		List<WebElement> countries = webdriversession().findElements(By.xpath("//div[@role=\"listbox\" and @class=\"visible menu transition\"]/div[@role='option']"));
		
		wait.until((ExpectedConditions.visibilityOfAllElements(countries)));
		
		for(WebElement c: countries) {
			
			String countrytext=c.getText();
			
					
			if(!countrytext.contains("Indian")) {
				c.click();
			}
			
		}
		enterphone.clear();
		enterphone.sendKeys(numbr);
		
		
	}
	
	public void clickSave() {
		
		saveBtn.click();
	}
	
	
	public static void selectByText(String text, WebElement e) {
		
		Select s = new Select(e);
		e.click();
		s.selectByVisibleText(text);
		
		
	}
}
