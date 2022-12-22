package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//using xpath by text() locator
		driver.findElement(By.id("username")).sendKeys("vidya");
		driver.findElement(By.name("pwd")).sendKeys("vikki");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();


	}

}
