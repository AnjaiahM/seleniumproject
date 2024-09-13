package qafox;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownload {
public WebDriver driver;
	
	@Test
	public void filedownload() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> hap=new HashMap<String,Object>();
		hap.put("profile.default_content_settings.popups", 0);
		String downloadpath=System.getProperty("user.dir");
		hap.put("download.default_directory", downloadpath);
		options.setExperimentalOption("prefs", downloadpath);
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		WebElement downloadfile=driver.findElement(By.xpath("//a[text()='ZIP file']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",downloadfile );
		Thread.sleep(5000);
		File fi=new File(System.getProperty("user.dir")+"");
		
		
	}
}
