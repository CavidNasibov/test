package tables;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTestAtClass {
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
	public void check()   {
		//driver.findElement(By.cssSelector("[class *='sortable'] thead tr th:nth-of-type(5) ")).click();
		String str=driver.findElement(By.cssSelector("[class *= 'sortable' ] tbody "
				+ "tr:nth-of-type(1) td:nth-of-type(2)")).getText();
		Integer.valueOf(str);
		String str1=driver.findElement(By.cssSelector("[class *= 'sortable' ]"
				+ " tbody tr:nth-of-type(1) td:nth-of-type(3)")).getText();
		Integer.valueOf(str1);
		String str2=driver.findElement(By.cssSelector("[class *= 'sortable' ]"
				+ " tbody tr:nth-of-type(1) td:nth-of-type(4)")).getText();
		Integer.valueOf(str2);
		int actualNumber=Integer.valueOf(str)+Integer.valueOf(str1)+Integer.valueOf(str2);
		int expectedNumber=121;
		Integer.valueOf(expectedNumber);
		assertEquals(actualNumber, expectedNumber);
		
		
	}
//	@Test
	public void sameTask() {
		int actualNumber=0;
		for (int i = 2; i < 5; i++) {
			String str=driver.findElement(By.cssSelector("[class *= 'sortable' ] tbody tr:nth-of-type(1) "
					+ " td:nth-of-type("+ i +")")).getText();
			
			actualNumber=actualNumber+Integer.valueOf(str);
						
			for (int j = 5; j < 6; j++) {
				
				if(i==4) {
					String str1=driver.findElement(By.cssSelector("[class *= 'sortable' ] tbody tr:nth-of-type(1) "
							+ " td:nth-of-type("+j+")")).getText();
					int expectedNumber=Integer.valueOf(str1);
					
                    assertEquals(expectedNumber, actualNumber);
				}
			
				}
				
			}
		}
	@Test
	public void sameTask2(){
		int actualNumber=0;
		
		for (int i = 2; i < 5; i++) {
			String str=driver.findElement(By.cssSelector("[class *= 'sortable' ] tbody tr:nth-of-type(1) "
					+ " td:nth-of-type("+ i +")")).getText();
			actualNumber=actualNumber+Integer.valueOf(str);	
			if(i<5) {
				continue;
			}
			}
			String str1=driver.findElement(By.cssSelector("[class *= 'sortable' ] "
					+ " tbody tr:nth-of-type(1) td:nth-of-type(5)")).getText();
			
			int expectedNumber=Integer.valueOf(str1);
			assertEquals(expectedNumber, actualNumber);
			System.out.println("expectedNumber is :"+expectedNumber+" " + "actualNumber is:"+actualNumber);
	}
	}


