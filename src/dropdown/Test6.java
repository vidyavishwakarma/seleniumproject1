package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement multidd = driver.findElement(By.id("cars"));
		
		Select s=new Select(multidd);
		s.selectByIndex(0);
		s.selectByValue("99");
		//s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
        List<WebElement> opt = s.getAllSelectedOptions();
		
		System.out.println(opt.size());
		
		for(WebElement b:opt)
		{
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
