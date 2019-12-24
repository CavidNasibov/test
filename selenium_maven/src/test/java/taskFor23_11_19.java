import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.jws.WebMethod;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Utility;

public class taskFor23_11_19 {
	WebDriver driver;
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics_medal_table");
		 driver.manage().window().maximize();
			}
	@Test
	public void verifyTrophy() {
List<WebElement> list= driver.findElements(By.cssSelector("[class *='sortable'] tbody tr:nth-of-type(39) td"));
List<String>actualHeaders=Utility.webElementToStringList(list);

}
	
	}
	
	
	
	

