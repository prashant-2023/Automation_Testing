package prog_practice;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class PracticeAuto {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qaplayground.com/practice/tabs-windows");
		driver.manage().window().maximize();
		
		WebElement newTabButton = driver.findElement(By.id("tw-open-new-tab"));
		
		newTabButton.click();
		
		// Store parent window handle before switching to child window
		String parentWindow = driver.getWindowHandle();
		
		//driver.switchTo().window(driver.getWindowHandle())
		//TestUtils.switchToChildWindow();
		switchToChildWindow(driver);
		
//		Logger logger = LogManager.getLogger();
//		logger.log(Level.INFO, newWindowtitle);
		
		//driver.close();
		
		// Switch back to parent window
		driver.switchTo().window(parentWindow);
		WebElement successText = driver.findElement(By.xpath("//span[contains(text(),\"New tab opened\")]"));
		if(successText.isDisplayed()){
			System.out.println("Success Text is displayed: " + successText.getText());
			System.out.println("Test Passed");
		}
		driver.quit();	
		
	}
	
	public static  void switchToChildWindow(WebDriver driver) {
		
		String parentWindow = driver.getWindowHandle();
		
		//webdriversession().findElement(By.xpath("//a[@href=\"http://only-testing-blog.blogspot.in/2013/09/test.html\"]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window: allWindows) {
			
			if(!window.equals(parentWindow)) {
				
				driver.switchTo().window(window);
				System.out.println("Inside : " + driver.getTitle() + " window.");
				return;
				
			}
					
		}
		
		throw new RuntimeException("Child window not found.");
		
		
		
		
	}

}
