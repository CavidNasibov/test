package taskForMaven_day1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;

public class TaskClassForMavenTest {
	WebDriver driver;
    @Before
    public void beforeShowUp() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
}
    
    @After
    public void afterPopUp() {
    	driver.quit();
    }

	@Test
	public void getTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
assertEquals(expectedTitle, actualTitle);	}
	
	@Test
	public void amazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.name("field-keywords")).sendKeys("bag"+Keys.ENTER);
		
	Select sortBy=new Select(driver.findElement(By.id("#a-autoid-0-announce")));
	sortBy.selectByIndex(2);
	}	
	
}