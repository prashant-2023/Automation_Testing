package com.testcases;


import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.applicationPages.HomePage;
import com.applicationPages.loginPage;
import com.commons.BaseTest;




public class TC_1_AddToCart extends BaseTest{

	//public WebDriver driver;
	public loginPage loginpage = new loginPage();
	public HomePage homepage = new HomePage();


	public TC_1_AddToCart() throws Exception {

		super();

	}

	@Test(dataProvider="testdata")
	public void addToCart(String url) {




		//webdriversession().get(url);

		//homepage.verifyPageTitle();
		//mouseHover(webdriversession().findElement(By.xpath("//*[@id=\"blogsmenu\"]")));
		//webdriversession().findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[1]/a")).click();
		//loginpage.login();
		//homepage.validateTitle();

		//	homepage.addToCart();
		//countLinksonWebPage();
		//countCheckBoxes();

		//


	}

	@DataProvider(name="testdata")
	public static Object[][] dataProvFunc(){
		return new Object[][]{
			{"https://omayo.blogspot.com/"},{"https://login.salesforce.com/"}
		};
	}

	@AfterTest
	public void closeTest() {

		webdriversession().close();

	}

}
