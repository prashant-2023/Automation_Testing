package com.utils;



import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.commons.BaseTest;


public class TestUtils extends BaseTest{
	
	public static void testMethod() {
		
		System.out.println("test static method");
	}
	
	
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
	
	
	/**
	 * Captures and saves a screenshot to the Screenshots folder with timestamp
	 * @param filename - Base filename for the screenshot (timestamp will be added)
	 * @return - Full path to saved screenshot, or null if failed
	 */
	public static String takeSnapShot(String filename){
		String screenshotPath = null;
		
		try {
			// 1. Create Screenshots directory if it doesn't exist
			String screenshotsDir = System.getProperty("user.dir") + File.separator + "Screenshots";
			Files.createDirectories(Paths.get(screenshotsDir));
			
			// 2. Generate filename with timestamp to avoid overwrites
			String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS").format(new Date());
			screenshotPath = screenshotsDir + File.separator + filename + "_" + timestamp + ".png";
			
			// 3. Capture screenshot
			TakesScreenshot screenshot = (TakesScreenshot) webdriversession();
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			
			// 4. Copy to target location
			File destinationFile = new File(screenshotPath);
			FileUtils.copyFile(sourceFile, destinationFile);
			
			// 5. Verify file was created
			if (destinationFile.exists()) {
				BaseTest.Logger().info("✓ Screenshot saved successfully at: " + screenshotPath);
				System.out.println("[SUCCESS] Screenshot saved: " + screenshotPath);
				return screenshotPath;
			} else {
				BaseTest.Logger().warn("Screenshot file was not created at: " + screenshotPath);
				System.out.println("[WARNING] Screenshot file was not created");
				return null;
			}
			
		} catch (Exception e) {
			BaseTest.Logger().error("Failed to capture/save screenshot for: " + filename, e);
			System.out.println("[ERROR] Failed to capture screenshot: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
		  
	
	

}