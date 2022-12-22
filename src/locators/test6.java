package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//using cssSelector locator
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("vidya");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("vikki");
		driver.findElement(By.cssSelector("button[value='1']")).click();

	}

}
