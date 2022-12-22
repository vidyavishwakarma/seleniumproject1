package webelements;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele=driver.findElement(By.id("email"));
		org.openqa.selenium.Dimension s=ele.getSize();
		double h = s.getHeight();
		System.out.println(h+"height");
		double w = s.getWidth();
		System.out.println(w+"width");
		
		driver.close();

	}

}

