package qafox_Selenium4;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Optional;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v123.network.model.ConnectionType;
import org.openqa.selenium.devtools.v123.security.Security;
import org.openqa.selenium.devtools.v85.network.Network;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Selenium4 {
	public static WebDriver driver;
	public Robot rb;
	public Selenium4() {}
public Selenium4(WebDriver driver)  {
	 this.driver= driver;
	
}
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
public void screenshot() throws IOException, InterruptedException  {
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	try {
		rb=new Robot();
	} catch (AWTException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	BufferedImage src = rb.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	
	//BufferedImage src = rb.createScreenCapture(new Rectangle(25,25,300,250));
	try {
		ImageIO.write(src, "PNG", new File("./target/rect.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	WebElement search=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	int x=search.getRect().getX();
	int y=search.getRect().getY();
	
	rb.mouseMove(x, y);
	rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	search.sendKeys("hyderabad");
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.delay(2000);
	rb.mouseWheel(12);
	BufferedImage src2 = rb.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	rb.delay(2000);
	rb.mouseWheel(-3);
	ImageIO.write(src2, "PNG",new File("./target/src2.png"));
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void new_Windoe_Tab() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.gmail.com");
		
		
	}
	
	@Test
	public void slowSpeed() {
		driver=new ChromeDriver();
		DevTools dev=((HasDevTools) driver).getDevTools();
		dev.createSession();
	//	dev.send(Network.emulateNetworkConditions(false, 150, 2500, 2000, Optional.of(ConnectionType.CELLULAR2G)));
		
	}
	
	
	@Test
	public void ignoreCertificateSSL() {
		driver=new ChromeDriver();
		
		DevTools dev=((HasDevTools) driver).getDevTools();
		dev.createSession();
		dev.send(Security.enable());
		dev.send(Security.setIgnoreCertificateErrors(true));
		driver.get("https://badssl.com");
		
		
		
		
	}
	
	@Test
	public void getBrowserLogs() {
		driver=new ChromeDriver();
	DevTools dev = ((HasDevTools) driver).getDevTools();
		dev.createSession();
		dev.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		dev.addListener(Network.requestWillBeSent(),
	p->{
		System.out.println("Url is: "+p.getRequest().getUrl());
		System.out.println("Method is :"+p.getRequest().getMethod());
	}
	);
		
		driver.get("https://www.facebook.com");
		
		
	}
	
}


