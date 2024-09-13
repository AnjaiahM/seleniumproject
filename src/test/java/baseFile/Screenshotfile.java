package baseFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Screenshotfile  {
	
//public WebDriver driver;

	public void takeScreenShot(WebDriver driver,String name) throws FileNotFoundException {
		
		// WebDriver driver;
		
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String destn=System.getProperty("user.dir")+"\\screenshots\\"+name+date()+".png";
System.out.println(destn);
try {
	FileHandler.copy(src, new File(destn));
} catch (IOException  e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
public String date() {
		
		
		System.out.println( new Date().toString().replace(" ", "_").replace(":", "_"));
		return new Date().toString().replace(" ", "_").replace(":", "_");
	}



//@AfterMethod
//public void rearDown(ITestResult result) {
//	String name=result.getName();
//	if(result.getStatus()==ITestResult.FAILURE) {
//		
//		try {
//			takeScreenShot(driver,name);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	driver.quit();
//}
}
