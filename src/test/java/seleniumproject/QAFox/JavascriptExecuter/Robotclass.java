package seleniumproject.QAFox.JavascriptExecuter;


import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;
import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GeneralUtilities.utilites;
import Intializar.GetDriver;

public class Robotclass {
	public WebDriver driver;
	
	public Actions a;

	@BeforeMethod
	public void driverinitializar() throws AWTException, IOException {
		if(driver==null) {
		String browser="chrome";
		switch(browser){
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "FireFox":
			driver=new FirefoxDriver();
			break;
		case "Edge":
			driver=new EdgeDriver();
			break;
		default: System.out.println("no driver found......");
		}
		}
		 a=new Actions(driver);
		 driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
			}
	
	@Test
	public void getScreenShot() {
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement search=driver.findElement(By.name("search"));
		utilites.clic_sendKeys(search,"Anjaiahmartha");
		rb.keyPress(KeyEvent.VK_ENTER);
		WebElement qa=driver.findElement(By.xpath("//a[text()='Qafox.com']"));
		System.out.println(qa.getLocation());
		rb.mouseMove(189, 79);
		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.mousePress(189);
//		rb.mouseRelease(189);
		;
		System.out.println(driver.findElement(By.cssSelector("div#search")).getLocation());
		java.awt.Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(d);
		BufferedImage bui= rb.createScreenCapture(rec);
		try {
			ImageIO.write(bui, "PNG",new File("./target/robosearcg.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rb.mouseWheel(12);
		rb.delay(2000);
		rb.mouseWheel(-3);
		
	}
	
	@Test
	public void uploadFile() {
	
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement fileup=driver.findElement(By.cssSelector("input#fileinput"));
		// ((JavascriptExecutor)driver).executeScript("arguments[0].click()", fileup);
		Actions actions=new Actions(driver);
		actions.moveToElement(fileup).click().build().perform();
		String path=System.getProperty("user.dir")+"\\target\\robosearcg.png";
		System.out.println(System.getProperty("user.dir")+"\\target\\robosearcg.png");
		//fileup.sendKeys(System.getProperty("user.dir")+"\\target\\robosearcg.png");
		//fileup.click();
		StringSelection ste=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ste, null);
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(3000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		rb.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}
