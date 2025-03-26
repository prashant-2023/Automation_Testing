package com.testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.applicationPages.EcomSearchPage;
import com.commons.BaseTest;

public class EcomSearch extends BaseTest{
	
	EcomSearchPage ecm = new EcomSearchPage();

	public EcomSearch() {
		// TODO Auto-generated constructor stub
		
		super();
		
	}

	@Test
	public void searchProduct() {
		
		genericwait(10);
		
		
		
	ecm.verifyTitle("Testing");
	
	String parentWindow = webdriversession().getWindowHandle();
	
	webdriversession().findElement(By.xpath("//a[@href=\"http://only-testing-blog.blogspot.in/2013/09/test.html\"]")).click();
	
	WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.visibilityOf(webdriversession().findElement(By.xpath("//a[contains(text(),'Only Testing')]"))));
	
	Set<String> allWindows = webdriversession().getWindowHandles();
	
	for(String window: allWindows) {
		
		if(!window.equals(parentWindow)) {
			
			webdriversession().switchTo().window(window);
			System.out.println("Inside : " + webdriversession().getTitle() + " window.");
			break;
			
		}
				
	}
	
	webdriversession().close();
	webdriversession().switchTo().window(parentWindow);
	System.out.println("Inside : " + webdriversession().getTitle() + " window now.");
	
	
	/*	ecm.enterTextInSearchBox("air purifier");
		ecm.selectProductFromList(2);
		ecm.verifySelectedProduct("air purifier");*/
		
	}
}
