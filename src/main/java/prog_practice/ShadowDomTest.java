package prog_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.TestUtils;

import java.time.Duration;

public class ShadowDomTest {
    public static void main(String[] args) {
        // Initialize the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            // 1. Navigate to the practice page
            driver.get("https://qaplayground.com/practice/shadow-dom");

            // Explicit wait setup to guarantee page stability
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // 2. Locate the Shadow Host element present in the main Light DOM
            WebElement shadowHost = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-testid=\"shadow-host-basic\"]"))
            );

            // 3. Extract the hidden SearchContext (The Shadow Root)
            SearchContext shadowRoot = shadowHost.getShadowRoot();

            // 4. Target the hidden button strictly using a CSS Selector (XPath will crash)
            WebElement shadowButton = shadowRoot.findElement(By.cssSelector("[data-testid=\"shadow-btn-basic\"]"));

            // 5. Interact and verify
            System.out.println("Text inside Shadow DOM element: " + shadowButton.getText());
            shadowButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(shadowButton));
            System.out.println("Successfully interacted with the shadow element!");
            TestUtils.takeSnapShot("shadow_dom_button_clicked");
            WebElement verification = driver.findElement(By.xpath("//span[contains(text(), \"Shadow button clicked\")]"));
            
            if(verification.isDisplayed()) {
            					System.out.println("Shadow button click confirmed!");
            					TestUtils.takeSnapShot("shadow_dom_confirmation_verified.");
			} else {
				System.out.println("Shadow button click not confirmed.");
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Teardown the session safely
            driver.quit();
        }
    }
}
