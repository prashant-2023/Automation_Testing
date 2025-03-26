package com.utils;

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
		Logger().info(result.getMethod().getMethodName() + " test got failed");
	}
}
