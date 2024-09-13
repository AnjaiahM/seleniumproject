package com.listeners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import baseFile.Screenshotfile;

public class ITestListenerClass extends TestListenerAdapter {   //implements ITestListener
	public WebDriver driver;
Screenshotfile sfile=new Screenshotfile();
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getTestContext().getName()+"_"+result.getName();
		System.out.println(name+" started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		System.out.println(name+" Success");

	}

//	@Override
//	public void onTestFailure(ITestResult result) {
//		String name=result.getTestContext().getName()+"_"+ result.getName();
//		System.out.println(name+" Failure");
//WebDriver driver=null;
//		
//		try {
//			 driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			sfile.takeScreenShot(driver, name);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getName();
		System.out.println(name+" Skipped");
		WebDriver driver=null;
		
		try {
			 driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sfile.takeScreenShot(driver, name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		 WebDriver driver = null;
		String name=result.getName();
		System.out.println(name+" Failed of Timeout");
        
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("started");

	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Completed");
	}

	
	
	
}
