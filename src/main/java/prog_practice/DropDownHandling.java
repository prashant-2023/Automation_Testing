package prog_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownHandling {
	WebDriver driver = new ChromeDriver();
	
	
	
	@Test
	public void DropDownHandlingMethod() {
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		/*WebElement drpdown = driver.findElement(By.xpath("//select[@name='FromLB']"));
		Select s = new Select(drpdown);
		s.selectByVisibleText("Russia");
		driver.findElement(By.xpath("//input[@value='->']")).click();
		String selectedText = driver.findElement(By.xpath("//option[contains(text(),'Russia')]")).getText();
		
		Assert.assertEquals(selectedText, "Russia");*/
		linkcounter();
		checkboxcounter();
		driver.quit();
		
	}
	
	public void linkcounter() {
		int count=0;
		List<WebElement> clist = driver.findElements(By.tagName("a"));
		System.out.println(clist.size());
		for(WebElement e : clist) {
			count++;
			System.out.println("This is " + count + " link on the page : " + e.getText());
		
			
			
		}
		
	}
	public void checkboxcounter() {
		
		List<WebElement> checkboxlist = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=0;
		for(WebElement e : checkboxlist) {
			count++;
			System.out.println("This is " + count + " checkbox in the page : " + e.getText());
		}
	}

}
