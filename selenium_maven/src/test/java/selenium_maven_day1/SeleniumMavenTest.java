package selenium_maven_day1;

import javax.sql.rowset.WebRowSet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumMavenTest {
	WebDriver driver;
	@Before
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
        driver.get(System.getProperty("url"));
	}
//	@After 
	public void tearDown() {
		driver.quit();
		
	}

	@Test
	public void checkTitle(){
		
		
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(expectedTitle, expectedTitle);
        
	}
	@Test
	public void googleSearch() {
		
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(expectedTitle, expectedTitle);
        driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
        String actualResult=driver.findElement(By.id("resultStats")).getText();
        String expectedResult= "Результатов";
        boolean searchResult=actualResult.contains(expectedResult);
        Assert.assertTrue(searchResult);
	}

}
