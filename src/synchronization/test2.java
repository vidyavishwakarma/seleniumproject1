package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		w.until(ExpectedConditions.visibilityOf(user)).sendKeys("vidya");
		
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("vidyadeepu21");
		
		WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]"));
		w.until(ExpectedConditions.elementToBeClickable(button)).click();
	    
	    
	    String title=driver.getTitle();
	    w.until(ExpectedConditions.titleContains("Instagram"));
	    
	    Thread.sleep(3000);
	    driver.close();

	}

}
