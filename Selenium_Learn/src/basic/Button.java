package test_leaf;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
  
    //Open Browser
    System.setProperty("webdriver.chrome.driver", "/Volumes/Backup/Salman/chromedriver/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		//Click to Next page
		WebElement homePage = driver.findElement(By.xpath("//button[@id ='home']"));
		homePage.click();
    
		//back to navigate
		driver.navigate().back();
    
		//finding Xaxis and yAxis for button
		WebElement position = driver.findElement(By.xpath("//button[@id ='position']"));
		Point point = position.getLocation();
		int Xaxis = point.getX();
		int Yaxis = point.getY();
		System.out.println("XAxis : " + Xaxis + " Yaxis: " + Yaxis);
		
		//Finding Backgroundcolor of Button
		WebElement bgcolor = driver.findElement(By.xpath("//button[@id ='color']"));
		String backgroundColor = bgcolor.getCssValue("background-color");
		System.out.println(backgroundColor);
		
		//Finding Height and width of Button
		WebElement hw = driver.findElement(By.xpath("//button[@id ='size']"));
		int height = hw.getSize().getHeight();
		int weight = hw.getSize().getWidth();
		System.out.println("Height : " + height + " Weight " + weight);

	}

}
