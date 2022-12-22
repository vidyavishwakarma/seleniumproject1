package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//using implicitelyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//using xpath by groupindex locator
		driver.findElement(By.name("username")).sendKeys("aaaa");
		
		driver.findElement(By.name("password")).sendKeys("cccccccccc");
		
		driver.findElement(By.xpath("(//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[1]")).click();
	
		//driver.close();
		

	}

}
