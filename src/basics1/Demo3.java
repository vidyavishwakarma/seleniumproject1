package basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement course = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		
		WebElement add = driver.findElement(By.id("add"));
		Actions a=new Actions(driver);
		a.doubleClick(add).perform();
		
		WebElement searchtb = driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.contextClick(searchtb).perform();
		
		WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(block2, block1).perform();
	}

}

