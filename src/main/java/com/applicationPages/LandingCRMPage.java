package com.applicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.commons.BaseTest;
import com.utils.TestUtils;

public class LandingCRMPage extends BaseTest{

	public LandingCRMPage() {
		PageFactory.initElements(webdriversession(), this);
		}
		
		@FindBy (xpath="//b[contains(text(),'Wipro')]")
		WebElement title;
		
		@FindBy (xpath="//div[@role='listbox']")
		WebElement settingsicon;
		
		@FindBy (xpath="//span[contains(text(),'Log Out')]")
		WebElement logoutbtn;
		
		@FindBy (xpath="//*[@id=\"ui\"]//p[text()='Invalid login']")
		WebElement invalidlogintext;
		
		public boolean verifyinvalidlogintext() {
			
			boolean flag = false;
			
			
				if(invalidlogintext.isDisplayed()) {
					
					System.out.println("Text is : " + invalidlogintext.getText());
					flag = true;
					
				}
			
			
			return flag;
		}
		
		public boolean verifyTitle() {
			
			boolean flag= false;
			genericwait(5000);
			String expTitle = "Wipro";
			
			
			//Assert.assertEquals(title.getText(), expTitle);
			
			try {
				String actualTitle = title.getText();
				if(actualTitle.equalsIgnoreCase(expTitle)){
					
					System.out.println("Title is " + actualTitle);
					flag = true;
				}
				
			}catch(Exception e) {
				
				System.out.println("Title not found.");
			}
			
			//TestUtils.takeScreenshot();
			return flag;
			
		}
		
		public void logout() {
			
			settingsicon.click();
			logoutbtn.click();
		}
}
