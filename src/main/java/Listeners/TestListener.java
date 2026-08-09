package Listeners;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.commons.BaseTest;

public class TestListener extends BaseTest implements ITestListener{
	@Override
	public void onStart(ITestContext context) {
		//ITestListener.super.onStart(context);
		Logger().info("***************Execution Started******************");
	}

	@Override
	public void onFinish(ITestContext context) {
		//ITestListener.super.onFinish(context);
		Logger().info("***************End Of Execution******************");
	}


	@Override
	public void onTestStart(ITestResult result) {

		//ITestListener.super.onTestStart(result);
		Logger().info(result.getMethod().getMethodName() + " test execution started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	//	ITestListener.super.onTestSuccess(result);
		Logger().info(result.getMethod().getMethodName() + " test is passed.");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		//ITestListener.super.onTestFailure(result);
		Logger().error(result.getName() + " test got failed");
		
		try {
			TakesScreenshot scrnshot = (TakesScreenshot) webdriversession();
			File srcFile = scrnshot.getScreenshotAs(OutputType.FILE);
			String imagePath = System.getProperty("user.dir")  + File.separator + result.getTestName() +"_" + new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date())+ ".png";
			
			Files.createDirectories(Paths.get(System.getProperty("user.dir")+ "\\Screenshots" ));
			
			FileUtils.copyFile(srcFile, Paths.get(imagePath).toFile());
		}catch(Exception e) {
			
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
		
	}
}
