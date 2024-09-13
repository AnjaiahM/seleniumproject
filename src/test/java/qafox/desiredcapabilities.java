package qafox;

import java.io.File;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class desiredcapabilities {
public WebDriver driver;
	@Test
	public void desiredCapabilities() {
		   
		        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

		        // Create ChromeOptions and set headless mode
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--headless");

		        // Add additional arguments for headless mode (optional)
		        options.addArguments("--disable-gpu"); // Disable GPU acceleration
		        options.addArguments("--no-sandbox"); // Disable sandbox mode (for Docker containers)

		        // Create a WebDriver instance
		        WebDriver driver = new ChromeDriver(options);

		        // Perform your test actions using the WebDriver instance
		        // For example:
		        driver.get("https://www.example.com");
		        // ... other test steps ...

		        // Close the browser
		        driver.quit();
		
		
	}
	
}
