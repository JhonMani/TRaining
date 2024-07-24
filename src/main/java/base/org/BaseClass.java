package base.org;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
 
	public static WebDriver driver;
	
	public static void url(WebDriver driver, String s) {
	
		driver.get(s);
		
	}
	
	public static void waiT(WebDriver driver, Duration t) {
		

	}
	public static void maxi(WebDriver driver) {
	  driver.manage().window().maximize();

	}
	
	public static void sendvalues(WebElement e, String clk) {
		e.sendKeys(clk);

	}
	
	public static void clik(WebElement e) {
		e.click();

	}
	
	
	
}
