package cheapoair;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;
//look 10:40 it is important to create method 
public class FlightsTest {

	
	WebDriver driver;
		@Before 
		public void setUp() {
			 driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.get("https://www.cheapoair.com/");
		
	}
		//@After
		public void tearDown() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
		@Test
		public void searchFrom() {
//WebElement from=driver.findElement(By.cssSelector("[class ^= 'input-group']:nth-of-type(2) [placeholder ^= 'Enter']\r\n" + ""));
//		from.sendKeys("BOS");	
		}
			;
			
			
		
	

}
