package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static List<String> webElementToStringList(List<WebElement> list){
		List<String> list1=new ArrayList<String>();
		list.forEach(el -> list1.add(el.getText()));
		return list1;
	}
	
	
}
/*          CSS sellectror
 * [class *='text'] -to get table path 
 * *='text'- means to get with containing of sortable's text path  
 * ^='text'- means to get with beginning of sortable's text path
 * [class *='text'] thead tr th -if next path is thead and go to that path,go and go on writing th tr
 * [class *= 'text' ] tbody tr:nth-of-type(1)- td:nth-of-type(1) -get through tbody to td(column|||Vertical)
 * [class *= 'text' ] tbody tr:nth-of-type(1) -get through tbody to tr(row --- Horizontal)
 * [class *= 'text' ] thead th:nth-of-type(1) -get through thead to th
 * [class *= 'text' ] tbody tr:nth-of-type(1) th:nth-of-type(1) a-countries name
 * #driver.manage().window().maximize();-to extend webSitePage
 * 
 *  Select option from DropDown box
 * Select select=new Select(driver.findElement(By.id("drowdown")));
	select.selectByIndex(2);
	
	Action class(double)
	Actions actions = new Actions(driver);
WebElement elementLocator = driver.findElement(By.id("ID"));
actions.doubleClick(elementLocator).perform();

    Action class(right-class)
Actions actions = new Actions(driver);
WebElement elementLocator = driver.findElement(By.id("ID"));
actions.contextClick(elementLocator).perform();

ChromeOptions op=new ChromeOptions();
	op.addArguments("--headless");//u can with this func.get conclusion ver fast,but u cant see conlusion of webpage
	driver = new ChromeDriver(op);

 */



