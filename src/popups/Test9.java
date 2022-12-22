package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(skin).perform();
		driver.findElement(By.xpath("(//a[text()='Moisturizers'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='css-d5z3ro'])[1]")).click();
		
		

	}

}
