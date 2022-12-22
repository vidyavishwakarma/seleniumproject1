package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//using implicitelyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//for flipkart using xpath by groupindex
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("1111111111");
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("aaaaaaa");
	
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	
		//driver.close();

	}

}
