package seleniumproject.QAFox.JavascriptExecuter;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsClass {
public WebDriver driver;
Actions a;
	
	@BeforeMethod
	public void driverinitializar() {
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
		
		 a=new Actions(driver);
		 driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
	}
	
	@Test
	public void doubleClick() throws InterruptedException, IOException, AWTException {
		WebElement ele=driver.findElement(By.xpath("//div[@class='dropdown']/button"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./target/elescren.png"));
		scriollToEle(ele);
		a.doubleClick(ele).build().perform();
		robitScreenshot();
		
		
		Thread.sleep(3000);
		scrollToEnd(driver);
	}
	@Test
	public void keydownup() {
		WebElement li1=driver.findElement(By.xpath("//a[text()='compendiumdev']"));
		//a.moveToElement(li1).click().perform();
		a.keyDown(Keys.CONTROL).moveToElement(li1).click().keyUp(Keys.CONTROL).build().perform();
	}
	
	public void screenShot(String path) throws IOException {
File fsrc=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(fsrc, new File(path));
	}
	@Test
	public void rightClick() {
		
		
		
	}
	public void scrollToEnd(WebDriver driver) {
		 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHieght)");
	}
	public void scriollToEle(WebElement ele) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	
	public void robitScreenshot() throws AWTException, IOException {
		Robot rob=new Robot();
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(dim);
	BufferedImage bim=	rob.createScreenCapture(rec);
	ImageIO.write(bim, "png", new File("./target/robotimage.png"));
		
	}
	
}
