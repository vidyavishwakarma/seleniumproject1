package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/ ");
		
		//using linkText locator
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.linkText("Home & Kitchen")).click();
		

	}

}
