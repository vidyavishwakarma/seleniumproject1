package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//navigate
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/aclk?sa=l&ai=DChcSEwibkrX0n476AhWvmWYCHZa0BE4YABAAGgJzbQ&sig=AOD64_3C-51ya3nZR8tDyUCkZa9647BCEA&q&adurl&ved=2ahUKEwjEva_0n476AhXO-DgGHRmrC9oQ0Qx6BAgJEAE");
		
		//back
		Thread.sleep(3000);
		driver.navigate().back();
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
		//refresh
		Thread.sleep(3000);
		driver.navigate().refresh();
		

	}

}
