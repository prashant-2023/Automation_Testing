package com.commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.constants.Constants;
import com.log4j.LoggerClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static Properties prop;
	static WebDriverWait wait;
	public static  WebDriver driver;
	public static HashMap<Long, WebDriver> map = new HashMap<>();


	public BaseTest() {

		try {
			FileInputStream fip = new FileInputStream(Constants.CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(fip);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




	public  WebDriver webdriversession() {

		WebDriver currentThreadId = map.get(Thread.currentThread().getId());

		if(currentThreadId == null) {

			try {
				setupWebDriver();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			currentThreadId = map.get(Thread.currentThread().getId());
		}


		return currentThreadId;

	}


	public void setupWebDriver() throws InterruptedException {

		driver= new ChromeDriver();	


		ChromeOptions options = new ChromeOptions();
		//prop = new Properties();

		String browser = prop.getProperty("browser");
		//driver = new WebDriver();
		switch(browser) {


		case "chrome" :

			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			options.addArguments("--remote-allow-origins");
			options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			//options.addArguments("disable-infobars");
			WebDriverManager.chromedriver().setup();
			break;

		case "chromeheadless" :

			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			options.addArguments("--headless");
			options.addArguments("--remote-allow-origins");
			options.setExperimentalOption("excludeSwitches", "enable-automation");
			WebDriverManager.chromedriver().setup();
			break;

		case "Firefox" :

			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			options.addArguments("--remote-allow-origins");
			options.setExperimentalOption("excludeSwitches", "enable-automation");
			WebDriverManager.firefoxdriver().setup();
			break;

		case "Edge" :

			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			options.addArguments("--remote-allow-origins");
			options.setExperimentalOption("excludeSwitches", "enable-automation");
			WebDriverManager.edgedriver().setup();
			break;

		}
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		map.put(Thread.currentThread().getId(), driver);


	}

	public void countLinksonWebPage() {


		List<WebElement> links = webdriversession().findElements(By.tagName("a"));
		//List<WebElement> checkboxes = webdriversession().findElements(By.xpath("//*[@type=\"checkbox\"]"));

		int count = 0;

		System.out.println("Total no. of links on the webpage is : " + links.size());

		for (int i = 0; i<=links.size(); i++)
		{

			count++;	
			System.out.println(count);
			System.out.println(links.get(i).getText());



		}
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
	public void mouseHover(WebElement element) {

		Actions action = new Actions(webdriversession());
		action.moveToElement(element).build().perform();
		Reporter.log("Mouse Hovered on Menu.");


	}


}


