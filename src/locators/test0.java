package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//using id and name locators
		driver.findElement(By.id("email")).sendKeys("vidya");
		driver.findElement(By.id("pass")).sendKeys("vikki");
		driver.findElement(By.name("login")).click();
		
	}

}
