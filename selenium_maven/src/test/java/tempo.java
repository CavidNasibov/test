import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tempo {
	WebDriver driver;
	@Before
	public void A() {
		
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics_medal_table");
	driver.manage().window().maximize();
	}
	@Test
	public void B() {
		List<WebElement> list=driver.findElements(By.cssSelector("[class *='sortable'] thead tr th"));
		List<String> list1=new ArrayList<String>();
		for (WebElement webElement : list) {
		System.out.println(list1.add(webElement.getText()));
		}
			
			
		
		
		
	}
	
}
