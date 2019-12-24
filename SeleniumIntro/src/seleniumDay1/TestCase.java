package seleniumDay1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arcelik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*TC - 01 Application up and running
	Steps:
		1. Go to the website https://www.skyscanner.com/
		 * 2. Verify Title contains "Skyscanner"
		 */
		driver.navigate().to("https://www.skyscanner.com/");
		System.out.println(driver.getTitle());
		/*
		 * TC - 02 Rountrip
	Steps:
		1. Go to the website https://www.skyscanner.com/
		2. Verify Title contains "Skyscanner" 
		3. Verify Roundtrip is selected
		 */
        driver.findElement(By.xpath("(//div[@class='BpkRadio_bpk-radio__circle__IqKQf'])[1]")).click();
        driver.findElement(By.id("fsc-origin-search")).click();
        
        /*
         * TC - 03 Rountrip
	Steps:
		1. Go to the website https://www.skyscanner.com/
		2. Verify Title contains "Skyscanner" 
		3. Click to "from"
		4. Get text there.
		5.Verify ,it is  this same text "Washington (Any)"
         */
//        WebElement washingtonAny=driver.findElement(By.id("fsc-origin-search"));
//        String str = washingtonAny.getAttribute("value");
//		System.out.println(str);
//		String str1="Washington (Any)";
//		if(str.equals(str1)) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}

driver.findElement(By.xpath("(//button[@class='BpkButton_bpk-button__2aWRf BpkButton_bpk-button--secondary__tk0TY'])[1]")).click();;
//driver.findElement(By.id("#culture-selector-locale"));
             driver.findElement(By.id("#culture-selector-locale")).click();
             
         	//Select select=new Select(driver.findElement(By.name("[name=locale]")));

             
		Thread.sleep(1000);
		driver.close();
		
	}

}
