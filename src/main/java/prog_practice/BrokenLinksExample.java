package prog_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import java.util.List;


public class BrokenLinksExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaplayground.com/practice/links"); // Replace with your target URL
        driver.manage().window().maximize();

        // 1. Get all anchor tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());
        int brokenLinksCount = 0;

        // 2. Iterate through each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");

            // 3. Skip null or empty URLs
            if (url == null || url.isEmpty() || url.equals("#")) {
                System.out.println("URL is either not configured or empty.");
                continue;
            }

            try {
                // 4. Make request using Rest Assured
                Response response = given()
                        .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                        .redirects().follow(true)
                        .when()
                        .head(url)
                        .then()
                        .extract()
                        .response();

                // 5. Check response code and only print broken links
                int responseCode = response.getStatusCode();
                if (responseCode >= 400) {
                    System.out.println(url + " is a BROKEN link (Status: " + responseCode + ")" + " | Link Text Is: " + link.getText());
                    brokenLinksCount++;
                }
            } catch (Exception e) {
                System.out.println(url + " is a BROKEN link (Exception occurred: " + e.getMessage() + ")");
            }
        }
        System.out.println("Total broken links found: " + brokenLinksCount);
        driver.quit();
    }
}