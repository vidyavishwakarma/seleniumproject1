package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//for flipkart using xpath by contains locator
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("1111111111");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@type,'pass')])[1]")).sendKeys("aaaaaaa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@type,'sub')])[2]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
