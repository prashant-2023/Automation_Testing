package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.commons.BaseTest;

public class SHL_Assessment extends BaseTest{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://a2z.aspiringminds.com/selenium/OsATOXWCjdBW_2Fz2muWprehclThRc55bf4DnuMHOGziE3PXmYUk2W0FA38MOIgPTQoF7AU1IsVsytwjR7LfWqeb0mwQVGzZhZN1lP7poQfxQ_3D/products");
		String product = "AC";
		findProduct(product);

	}

	public static int findProduct(String name) {
		
		int count =0;
		
		webdriversession().findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(name);
		webdriversession().findElement(By.xpath("(//div[@class='left-pane-results-container'])[1]/child::div[1]")).click();
		
		String productText = webdriversession().findElement(By.xpath("//h3[normalize-space()='" + name + "']")).getText();
		
		if(productText == name) {
			
			count ++;
			
			System.out.println(count  + name + " are found.");
			
		}
		else {
			
			return -1;
		}
		return count;
		
	}
	
}
