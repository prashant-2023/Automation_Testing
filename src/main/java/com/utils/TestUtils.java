package com.utils;



import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.commons.BaseTest;


public class TestUtils extends BaseTest{
	
	
	public static String switchToChildWindow() {
		
		String parentWindow = webdriversession().getWindowHandle();
		
		//webdriversession().findElement(By.xpath("//a[@href=\"http://only-testing-blog.blogspot.in/2013/09/test.html\"]")).click();
		
		Set<String> allWindows = webdriversession().getWindowHandles();
		
		for(String window: allWindows) {
			
			if(!window.equals(parentWindow)) {
				
				webdriversession().switchTo().window(window);
				System.out.println("Inside : " + webdriversession().getTitle() + " window.");
				return window;
				
			}
					
		}
		
		throw new RuntimeException("Child window not found.");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void selectByText(String value) {
		WebElement e= webdriversession().findElement(By.xpath("//select[@name=\"SiteMap\"]"));
		Select s = new Select(e);
		s.selectByVisibleText(value);
		String selectedvalue= s.getFirstSelectedOption().getText();
		if(value.equals(selectedvalue)) {
			
			System.out.println("value" + selectedvalue + " is selected");
		}
		
		
	}
	
	
	public static void takeSnapShot(String filename){
		//Convert web driver object to TakeScreenshot
		try {
			TakesScreenshot scrnshot = (TakesScreenshot) webdriversession();
			File srcFile = scrnshot.getScreenshotAs(OutputType.FILE);
			String imagePath = System.getProperty("user.dir")  + File.separator + filename +"_" + System.currentTimeMillis()+ ".png";
			
			Files.createDirectories(Paths.get(System.getProperty("user.dir")+ "\\Screenshots" ));
			
			FileUtils.copyFile(srcFile, Paths.get(imagePath).toFile());
		}catch(Exception e) {
			
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
		
}
		  
	
	

}