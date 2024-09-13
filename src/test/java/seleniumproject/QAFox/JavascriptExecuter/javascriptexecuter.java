package seleniumproject.QAFox.JavascriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class javascriptexecuter {
public WebDriver driver;


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
	
	Actions a=new Actions(driver);
}
 @Test
	public void alert() throws InterruptedException {
	 JavascriptExecutor js=  ((JavascriptExecutor)driver);
	 Alert a;
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	//	js=   (JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("alert('Anjaiahmartha')");
		
		//a.accept();
		
		js=  (JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("prompt('please send me your name')");
		// driver.switchTo().alert().sendKeys("Anjaihamrtha");
		 Thread.sleep(2000);
		//a.sendKeys("Anjaiahmartha");
//		//a.accept();
//		Thread.sleep(2000);
		js=  (JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("confirm('is it working')");
		a=driver.switchTo().alert();
		a.accept();
		
	}
 
 
 
 
 
 
 
 
 
 @Test
public void Actionsclascopytext() {
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	WebElement source=driver.findElement(By.cssSelector("#ta1"));
	Actions a=new Actions(driver);
	a.keyDown(source,Keys.SHIFT).sendKeys("Anjaiahmartha").build(). perform();
	a.sendKeys(Keys.CONTROL,"A").sendKeys(Keys.CONTROL,"c") .build().perform();
	WebElement destination=driver.findElement(By.xpath("//h2[text()='Text Area Field Two']//following::  textarea"));
	a.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys(Keys.CLEAR).    sendKeys(Keys.CONTROL,"v").build().perform();
//	a.sendKeys(destination, Keys.CONTROL,"A").sendKeys(Keys.CLEAR).    sendKeys(Keys.CONTROL,"v").build().perform();
}

 @Test
 public void clickonele() {
	 driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		jsTitleofpage();
		//js.executeScript("(document.getElementById('ta1').value="red";
		JavascriptExecutor js=  ((JavascriptExecutor)driver);
	    js.executeScript("document.getElementById('alert1').click()");
	    Actions a=new Actions(driver);
	    driver.switchTo().alert().accept();
	    WebElement radio1=driver.findElement(By.cssSelector("input#radio1"));
	    WebElement radio2=driver.findElement(By.cssSelector("input#radio2"));
	    javascriptExecutor(radio1);
	    
	    }
 
 public void javascriptExecutor(WebElement ele) {
	  JavascriptExecutor js=  ((JavascriptExecutor)driver); 
	 js.executeScript("arguments[0].click();", ele);
	 
 }
 
 @Test
 public void blinkingColr() throws InterruptedException, IOException {
	 driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	System.out.println(	jsTitleofpage());
	System.out.println(jsUrlofpage());
		WebElement butotn=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']"));
		WebElement search=driver.findElement(By.cssSelector("div#search>input"));
		WebElement head3=driver.findElement(By.tagName("h3"));
		enterText_JS(search,"oooooooo");
		
		flassBlink(butotn);
		takeScreenShot("./target/blinkingborder.png");
		
		Thread.sleep(1000);
		aleert("jcjdshdjh");
		driver.switchTo().alert().accept();
		//scrollToElement(head3);
		refreshPage();
		Thread.sleep(3000);

		scrilltolast();
		String ss=innerText();
		System.out.println(ss);
		
	
 }
 
 public String  innerText() {
	return  ((JavascriptExecutor)driver).executeScript("return document.documentElement.innerText").toString();
 }
 public void scrilltolast() {
	 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHieght)");
 }
 
 public void scrollToElement(WebElement ele) {
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", ele);
 }
 public void refreshPage() {
	 ((JavascriptExecutor)driver).executeScript("history.go(0)");
 }
 
 public void aleert(String alertdata) {
	 ((JavascriptExecutor)driver).executeScript("alert('"+alertdata+"')");
 }
 public void enterText_JS(WebElement ele,String data) {
	 ((JavascriptExecutor)driver).executeScript("arguments[0].value='"+data+"'", ele);
 }
 
 public String jsTitleofpage() {
	  return  ((JavascriptExecutor)driver).executeScript("return document.title").toString();
 }
 public String jsUrlofpage() {
	  return  ((JavascriptExecutor)driver).executeScript("return document.URL").toString();
}
 public void flassBlink(WebElement ele) throws InterruptedException, IOException {
		//WebElement butotn=driver.findElement(By.cssSelector("div#logo>h1>a"));
		String defaultcolour=ele.getCssValue("background-color");
 
	 JavascriptExecutor jss = ((JavascriptExecutor)driver);
		for(int i=0;i<=15;i++) {
		jss.executeScript("arguments[0].style.border='5px solid red';",ele);
		Thread.sleep(50);
		jss.executeScript("arguments[0].style.background='"+defaultcolour+"';",ele);
		
 }
}
 
 public void takeScreenShot(String path) throws IOException {
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(scr, new File(path));
 }
}
