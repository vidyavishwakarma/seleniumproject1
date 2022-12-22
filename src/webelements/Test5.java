package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement radio = driver.findElement(By.xpath("//label[text()='Female']"));
		if(radio.isEnabled())
		{
			System.out.println("pass");
			radio.click();
		
		}
		else
		{
			System.out.println("fail");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
