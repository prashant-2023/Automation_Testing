package com.commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import com.constants.Constants;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static Properties prop = new Properties();
    static WebDriverWait wait;
    protected Scenario sc;
    
    // 1. FIXED: Use ThreadLocal instead of a ConcurrentHashMap for thread safety
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    private static final Logger logger = LogManager.getLogger(BaseTest.class);
    
    
    static {
        try {
            FileInputStream fip = new FileInputStream(Constants.CONFIG_FILE_PATH);
            prop.load(fip);
            Reporter.log("Config file loaded successfully.");
        } catch (FileNotFoundException e) {
            Reporter.log("Issue loading config file.", true);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       
    }
    
    public static Logger Logger() {
        return logger;
    }
    
    public void setScenario(Scenario scenario) {
        this.sc = scenario;
    }
    
    // 2. FIXED: Retrieve driver from ThreadLocal
    public static WebDriver webdriversession() {
        if (tlDriver.get() == null) {
            try {
                tlDriver.set(createWebDriver());
                Logger().info("Driver initialized successfully.");
            } catch (Exception e) {
                Logger().error("Issue in initializing driver.", e);
            }
        }
        return tlDriver.get();
    }

    // 3. FIXED: Removed 'synchronized' as ThreadLocal handles thread isolation natively
    private static WebDriver createWebDriver() {
        WebDriver driver = null;
        String browser = prop.getProperty("browser");
        Reporter.log("Launching browser: " + browser, true);
        
        switch (browser.toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*", "--disable-extensions", 
                                   "--disable-notifications", "--start-maximized", 
                                   "--disable-save-password-bubble");
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                
                try {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    // Removed driver.get(URL) from here. Let the test/hook handle navigation.
                } catch(Exception e) {
                    Reporter.log("Issue in launching Chrome: " + e.getMessage(), true);
                    Logger().error("Error launching Chrome", e);
                    
                }
                break;

            case "firefox":
                FirefoxOptions fireOpt = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                driver = new org.openqa.selenium.firefox.FirefoxDriver(fireOpt);
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new org.openqa.selenium.edge.EdgeDriver();
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        if (driver != null) {
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIMEOUT));
            wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WEBDRIVER_WAIT_TIMEOUT));
            
            driver.manage().deleteAllCookies();
            
            // Navigate to URL once the driver is fully set up
            driver.get(prop.getProperty("crmURL"));
        }
        
        return driver;
    }

    // 4. ADDED: A safe teardown method to prevent zombie processes
    public static void quitDriver() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove(); // Crucial: removes the instance so the next test gets a fresh browser
        }
    }
    
 // Inside BaseTest.java
    @AfterSuite(alwaysRun = true)
    public void closebrowser() {
        quitDriver(); // Calls the ThreadLocal cleanup we created earlier
    }

    // --- Utility Methods Below --- //
    
    public void countLinksonWebPage(String tagname) {
        List<WebElement> links = webdriversession().findElements(By.tagName(tagname));
        int count = 0;
        System.out.println("Total no. of links on the webpage is : " + links.size());
        for (WebElement link: links) {
            count++;    
            System.out.println(link.getText());
        }
        System.out.println(count);
    }
    
    public void countCheckBoxes() {
        List<WebElement> checkboxes = webdriversession().findElements(By.xpath("//*[@type=\"checkbox\"]"));
        int count = 1;
        System.out.println("Total no. of checkboxes on the page are : " + checkboxes.size());
        for (WebElement checkbox : checkboxes) {
            System.out.println(count);
            System.out.println(checkbox.getAttribute("value"));
            count++;
        }
    }
    
    public boolean mouseHover(WebElement element) {
        boolean flag = false;
        Actions action = new Actions(webdriversession());
        try {
            action.moveToElement(element).build().perform();
            flag = true;
            Reporter.log("Mouse Hovered action performed.");
        } catch(StaleElementReferenceException e) {
            Reporter.log("Error in mouse hover at " + element);
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public void genericwait(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void selectStatus(String status) {
        genericwait(3000); // Consider replacing this with an Explicit Wait later
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