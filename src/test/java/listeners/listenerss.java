package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class listenerss  implements ITestListener {
//public WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {

String name=result.getName();
System.out.println(name+" started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		System.out.println(name+" Success");
			

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		System.out.println(name+" Failed");
		WebDriver driver = null;
		try {
			 driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Base b=new Base();
	//	b.screenShot(driver, name);
	
//	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	String ss=System.getProperty("user.dir")+"\\target\\"+name+".png";
//	System.out.println("   File loaction to store in directory"+ss);
//			try {
//				FileHandler.copy(src, new File(ss));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getName();
		System.out.println(name+" Skipped");
			
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String name=result.getName();
		System.out.println(name+" Failed becauseofTime");
			
	}

	@Override
	public void onStart(ITestContext context) {
		String name=context.getName();
		System.out.println(name+" started before all test");
			
	}

	@Override
	public void onFinish(ITestContext context) {
		String name=context.getName();
		System.out.println(name+" Finished after all test");
	}

	
	
	
}
