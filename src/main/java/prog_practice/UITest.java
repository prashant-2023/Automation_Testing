package prog_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class UITest {
	
	
	
	public static int linkCounter() {
		
		WebDriver driver = new ChromeDriver();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinks = links.size();
		return numberOfLinks;
		
	}
	
}
