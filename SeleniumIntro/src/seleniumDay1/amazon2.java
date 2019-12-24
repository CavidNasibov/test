package seleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazon2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arcelik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	driver.navigate().to("https://www.amazon.com/");
//	driver.findElement(By.id("a-autoid-0-announce")).click();
//	driver.findElement(By.id("ap_email")).sendKeys("Cavidn82@gmail.com");
//	driver.findElement(By.id("continue")).click();
//	driver.findElement(By.id("ap_password")).sendKeys("C3416510c");
	
	

    driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
//
//    Actions actions = new Actions(driver);
//
//    WebElement a = driver.findElement(By.id("column-a"));
//
//    WebElement b = driver.findElement(By.id("column-b"));
//
//	actions.moveToElement(a).clickAndHold().moveToElement(b).release().build().perform();;
	Select select=new Select(driver.findElement(By.id("drowdown")));
	select.selectByIndex(2);
}	
}
