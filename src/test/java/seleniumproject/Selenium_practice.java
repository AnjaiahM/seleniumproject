package seleniumproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_practice {
	
	
	public WebDriver driver=new ChromeDriver();
	
	@Test
	public void robotmethod() {
		ChromeOptions op=new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		 WebDriver driver=new ChromeDriver(op);
		driver.get("https://demoqa.com/keyboard-events/");
		driver.manage().window().maximize();
		
	}
	

	@Test
	public void tabsmethod() throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	WebElement tab=	driver.findElement(By.xpath("//button[@id='tabButton']"));
	tab.click();
	Thread.sleep(1000);
	switch_to_tab();
	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
	}

	
	@Test
	public void  swithowindowsmethod() throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	WebElement tab=	driver.findElement(By.cssSelector("#windowButton"));
	tab.click();
	Thread.sleep(1500);
	Set<String> tabs=driver.getWindowHandles();
	System.out.println(tabs.size());
	String ptabname=driver.getWindowHandle();
	System.out.println(ptabname);
	 Iterator<String> it= tabs.iterator();
	 while(it.hasNext()) {
		 String child=it.next();
		 if(!ptabname.equalsIgnoreCase(child)) {
			 driver.switchTo().window(child);
			 System.out.println(driver.findElement(By.id("sampleHeading")).getText());
			 
		 }
	 }
	
		
	}
	@Test
	public void  swithowindowmessagesmethod() throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
	WebElement tab=	driver.findElement(By.cssSelector("#messageWindowButton"));
	//javascriol(tab);
	tab.click();
	Thread.sleep(1000);
	Set<String> tabs=driver.getWindowHandles();
	System.out.println(tabs.size());
	String ptabname=driver.getWindowHandle();
	System.out.println(ptabname);
	 Iterator<String> it= tabs.iterator();
	 while(it.hasNext()) {
		 String child=it.next();
		 if(!ptabname.equalsIgnoreCase(child)) {
			 driver.switchTo().window(child);
			// System.out.println(driver.findElement(By.tagName("body")).getText());
			 
			 System.out.println(driver.getTitle());
			 driver.close();
			 
		 }
	 }
	
		
	}

	@Test
	public void  alerts() throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	WebElement tab=	driver.findElement(By.cssSelector("#alertButton"));
	tab.click();
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	WebElement tab2=driver.findElement(By.id("timerAlertButton"));
	tab2.click();
	Thread.sleep(6000);
	System.out.println(a.getText());
	a.accept();
	WebElement tab3=driver.findElement(By.id("confirmButton"));
	tab3.click();
	
	System.out.println(a.getText());
	a.dismiss();
	
	WebElement tabbb=driver.findElement(By.id("promtButton"));
	tabbb.click();
	
	System.out.println(a.getText());
	a.  sendKeys("Anjaiahmartha");
	a.accept();
	
	
		
	}
	
	public void switch_to_tab() {
		Set<String> tabs=driver.getWindowHandles();
		System.out.println(tabs.size());
		String ptabname=driver.getWindowHandle();
		System.out.println(ptabname);
		 Iterator<String> it= tabs.iterator();
		 while(it.hasNext()) {
			 String child=it.next();
			 if(!ptabname.equalsIgnoreCase(child)) {
				 driver.switchTo().window(child);
				 break;
				 
			 }
		 }
	}
	
	public void javascriol(WebElement ele) {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  int yOffset = ele.getLocation().getY();
		  js.executeScript("window.scrollTo(0, arguments[0]);", yOffset);
		
	}
}
