package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.Skillrary.com/login.php?type=login");
		
		//using id and name locators
		driver.findElement(By.id("email")).sendKeys("vidya");
		driver.findElement(By.name("password")).sendKeys("vidyadeepu21");
		driver.findElement(By.id("last")).click();
	}

}
