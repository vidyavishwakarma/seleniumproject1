package trails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("aaaa");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("cccccccccc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[1]")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
