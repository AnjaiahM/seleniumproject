package listeners;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Base {
public void screenShot(WebDriver driver,String name) {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String ss=System.getProperty("user.dir")+"\\target\\"+name+"__"+randomDate()+".png";
	System.out.println("   File loaction to store in directory"+ss);
			try {
				FileHandler.copy(src, new File(ss));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
@Test
public String randomDate() {
	Calendar c=Calendar.getInstance();
	return  c.getTime() .toString().replace(" ", "_").replace(":", "_");
}
}
