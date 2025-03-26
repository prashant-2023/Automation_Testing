package com.applicationPages;

import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.commons.BaseTest;

public class HomePage extends BaseTest{

	//WebDriver driver;

	public HomePage() {
		PageFactory.initElements(webdriversession(), this);
	}

	@FindBy(xpath = "//div[@class=\"app_logo\"]")
	WebElement appLogo;

	@FindBy (xpath = "//span[@class=\"title\"]")
	WebElement title;

	@FindBy (xpath = "//*[@class=\"inventory_item_label\"]")
	WebElement itemLabels;

	@FindBy (xpath = "//a[contains(text(),'SeleniumTutorial')]")
	WebElement dragitem;

	@FindBy (xpath = "//textarea[contains(text(),'The cat was playing in the garden.')]")
	WebElement droplocation;




	public void validateTitle() {

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		//wait.until(ExpectedConditions.visibilityOf(appLogo));

		String logoText = appLogo.getText();
		if(logoText.equalsIgnoreCase("Swag Labs")) {

			Assert.assertTrue(true);
			Reporter.log("****Logo text is displayed****");
		}
		else {

			System.out.println("Page is not loaded");

		}


	}

	public void addToCart() {

		String[] items = {"Backpack", "Bike-light"};

		for(String item : items) {

			webdriversession().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-"+ item.toLowerCase() + "']")).click();

		}
	}
	public void dragDrop(WebElement dragitem, WebElement droplocation) {

		Actions act = new Actions(webdriversession());

		act.dragAndDrop(dragitem, droplocation).build().perform();


	}
	public void verifyPageTitle() {

		String title = webdriversession().getTitle();
		System.out.println("Page Title is : " + title);

		Assert.assertTrue(title.contains("Salesforce"));

	}
}

