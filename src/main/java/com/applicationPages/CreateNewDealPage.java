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

public class CreateNewDealPage extends BaseTest{

	public CreateNewDealPage() {

		PageFactory.initElements(webdriversession(), this);
	}
	WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(5));
	
	
	@FindBy (xpath="//span[contains(text(),'Deals')]")
	WebElement deals;

	@FindBy (xpath ="//div[@class='menu-item-wrapper'][5]//button//i")
	WebElement plusIcon;
	
	@FindBy (xpath = "//span[text()= 'Create new Deal']")
	WebElement titleText;
	
	@FindBy (xpath = "//input[@name=\"title\"]")
	WebElement title;
	
	@FindBy (xpath = "//div[@name=\"company\"]")
	WebElement comp;
	
	
	@FindBy (xpath = "//div[@name=\"products\"]")
	WebElement products;
	

	public void enterDealData(String dealname, String company, String product) {


		mouseHover(deals);
		wait.until(ExpectedConditions.visibilityOf(plusIcon));
		plusIcon.click();
		
		validateDeal("Create New Deal");
		//wait.until(ExpectedConditions.elementToBeClickable(comp));
		title.sendKeys(dealname);
		selectCompany(company);
		selectProduct(product);
		
	

	}
	
	public void selectCompany(String company) {
		
		Logger().info("inside selectcompany method.");
		Reporter.log("inside selectcompany method.");
		WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(comp));
		
		
		comp.click();
		//wait.until(ExpectedConditions.visibilityOf(comp));		
		comp.sendKeys(company);
		
		wait.until(ExpectedConditions.visibilityOf(comp));
		webdriversession().findElement(By.xpath("//span[text()=" + "\' " + company + "\']")).click();
		
		
	}
	
	public void selectProduct(String product) {
		
		products.click();
		products.sendKeys(product);
		
		webdriversession().findElement(By.xpath("//div[@class='selected item addition'][//span[contains(text(), '"+ product + "')]]")).click();
		webdriversession().findElement(By.xpath("//div[@name=\"products\"]/i")).click(); //clicking cross icon
		webdriversession().findElement(By.xpath("//div[@name=\"products\"]//div//span[contains(text(), '" + product + "')]")).click();
		
			
	}

	public void validateDeal(String text) {
		
		WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(titleText));
		
		if(titleText.getText().equals(text)) {

			Reporter.log("User landed on " +text + " page successfully.");
			Logger().info("Landed on deal page successfully.");
		}
		

	}

	public void clickSave() {

		//save.click();
	}


}
