package prog_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.constants.Constants;

public class ActionsClass {
	WebDriver driver = new ChromeDriver();
	
	//@FindBy (xpath="//button[contains(text(),'Dropdown')]")
	//WebElement delayed_drpdwn;
	
	//@FindBy (xpath="//a[contains(text(),'Facebook')]")
	//WebElement drp_option;
	
	@Test
	public void ActionsClassDemo() {

		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIMEOUT));
		Actions a = new Actions(driver);
		WebElement delayed_drpdwn = driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]"));
		a.moveToElement(delayed_drpdwn);
		delayed_drpdwn.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.pollingEvery(Duration.ofSeconds(1));
		WebElement drp_option = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
		wait.until(ExpectedConditions.visibilityOf(drp_option));
		drp_option.click();
		driver.navigate().back();
		//SoftAssert sa = new SoftAssert();
		//sa.assertEquals(false, false)
		/*WebElement multiselect = driver.findElement(By.id("multiselect1"));
		Select s = new Select(multiselect);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Audi");
		
		WebElement selected = s.getFirstSelectedOption();
		System.out.println("Option selected is " + selected);*/
		/*Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'SeleniumTutorial')]"));
		WebElement target = driver.findElement(By.cssSelector("#ta1"));
		a.moveToElement(target).build().perform();
		a.dragAndDrop(source, target).perform();*/
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//driver.findElement(By.name("img")).sendKeys("C:\\Users\\91855\\Downloads\\Birla_L1.txt");
		
	}

}
