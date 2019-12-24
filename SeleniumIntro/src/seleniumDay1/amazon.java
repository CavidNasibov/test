package seleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arcelik\\Downloads\\chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement amazon=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	amazon.sendKeys("amazon" + Keys.ENTER);
	driver.findElement(By.xpath("//a[@href='https://www.amazon.com/']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("diapers");
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
	driver.findElement(By.xpath("//*[@id='pdagDesktopSparkleDescription1']")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
}
}
