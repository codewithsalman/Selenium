package test_leaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Backup/Salman/chromedriver/");		
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.leafground.com/pages/Dropdown.html");		
		driver.manage().window().maximize();
		
		
		//Finding Index based DropDown
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));		
		Select SelectDropDown = new Select(dropDown1);		
		SelectDropDown.selectByIndex(3);

		
		//Find value based DropDown
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));		
		Select Selectdropdown2 = new Select(dropdown2);		
		Selectdropdown2.selectByValue("2");
		
		
		//findVisible Text base DropDown
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));		
		Select Selectdropdown3 = new Select(dropdown3);		
		Selectdropdown3.selectByVisibleText("Selenium");
		
		
		//FindElements in the DropDown
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));		
		Select Selectdropdown4 = new Select(dropdown4);		
		List<WebElement> down = Selectdropdown4.getOptions();		
		int size = down.size();		
		System.out.println(size);
		
		
		//SendKeys of DropDown
		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		dropdown5.sendKeys("Appium");
		
		
		//MultiSelect DropDown		
		WebElement SelectMultiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));		
		Select multiple = new Select(SelectMultiple);		
		multiple.selectByIndex(1);
		multiple.selectByIndex(2);
		multiple.selectByIndex(3);
		multiple.selectByIndex(3);
		
			
		
		
	}

}
