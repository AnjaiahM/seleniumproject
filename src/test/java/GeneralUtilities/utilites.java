package GeneralUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Intializar.GetDriver;

public class utilites {
	public WebDriver driver;
	
	

	
	public void clickEle(WebElement el) {
		el.click();
	}
	public static void clic_sendKeys(WebElement el,String str) {
		el.click();
		el.sendKeys(str);
		
	}
	
}
