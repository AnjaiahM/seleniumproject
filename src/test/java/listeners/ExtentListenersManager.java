package listeners;

import java.awt.Color;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentListenersManager implements ITestListener{

	ExtentSparkReporter sparkreport;
	ExtentReports extent;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		Base b=new Base();
		String path=System.getProperty("user.dir")+"\\screenshots\\spartreport"+b.randomDate()+".html";
		System.out.println(path);
		sparkreport=new ExtentSparkReporter(path);
		sparkreport.config().setDocumentTitle("Listerner Reports in TestNG");
		sparkreport.config().setReportName("GoogleLoginReport");
		sparkreport.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkreport);
		extent.setSystemInfo("project","retails");
		extent.setSystemInfo("browser", "Edge");
	
	}
//	@Override
//	public void onTestStart(ITestResult result) {
//		String name=result.getName();
//    test=extent.createTest(name);
//    test.log(test.getStatus(),"Test started is: "+name);
//
//	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
	    test=extent.createTest(name);
	    test.log(Status.PASS, "Test Case passed is :"+name);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name= result.getTestName()+"_"+ result.getName();
	    test=extent.createTest(name);
	    test.log(Status.FAIL, "Test Case Failed is :"+name);
	    if(result.getStatus()==TestResult.FAILURE) {
	    	extent.attachReporter(sparkreport);
	    }
	    
//	    WebDriver driver = null;
//		try {
//			 driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Base b=new Base();
//		b.screenShot(driver, name);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name= result.getTestName()+"_"+ result.getName();
	    test=extent.createTest(name);
	    test.log(Status.SKIP, "Test Case Skipped is :"+name);
	}

	

	@Override
	public void onFinish(ITestContext context) {
		String name=context.getClass()  .getName()+"_"+ context.getName();
	    test=extent.createTest(name);
	    test.log(test.getStatus(), "Test Case finished is :"+name);
	    extent.flush();
	}

}
