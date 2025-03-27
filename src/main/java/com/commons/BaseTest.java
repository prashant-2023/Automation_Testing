package com.commons;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


import com.constants.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static Properties prop;
	static WebDriverWait wait;
	static WebDriverWait waitMillis;
	protected Scenario sc;
	
	@Before
    public void setScenario(Scenario scenario) {
        this.sc = scenario; // Initialized scenario in a cucumber hook so that it can be used in all the classes which extends base class
    }
	
	
	public static HashMap<Long, WebDriver> map = new HashMap<>();

	
	public BaseTest() {

		try {
			FileInputStream fip = new FileInputStream(Constants.CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(fip);

		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	
		public static Logger Logger() {
			
			Logger log = LogManager.getLogger(BaseTest.class.getName());
			return log;
			
		}
		
		
		public static synchronized WebDriver webdriversession() {
	        Long threadId = Thread.currentThread().getId();
	        WebDriver driver = map.get(threadId);
	        
	        if (driver == null) {
	            try {
	                driver = setupWebDriver();
	                map.put(threadId, driver);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        return driver;
	    }


		public static synchronized WebDriver setupWebDriver() throws InterruptedException {
	        WebDriver driver = null;
	        ChromeOptions options = new ChromeOptions();
	        FirefoxOptions fireOpt = new FirefoxOptions();

	        String browser = prop.getProperty("browser");
	        
	        switch (browser.toLowerCase()) {
	            case "chrome":
	                options.addArguments("--disable-extensions", "--disable-notifications", "--start-maximized", "--disable-save-password-bubble");
	                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	                options.addArguments("--disable-Save-password-bubble");
	                driver = WebDriverManager.chromedriver().capabilities(options).create();
	                driver.get(prop.getProperty("crmURL"));
	                break;

	            case "firefox":
	                driver = WebDriverManager.firefoxdriver().capabilities(fireOpt).create();
	                driver.get(prop.getProperty("crmURL"));
	                break;

	            case "edge":
	                driver = WebDriverManager.edgedriver().create();
	                driver.get(prop.getProperty("crmURL"));
	                break;

	            default:
	                throw new IllegalArgumentException("Unsupported browser: " + browser);
	        }

	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIMEOUT));
	        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WEBDRIVER_WAIT_TIMEOUT));
	        waitMillis = new WebDriverWait(driver, Duration.ofMillis(Constants.WEBDRIVER_WAIT_TIMEOUT));
	        driver.manage().deleteAllCookies();
	       // map.put(Thread.currentThread().getId(), driver);
	        return driver;
	    }

	public void countLinksonWebPage() {


		List<WebElement> links = webdriversession().findElements(By.tagName("a"));
		//List<WebElement> checkboxes = webdriversession().findElements(By.xpath("//*[@type=\"checkbox\"]"));
		
		//List<WebElement> activelinks = webdriversession().findElements(By.tagName("a"));
		
		
		int count = 0;

		System.out.println("Total no. of links on the webpage is : " + links.size());

		for (WebElement link: links)
		{

			count++;	
			
			System.out.println(link.getText());

		}
		System.out.println(count);
	}
	public void countCheckBoxes() {



		List<WebElement> checkboxes = webdriversession().findElements(By.xpath("//*[@type=\"checkbox\"]"));

		int count = 1;

		System.out.println("Total no. of checkboxes on the page are : " + checkboxes.size());

		for (int i = 0; i<checkboxes.size(); i++)
		{


			System.out.println(count);
			System.out.println(checkboxes.get(i).getAttribute("value"));
			count++;


		}
	}
	public boolean mouseHover(WebElement element) {
		
		boolean flag = false;

		Actions action = new Actions(webdriversession());
		
				
		try {
			action.moveToElement(element).build().perform();
			flag=true;
			Reporter.log("Mouse Hovered action performed.");
		}
		catch(StaleElementReferenceException e) {
			
			Reporter.log("Error in mouse hover at " + element);
			e.printStackTrace();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	
	}
	
	public void genericwait(long s) {
		
		try {
			Thread.sleep(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectStatus(String status) {
		
		genericwait(3000);
		
		WebElement statusdrpdwn = webdriversession().findElement(By.cssSelector("div[name='status'][role='listbox']"));
		statusdrpdwn.click();
		WebElement statusOption = webdriversession().findElement(By.xpath("//*[@name='status' and @role='listbox']//span[contains(text(),'" + status + "')]"));
		statusOption.click();
		
	}
	
	public void selectSource(String option) {
		
		WebElement source_drpdwn = webdriversession().findElement(By.xpath("//*[@name='source' and @class='ui selection dropdown']"));
		
		source_drpdwn.click();
		
		WebElement srcOption = webdriversession().findElement(By.xpath("//*[@name='source' and @role='listbox']//span[contains(text(),'" + option +"')]"));
		srcOption.click();
	}
	
	


}


