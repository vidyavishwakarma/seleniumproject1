package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseb = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(courseb).perform();
		
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
        
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
     
        Alert cancel = driver.switchTo().alert();
        System.out.println(cancel.getText()); 
        cancel.dismiss();
     
        Thread.sleep(3000);
        driver.close();
        
	}

}
