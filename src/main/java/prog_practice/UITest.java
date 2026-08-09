package prog_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.commons.BaseTest;




public class UITest {
	
	
	
	public static int linkCounter() {
        
		WebDriver driver = BaseTest.webdriversession();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinks = links.size();
		return numberOfLinks;
		
	}
	
}
