package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;
//@Listeners({listeners.class})
public class listernClass {
	
	 WebDriver driver;
	String browser="chrome";
	public String url = "https://www.google.com/";
	 DesiredCapabilities caps = new DesiredCapabilities();
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("Aftertest");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	Base b=new Base();
	@org.testng.annotations.AfterMethod
	public void AfterMethod(ITestResult result) {
		String name=result.getName();
		if(result.getStatus()==ITestResult.FAILURE) {
			b.screenShot(driver,name);
		}
		System.out.println("AfterMethod");
	}
	 @AfterSuite
	 public void AfSuite() {
		 System.out.println("aftersuite");
		 driver.quit();
	 }
	 @Parameters("browser")
	@BeforeSuite
	public void initializer( String browser ) {
		 System.out.println(browser+" selected");
		if (browser.equalsIgnoreCase("chrome")) {
						    caps.setBrowserName(browser);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			  caps.setBrowserName(browser);
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}

	@Test(priority=-1)//retryAnalyzer = listeners.RetryAnalyser.class
	public void openUrl() {
System.out.println("retryanalizsr failed test case");
		Assert.assertEquals(driver.getCurrentUrl(), url);

	}
	
	
	
	@Test(dataProvider="searchdata",priority=0)
	public void getSearch(String searchdata) throws InterruptedException {
		WebElement search=driver.findElement(By.cssSelector("textarea#APjFqb"));
		search.sendKeys(searchdata);
		Thread.sleep(3000);
		search.clear();
		search.submit();
		Thread.sleep(2000);
	}

	@DataProvider(name="searchdata")
	public Object[][] searchData()
	{
return 	new Object [][]{
			{"phone"},
		{"mobile"}
		};
	
}
	
	@Test(priority=2)
	public void getTitle() {
		Assert.assertEquals(driver.getTitle(), "google");
	}
	
	@Test(dependsOnMethods="getTitle",priority=1)
	public void clickGmail() {
		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		gmail.click();
	}
	
	@Test(timeOut=2000)
	public void failTestMethod(ITestResult result) {
		
		Assert.assertTrue(false);
		if(result.getStatus()==TestResult.FAILURE) {
			System.out.println(result.getTestContext().getName()+" "+result.getTestContext().getName());
		}
		System.out.println("");
	}
	
}