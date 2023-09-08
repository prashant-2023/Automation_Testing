package prog_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WindowHandling {

	WebDriver driver = new ChromeDriver();
	@Test
	public void WindowHandlingMethod() {
		// TODO Auto-generated constructor stub

		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
		driver.manage().window().maximize();
		String mainwindowhandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(text(),'BlogThis!')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Share to Facebook')]")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> openwindowhandles = driver.getWindowHandles();

		Iterator<String> itr = openwindowhandles.iterator();

		while(itr.hasNext()) {

			String childwindow = itr.next();
			if(!mainwindowhandle.equalsIgnoreCase(childwindow)) {

				driver.switchTo().window(childwindow);
				
				
				
				if(driver.getTitle().contains("Facebook")) {
					String title1 = driver.getTitle();
					System.out.println("Title one is  " + " : " + title1);
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashant.chauhan4040@gmail.com");

					//driver.close();	
				}
				else if(driver.getTitle().contains("Blogger")) {
					String title2 = driver.getTitle();
					System.out.println("Title two is " + " : " + title2);
					driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
					//driver.close();
				}

			}
		}
		driver.switchTo().window(mainwindowhandle);
		System.out.println(driver.getTitle());
	//	driver.quit();

	}


}
