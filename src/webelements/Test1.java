package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele=driver.findElement(By.name("username"));
		ele.clear();
		WebElement ele1=driver.findElement(By.id("password"));
		ele1.clear();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
