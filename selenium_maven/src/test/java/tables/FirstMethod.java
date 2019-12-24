package tables;

import static org.junit.Assert.assertEquals;
import java.util.List;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMethod {
	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics_medal_table");
		driver.manage().window().maximize();
}
//	@Test
	public void task() {
		int b=randomN();
		assertEquals(expectedNUmber(b,driver), aqtualNumbers(b,driver));
		System.out.println(b);
		System.out.println(FirstMethod.expectedNUmber(b, driver));
		System.out.println(FirstMethod.aqtualNumbers(b, driver));
		
		
	}
	public static int aqtualNumbers(int a,WebDriver driver) {
		int actualNumber=0;
		for (int i = 2; i < 5; i++) {
String medal=driver.findElement(By.cssSelector("[class*='sortable'] tbody tr:nth-of-type("+a+") td:nth-of-type("+i+")")).getText();
actualNumber=Integer.valueOf(medal)+actualNumber;
		}
		return actualNumber ;
	}
		public static int randomN() {

			Random r = new Random();

			return r.nextInt(31) ;

		
		
		}
		public static int expectedNUmber(int a,WebDriver driver) {
String totalMedal=driver.findElement(By.cssSelector("[class*='sortable'] tbody tr:nth-of-type("+a+") td:nth-of-type(5)")).getText();
return Integer.valueOf(totalMedal);

		}

		@Test
		public void tio() {
			
         for (int i = 1; i < 87; i++) {
 String str=driver.findElement(By.cssSelector("[class *='sortable'] tbody tr:nth-of-type("+i+")  a")).getText();
System.out.println(str);		
}

	
}
		}
	
		
		
	
