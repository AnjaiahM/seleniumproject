package qafox;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.retryAnaliser;

import baseFile.Screenshotfile;

//@Listeners({ITestListenerClass.class})
public class testng extends Screenshotfile{
	public WebDriver driver;
	
	
	
	
	@Test(priority=1)
	public void invlidlogin() {
		System.out.println("invalidlogin");
		
	}
//	@Test(priority=2,dependsOnMethods = "alwayRun",alwaysRun = true)
//	public void checkInvLid() {
//		System.out.println("checkInv");
//	}

	@Test(priority=0,dependsOnMethods = {"invlidlogin"},ignoreMissingDependencies = true)
	public void alwayRun() {
		System.out.println("alwayrun");
	}
	
	public String failTestMethod(String str) {
		return str;
	}
	@Test
	public void failTestMethodassert() {
		
		;
		Assert.assertEquals("ll", failTestMethod("ppp"));
	}
	@Test(timeOut = 10)
	public void faileTimeOut() throws InterruptedException {
		Thread.sleep(100);
		System.out.println("timeout");
	}

	@Test(dependsOnMethods = {"faileTimeOut"})
	public void skippedMethod() {
		System.out.println("skipped");
	}
	
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		
		}

		
	@Test()  ///retryAnalyzer=com.listeners.retryAnaliser.class
	public void googlegetText() {
		
		Assert.assertEquals("googl", driver.getTitle());
	}
	
	@AfterMethod
	public void rearDown(ITestResult result) {
		String name=result.getName();
		if(result.getStatus()==ITestResult.FAILURE) {
			
			try {
				takeScreenShot(driver,name);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		driver.quit();
	}
	
}
