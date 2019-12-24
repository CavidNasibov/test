package seleniumDay1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskGetText {
public static void main(String[] args) throws InterruptedException {
	/*
	 * Test case:Casual dresses
	 * Steps;
	 * -Go to the website http://automationpractice.com/index.php
	 * -Verify title equals to "My store"
	 * -Click on Women top menu
	 * -Click on Dresses
	 * -Click casual dresses
	 * -Verify expectd result equals There is 1 product
	 * 08:00-09:20 task solution
	 */

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arcelik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	-Go to the website http://automationpractice.com/index.php
	driver.get("http://automationpractice.com/index.php");
    System.out.println(driver.getTitle());
//  Click on Women top menu    
	driver.findElement(By.cssSelector("a[title='Women']")).click();;//css
//	 -Click on Dresses
	driver.findElement(By.cssSelector("ul[class= 'tree dynamized'] > li:nth-child(2) a:nth-child(2)")).click();
//	(//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category'])[3] -with xpath ,if u find 6
//	elements or more u can add parentesses start and end ,then put number between square braces and find which one u need.
//    -Click casual dresses
	     driver.findElement(By.cssSelector(".block_content ul[class= 'tree dynamized']>*:first-child a")).click();
//	-Verify expectd result equals There is 1 product
	String counter=driver.findElement(By.cssSelector("span[class='heading-counter']")).getText();
	System.out.println(counter);
	//span[@class='heading-counter']
	 {
		if (counter.equals("There is 1 product.")) {
			System.out.println("Yeap");
		}else {
			System.out.println("Neap");
		}
	}
	
	
	
	Thread.sleep(1000);
	driver.close();

	
    //driver.findElement(By.xpath("//div[@id='block_top_menu']")).click();
	
		
	
}
}
