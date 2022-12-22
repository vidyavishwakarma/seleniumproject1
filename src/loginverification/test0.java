package loginverification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		
		//step:1 open the browser
		WebDriver driver=new ChromeDriver();
		
		//step:2 maximize the browser
		driver.manage().window().maximize();
		
		//step:3 enter the url
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		//step:4 enter the valid username
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7892403908");
		
		Thread.sleep(3000);
		//step:5 enter the valid password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("vidyadeepu21");
		
		Thread.sleep(3000);
		//step:5 click on login button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(3000);
		//step:7 get the title of the application
		 String acttitle=driver.getTitle();
		 System.out.println(acttitle);
		 
		//step:8 get the url of the application
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
		 //step:9 verification
		 if(acttitle.contains("Online Shopping Site for Mobiles,")) {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
			 
		 }
		 
		 //step:10 close the application
		 driver.close();

	}

}
