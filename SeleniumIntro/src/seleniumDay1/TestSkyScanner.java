package seleniumDay1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSkyScanner {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\arcelik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.skyscanner.com/");
	
	 

     List<WebElement> radioButtons = driver.findElements(By.cssSelector("[type = 'radio']"));

     System.out.println(radioButtons.get(0).isSelected());

     if(radioButtons.get(0).isSelected() && !radioButtons.get(1).isSelected() && !radioButtons.get(2).isSelected()) {

     	System.out.println("Radio button step pass");

     }

     else System.out.println("fail");

     

     List<String> expectedListOfRadioTexts = new ArrayList<String>(

     		Arrays.asList("Roundtrip","One way","Multi-city"));

     

     List<WebElement> actualListOfRadioElements = driver.findElements(By.cssSelector("[class *= 'BpkRadio_bpk-radio'] span"));

     List<String> actualListOfRadioTexts = new ArrayList<String>();

     actualListOfRadioTexts = getText(actualListOfRadioElements);

     if(expectedListOfRadioTexts.equals(actualListOfRadioTexts)) {

     	System.out.println("PASS");

     }

     else System.out.println("FAIL");

	}

	

	public static List<String> getText(List<WebElement> list){

		List<String> list1 = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {

			list1.add(list.get(i).getText());

		}

		return list1;

	}
	
	
	
	
}
