package basics1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.id("email"));
		w.until(ExpectedConditions.visibilityOf(email)).sendKeys("vidya");
		driver.findElement(By.id("pass")).sendKeys("vidya1994");
		
		WebElement button = driver.findElement(By.name("login"));
		w.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains("vidya"));
		
	}

}
