package tables;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

import java.awt.Desktop.Action.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFor24_11_19 {
	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics_medal_table");
		driver.get("https://www.truecar.com/prices-new/bmw/m5-pricing/2020/?exteriorColorId=noPreference&interiorColorId=991236&userSelectedExteriorColor=false&userSelectedInteriorColor=false&userSelectedStyle=false&viprStyleId=65777&zipcode=02155");
		driver.manage().window().maximize();
		/*
		 * Test Case1: Rank descending Steps: Go to the website Click on Rank Country
		 * name should be equal Austria (AUT)
		 */
	}

//	@Test
	public void task1() {
		Actions a = new Actions(driver);
		driver.findElement(By.cssSelector("[class *= 'sortable' ] thead th:nth-of-type(1)")).click();
		driver.findElement(By.cssSelector("[class *= 'sortable' ] thead th:nth-of-type(1)")).click();
		String actualCountry = driver.findElement(By.cssSelector("a[href='/wiki/Austria_at_the_2016_Summer_Olympics']"))
				.getText();
		String expectedCountry = "Austria";
		assertEquals(expectedCountry, actualCountry);
		System.out.println(actualCountry + ":done");

	}

	/*
	 * Test Case2: Number of countries Steps: Go to the website Verify number of
	 * countries equal to 86
	 */
//	@Test
	public void task2() {
		for (int i = 1; i < 87; i++) {

			WebElement element = driver
					.findElement(By.cssSelector(" [class *= 'sortable' ]" + " tbody tr:nth-of-type(" + i + ") th a"));
			String str = i + " " + element.getText();
			System.out.println(str);
		}
		System.out.println();

	}

	/*
	 * Test Case3: Sum of total medals for the US Steps: Go to the website Get
	 * number of medals and add them Sum of number of medals should be equal 121
	 */
//	@Test
	public void task3() {
		int actualNumber = 0;

		for (int i = 2; i < 5; i++) {
			String str = driver
					.findElement(By.cssSelector(
							"[class *= 'sortable' ] tbody tr:nth-of-type(1) " + " td:nth-of-type(" + i + ")"))
					.getText();
			actualNumber = actualNumber + Integer.valueOf(str);
			if (i < 5) {
				continue;
			}
		}
		String str1 = driver
				.findElement(By.cssSelector("[class *= 'sortable' ] " + " tbody tr:nth-of-type(1) td:nth-of-type(5)"))
				.getText();

		int expectedNumber = Integer.valueOf(str1);
		assertEquals(expectedNumber, actualNumber);
		System.out.println("expectedNumber is :" + expectedNumber + " " + "actualNumber is:" + actualNumber);
	}

	/*
	 * Test Case4: Sum of total medals for the random country Steps: Generate Random
	 * number in the range 1-30 (number of the row) Get number of medals for the
	 * randomly generated row and add them Verify sum of the medals equal to the
	 * total number of the medals for the same row
	 */
//	@Test
	public void task4() {
		int actualNumber = 0;
		Random objGenerator = new Random();
		for (int iCount = 1; iCount < 2; iCount++) {
			int randomNumber = objGenerator.nextInt(30);
			for (int i = 2; i < 5; i++) {
				String str = driver.findElement(By.cssSelector(
						"[class *= 'sortable ' ] tbody tr:nth-of-type(" + randomNumber + ") td:nth-of-type(" + i + ")"))
						.getText();
				actualNumber = actualNumber + Integer.valueOf(str);

				if (i == 4) {
					String a = driver.findElement(By.cssSelector(
							"[class *= 'sortable ' ] tbody tr:nth-of-type(" + randomNumber + ") td:nth-of-type(5)"))
							.getText();
					int expectedNumber = Integer.valueOf(a);

					assertEquals(expectedNumber, actualNumber);

					System.out.println("Random No : " + randomNumber + " expectedNumber: " + expectedNumber
							+ " actualNumber: " + actualNumber);
				}

			}

		}

	}

	/*
	 * Diffirent solution for Task4.
	 */
//	@Test
	public void task4Same() {

		int n = randomN();

		assertEquals(totolMedals(n, driver), totalActual(n, driver));
	}

	public static int totolMedals(int rowNum, WebDriver driver) {

		String gold = driver.findElement(By.cssSelector("[class *= 'sortable' ]  "

				+ "tbody tr:nth-of-type(" + rowNum + ") td:nth-of-type(2)")).getText();

		String silver = driver.findElement(By.cssSelector("[class *= 'sortable' ]  "

				+ "tbody tr:nth-of-type(" + rowNum + ") td:nth-of-type(3)")).getText();

		String bronze = driver.findElement(By.cssSelector("[class *= 'sortable' ]  "

				+ "tbody tr:nth-of-type(" + rowNum + ") td:nth-of-type(4)")).getText();

		return Integer.valueOf(gold) + Integer.valueOf(silver) + Integer.valueOf(bronze);

	}

	public static int totalActual(int rowNum, WebDriver driver) {

		String total = driver.findElement(By.cssSelector("[class *= 'sortable' ]  "

				+ "tbody tr:nth-of-type(" + rowNum + ") td:nth-of-type(5)")).getText();

		return Integer.valueOf(total);
	}

	public static int randomN() {

		Random r = new Random();

		return r.nextInt(29) + 1;

	}
	@Test
	public void verfyHeader() {
		TaskFor24_11_19.verfyHeadern(driver);
	}
	public static void verfyHeadern(WebDriver driver) {
		String str1=driver.findElement(By.cssSelector("[class='heading-4 heading-md-3 font-wight-bold w-100']"))
		.getText();
		String str="Your 2020 BMW M5";
		assertEquals(str, str1);
	}
}
