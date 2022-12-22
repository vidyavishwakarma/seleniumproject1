package loginverification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		
		Thread.sleep(5000);
		driver.findElement(By.id("email--1")).sendKeys("vidya@vikki.com");
		driver.findElement(By.id("id_password")).sendKeys("vidyavikki");
		driver.findElement(By.id("submit-id-submit")).click();
		
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Login | Udemy"))
		{
			System.out.println("pass");
		
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();
	}

}
