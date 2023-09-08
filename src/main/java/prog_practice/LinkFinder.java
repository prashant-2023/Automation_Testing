package prog_practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LinkFinder{
	static WebDriver driver;
	public static WebDriverWait wait;
	
	@Test
	public void scroller() {
		
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Actions act = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//*[@id='page-footer']/div/div/a"));
		//act.scrollToElement(element).click();
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		System.out.println("Total Number of Links on this webpage are : " + linkCounter());
		
		validateLanding();
		//Assert.assertEquals("WebElement", "");
		
		
		
	}
	
	public static void validateLanding() {
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='docusaurus_skipToContent_fallback']/div[1]/h1"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(ele));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual  = ele.getText();
		String expected = "Make sure your code lands";
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> win_itr =windows.iterator();
		if(win_itr.hasNext()) {
			String currenthandle = driver.getWindowHandle();
			driver.switchTo().window(currenthandle);
			Assert.assertEquals(actual, expected);
			
		}
		
	}
	
	public static int linkCounter() {
		
		int count=1;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinks = links.size();
		for(WebElement ele : links) {
			
		System.out.println(" This is " + count + "  link " + ele.getText());
			count++;
		}
		return numberOfLinks;
		
	}

}
