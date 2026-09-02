package prog_practice;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPagination {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaplayground.com/practice/data-table");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pageTitle = driver.findElement(By.xpath("//p[text() = 'Interactive Table']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", pageTitle);
		
		wait.until(ExpectedConditions.visibilityOf(pageTitle));
		WebElement nxtBtn = driver.findElement(By.xpath("//button[@aria-label=\"Next page\"]"));
		
		
		
		
		//int rows = driver.findElements(By.xpath("//table/tbody/tr")).size();
		int i=1;
		while(nxtBtn.isEnabled()) {
		
		while(i<=5) {
			
			String major = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
			System.out.println("Majors are: "+ major);
			i++;					
		}
		try{
			
			driver.findElement(By.xpath("//button[@aria-label=\"Next page\"]")).click();
			WebElement status = driver.findElement(By.xpath("//*[@role=\"status\"]"));
			status.click();
			System.out.println(status.getText());
		}catch(Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text() = 'Next']"))));
			driver.findElement(By.xpath("//a[text() = 'Next']")).click();
			driver.findElement(By.xpath("//*[@role=\"status\"]")).click();
			System.out.println("Problem clicking next button.");
		}
		
		}	
		

	}

}
