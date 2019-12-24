package tables;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;
import utils.Utility;

public class SeleniumTable {

	
	WebDriver driver;
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics_medal_table");
		 driver.get("https://www.truecar.com/prices-new/bmw/m5-config/?section=stylesBuilder&zipcode=02155");
	}
//	@Test
//	public void verfyHeaders() {
//		List<String>expectedHeaders=new ArrayList<String>(Arrays.asList("Rank","NOC","Gold","Silver"
//				,"Bronze","Total"));
//		
//		List<WebElement> list=driver.findElements(By.cssSelector("[class *='sortable'] thead tr th"));
//
//		List<String>actualHeaders=Utility.webElementToStringList(list);
//		System.out.println(actualHeaders);
//		assertEquals(expectedHeaders, actualHeaders);
		@Test
		public  void skipForNow() {
			
		     // driver.findElement(By.cssSelector("[data-qa='configurator-skip-button-desktop']")).click();
			}	
			
		}

	
	

	
	

