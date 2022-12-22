package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement searchddb = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(searchddb);
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		
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
