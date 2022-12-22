package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		
		//using implicitelyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("actiTimeUrl")).sendKeys("aaaaa11111");
		driver.findElement(By.name("username")).sendKeys("aaaaa");
		driver.findElement(By.name("password")).sendKeys("aaaaa22222");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
