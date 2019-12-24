package tables;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verfyRank1 {
	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics_medal_table");
		driver.manage().window().maximize();
	}

	@Test
	public void verfyRank1() {
		String expectedCountryName = "United States";
		String actualCountryName = driver
				.findElement(By.cssSelector("[class *= " + "'sortable' ] tbody tr:nth-of-type(1) th a")).getText();
		assertEquals(expectedCountryName, actualCountryName);
	}
}
