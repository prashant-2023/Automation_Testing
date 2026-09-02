package com.applicationPages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.commons.BaseTest;
import com.utils.EncryptionUtils;


public class LoginCRMPage extends BaseTest{

	public LoginCRMPage() {
		
		PageFactory.initElements(webdriversession(), this);
	}
	
	@FindBy (xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy (name="password")
	WebElement paswrd;
	
	@FindBy (xpath="//*[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	@FindBy (xpath= "//iframe[@title=\"Sign in with Google Button\"]")
	WebElement googleiFrame;
	
	@FindBy (xpath= "//div[text()='Sign in as prashant']")
	WebElement signInButton;
	
	@FindBy(xpath = "//iframe[@title='Sign in with Google Button']")
	private WebElement googleIframe;

	@FindBy(xpath = "//div[@class='ssJRIf' and contains(., 'Sign in as prashant')]")
	private WebElement signInAsPrashantBtn;

	@FindBy(xpath = "//div[@role='link']//div[contains(text(), 'prashant kumar')]")
	private WebElement prashantKumarAccount;
	
	
	
	public void logintoCRM() {
	    //WebDriver driver = WebDriverSession(); // Using your custom driver session
	   WebDriverWait wait = new WebDriverWait(webdriversession(), Duration.ofSeconds(10));
	    
	    // 1. Switch to the Google 'One Tap' Iframe
	    //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(googleIframe));
	    
	    // 2. Click the 'Sign in as' button
	   
	    //wait.until(ExpectedConditions.elementToBeClickable(email)).click();
	    
	    email.sendKeys(prop.getProperty("username"));
	    paswrd.sendKeys(EncryptionUtils.decode(prop.getProperty("correctpassword")));
	    wait.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();
	    // 3. Switch back to main content to detect the new window
	   // webdriversession().switchTo().defaultContent();
	    
	    // 4. Capture Window Handles
/*	    String mainWindow = webdriversession().getWindowHandle();
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2)); // Wait for popup to appear
	    Set<String> allWindows = webdriversession().getWindowHandles();
	    
	    for (String handle : allWindows) {
	        if (!handle.equals(mainWindow)) {
	            // 5. Switch to Child Window (Google Account Picker)
	        	webdriversession().switchTo().window(handle);
	            break;
	        }
	    }
	    */
	    
	    // 6. Click on the specific account 'prashant kumar'
	    
	    
	    // 7. Optional: Switch back to main window after child closes
	    //webdriversession().switchTo().window(mainWindow);
	}
	
}
