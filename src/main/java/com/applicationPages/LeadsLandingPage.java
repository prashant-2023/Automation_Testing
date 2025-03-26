package com.applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.commons.BaseTest;

public class LeadsLandingPage extends BaseTest{

	public LeadsLandingPage() {
		
		PageFactory.initElements(webdriversession(), this);
		
	}
	
	@FindBy(xpath= "//div[contains(text(),'New')]")
	WebElement newBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Import')]")
	WebElement importBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Add to Campaign')]")
	WebElement addToCampnBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Change Status')]")
	WebElement changeStatusBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Change Owner')]")
	WebElement changeOwnerBtn;
	
	@FindBy(css= "#combobox-button-857")
	WebElement leadStatus;
	
	public void clickonNewBtn() {
		
		newBtn.click();
			}
	
	public void clickonImportBtn() {
		importBtn.click();
		
	}
	
	public void clickAddCampn() {
		addToCampnBtn.click();
	}
	
	public void clickChangeStatusBtn() {
		
		changeStatusBtn.click();
	}
	
	public void clickChangeOwnerBtn() {
		
		changeOwnerBtn.click();
	}

	public void selectLeadStatus(String status) {
	
	
	Select select = new Select(webdriversession().findElement(By.xpath("//button[@aria-label='Lead Status, New']")));
	select.selectByVisibleText(status);
	Logger().info("Following status is selected" + status);
}
}
