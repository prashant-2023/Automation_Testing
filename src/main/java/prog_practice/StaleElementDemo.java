package prog_practice;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.commons.BaseTest;

public class StaleElementDemo extends BaseTest{
	
	
	
	@Test
	public void StaleElementDemoTest() {
		
		webdriversession().get("https://www.pavantestingtools.com/");
		webdriversession().findElement(By.xpath("//a[contains(text(),'YouTube Videos')]")).click();
		webdriversession().navigate().back();
		webdriversession().findElement(By.xpath("//a[contains(text(),'YouTube Videos')]")).click();
		
		

}
}
