package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//using linkText locator
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.name("email")).sendKeys("7892403908");
		driver.findElement(By.name("did_submit")).click();

	}

}
