package com.applicationPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.commons.BaseTest;

public class CreateNewCompanyPage extends BaseTest{

	public CreateNewCompanyPage() {

		PageFactory.initElements(webdriversession(), this);
	}

	
	
	@FindBy (xpath="//span[contains(text(),'Companies')]")
	WebElement companies;

	@FindBy (xpath="//div[@class='item']/a/button")
	WebElement createBtn;	

	@FindBy (xpath="//label[contains(text(),'Name')]//following::div[2]/div//following-sibling::input")
	WebElement name;

	@FindBy (xpath="//label[contains(text(),'Email')]//following::div[2]/div//following-sibling::input")
	WebElement mail;

	@FindBy (xpath = "//*[@name=\"address\"]")
	WebElement enteraddress;

	@FindBy (xpath="//input[@name=\"city\"]")
	WebElement entercity;

	@FindBy (xpath="//input[@name=\"state\"]")
	WebElement enterstate;

	@FindBy (xpath="//input[@name=\"zip\"]")
	WebElement zip_code;

	@FindBy (xpath="//label[contains(text(),'Industry')]//following::input[1]")
	WebElement indstry;

	@FindBy (xpath="//div[@class='item']//button[2]")
	WebElement save;

	@FindBy (xpath="//span[@class='selectable']")
	WebElement company;


	public void enterDealData(String dealname, String email, String address, String city, String State, String zip, String industry) {


		mouseHover(companies);

		companies.click();
		createBtn.click();
		name.sendKeys(dealname);
		mail.sendKeys(email);
		enteraddress.sendKeys(address);
		entercity.sendKeys(city);
		enterstate.sendKeys(State);
		zip_code.sendKeys(zip);
		indstry.sendKeys(industry);


	}

	public void validateCompany(String comp) {
		
		WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(webdriversession().findElement(By.xpath("//p[contains(text(),"+"\'"+ comp +"\')]"))));
		
		if((webdriversession().findElement(By.xpath("//p[contains(text(),"+"\'"+ comp +"\')]")).getText()).equals(comp)) {

			Reporter.log(comp + " is created successfully.");
		}
		

	}

	public void clickSave() {

		save.click();
	}


}
