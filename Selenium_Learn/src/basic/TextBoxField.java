package test_leaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditText {

	public static void main(String[] args) {
  
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Volumes/Backup/Salman/chromedriver/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
    //Sending email in TextField
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Example@example.com");
		
    //Appending Value in TextField
		WebElement append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("Append1");
		
		//GetValue in TextField
		WebElement value = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));		
		String GetValue =	value.getAttribute("value");
		System.out.println(GetValue);
		
		//Clearning Value in TextField
		WebElement clear = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
      clear.clear();
		
		//Finding Enable or disable in TextField
		WebElement enable = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean enabl = enable.isEnabled();
		System.out.println(enabl);
		
		

	}

}
