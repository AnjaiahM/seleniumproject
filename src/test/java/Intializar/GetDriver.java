package Intializar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetDriver {
	
	public  static WebDriver driver;
	public GetDriver(WebDriver driver) {
		this.driver=driver;
	}
	


public static WebDriver getDriver() {
	
	
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
	return driver;
}
}
