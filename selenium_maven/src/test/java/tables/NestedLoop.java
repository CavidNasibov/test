package tables;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedLoop {
	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics_medal_table");
	}

	@Test

	public void getRowsAndCells() {

		System.out.println(
				driver.findElement(By.cssSelector("[class *= 'sortable' ]  tbody tr:nth-of-type(1) th")).getText());

		for (int i = 1; i < 36; i++) {

//			String country = driver.findElement(By.cssSelector("[class *= 'sortable' ]  "
//
//					+ "tbody tr:nth-of-type(" + i + ") th a")).getText();

//			String abr = driver.findElement(By.cssSelector("[class *= 'sortable' ]  "
//
//					+ "tbody tr:nth-of-type(" + i + ") th span")).getText();
			String country = countryName(driver, i);
			String abr = countryAbr(driver, i);

			for (int j = 1; j < 6; j++) {

				String str = driver.findElement(By.cssSelector("[class *= 'sortable' ]  "

						+ "tbody tr:nth-of-type(" + i + ") td:nth-of-type(" + j + ")")).getText();

				System.out.print(str + " ");

				if (j == 1) {

					System.out.print(country + " " + abr + " ");
				}
			}
			System.out.println();
		}
	}
	public static String countryName(WebDriver driver, int i) {

		return driver.findElement(By.cssSelector("[class *= 'sortable' ]  "

				+ "tbody tr:nth-of-type(" + i + ") th a")).getText();

	}

	public static String countryAbr(WebDriver driver, int i) {

		return driver.findElement(By.cssSelector("[class *= 'sortable' ]  "

				+ "tbody tr:nth-of-type(" + i + ") th span")).getText();

	}
}
