package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		//minimize
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		//fullscreen
		Thread.sleep(3000);
		driver.manage().window().minimize();
		

	}

}
