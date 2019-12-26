package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Backup/Salman/chromedriver/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.quit();
		
		
		
		
	}

}
