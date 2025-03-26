package com.applicationPages;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.commons.BaseTest;
import com.utils.TestUtils;

public class EcomSearchPage extends BaseTest{

	public EcomSearchPage() {
		PageFactory.initElements(webdriversession(), this);
		}
		
		@FindBy (xpath="//b[contains(text(),'Wipro')]")
		WebElement title;
		
		@FindBy (xpath="//input[@aria-label=\"Search Amazon.in\"]")
		WebElement searchBox;
		
		@FindBy (xpath="//div[@class=\"left-pane-results-container\"]")
		WebElement productList;
		
		@FindBy (xpath="//div/input[contains(@value, 'air purifier')]")
		WebElement enteredProduct;
		
		WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(5));
		
		public void enterTextInSearchBox(String searchText) {
			
			searchBox.clear();
			searchBox.click();
			searchBox.sendKeys(searchText);
			genericwait(3000);
		}
		
		public void selectProductFromList(int index) {
			
			
			List<WebElement> suggestions = wait.until(
					ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"left-pane-results-container\"]/div")));
	
			if(index>0 & index<suggestions.size()) {
				
				
				WebElement expProduct = suggestions.get(index);
				//String productText = expProduct.getText();
				System.out.println(expProduct.getText());
				expProduct.click();
				
			}else {
				
				Assert.fail("Index is not valid.");
			}
			
			
		}
		public void verifySelectedProduct(String Product) {
			
			String actualProduct = enteredProduct.getText();
			
			if(actualProduct.equalsIgnoreCase(Product)) {
				
				System.out.println(actualProduct + " is selected.");
			}else {
				
				System.out.println("Issue in selecting the right product.");
			}
			
		}
		
		public boolean verifyTitle(String exptitle) {
			
			boolean flag= false;
			genericwait(5000);
			//String expTitle = "Wipro";
			
			
			
			//Assert.assertEquals(title.getText(), expTitle);
			String actualTitle = webdriversession().getTitle();
			try {
				
				if(actualTitle.contains(exptitle)){
					
					System.out.println("Title is " + actualTitle);
					flag = true;
				}
				
			}catch(Exception e) {
				
				System.out.println("Title not found."+"Title is " + actualTitle);
			}
			
			//TestUtils.takeScreenshot();
			return flag;
			
		}
		
		
		
		
}
