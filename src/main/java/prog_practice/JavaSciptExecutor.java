package prog_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.constants.Constants;


public class JavaSciptExecutor {

	WebDriver driver = new ChromeDriver();

	@Test
	public void JavaSciptExecutorMethod() {
		// TODO Auto-generated constructor stub

		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
		wait.withMessage("Wait is executed.");
		driver.findElement(By.linkText("VBScript")).click();

	}
	@Test(priority = 1)
	public void JSMethod() {

		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT)); //Explicit Wait
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement scrollable = driver.findElement(By.linkText("VBScript"));
		

		js.executeScript("arguments[0]. scrollIntoView(true);",scrollable );
		
		scrollable.click();



	}



}
