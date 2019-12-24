package tables;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlerHandling {
WebDriver driver;
@Before
public void setUp() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op=new ChromeOptions();
//	op.addArguments("--headless");//u can with this func.get conclusion ver fast,but u cant see conlusion of webpage
	driver = new ChromeDriver(op);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	driver.get("https://the-internet.herokuapp.com/javascript_alerts");//handleAlerts()
	driver.get("http://demo.guru99.com/popup.php");//windowHandle()
	driver.manage().window().maximize();
}
 @Test
 public void windowHandle() {
	 driver.findElement(By.cssSelector("[href = '../articles_popup.php']")).click();

		String homepageHandle = driver.getWindowHandle();

		Set<String> handles =  driver.getWindowHandles();

		System.out.println(homepageHandle);

		System.out.println(handles);

		

		for (String handle : handles) {

			if(!handle.equalsIgnoreCase(homepageHandle)) {

				driver.switchTo().window(handle);

			}

		}

		driver.findElement(By.name("emailid")).sendKeys("n@gmail.com");

		driver.findElement(By.name("btnLogin")).click();

		driver.close();

		

	}
 

//@Test
public void handleAlerts() throws InterruptedException {
	driver.findElement(By.cssSelector("[onclick = 'jsAlert()']")).click();
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	Thread.sleep(3000);
	al.accept();
	driver.findElement(By.cssSelector("[onclick = 'jsPrompt()']")).click();

	al = driver.switchTo().alert();

	Thread.sleep(1000);

	al.sendKeys("Hello");

	Thread.sleep(1000);

	al.accept();
}

}