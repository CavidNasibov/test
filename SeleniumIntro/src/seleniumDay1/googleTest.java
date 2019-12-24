package seleniumDay1;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTest {
public static void main(String[] args) throws InterruptedException {
//	System.out.println(System.getProperty("user.dir"));
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arcelik\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.google.com/");
//	driver.findElement(By.name("q")).sendKeys("iphone11"+ Keys.ENTER);
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\arcelik\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//	WebDriver driver1 = new FirefoxDriver();
//	driver1.get("https://www.google.com/");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arcelik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	//driver.findElement(By.name("q")).sendKeys("iphone11"+ Keys.ENTER);
//	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("iphone");1st way
	
//	WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));2nd way
//	element.sendKeys("iphone");
	WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	element.sendKeys("iphone" +Keys.ENTER);
	
	
	String stats=driver.findElement(By.id("resultStats")).getText();
	System.out.println(stats);
	if(stats.contains("About")) {
		System.out.println("PASS");
		
	}else System.out.println("FAIL");
//	String [] arr=stats.split(" ");
//	System.out.println(Arrays.toString(arr));
//	String str=arr[1].replace(",", "");
//	System.out.println(str);
//	System.out.println(Long.parseLong(str) >=400000000);
//	Long l=toLong(stats);
//	System.out.println(l);
	driver.findElement(By.id("logo")).click();
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("iphone");
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@class='gNO89b']")).click();
	driver.findElement(By.xpath("//a[@href='https://www.apple.com/iphone/']")).click();
//	//a[@href='https://www.apple.com/iphone/']
	Thread.sleep(2000);
	//driver.close();
}
public static long toLong(String str) {
	String [] arr=str.split(" ");
	String str1=arr[1].replace(",", "");
	System.out.println(str1);
	return Long.parseLong(str1);
	
}


}






