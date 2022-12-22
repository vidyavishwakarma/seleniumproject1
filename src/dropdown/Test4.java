package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement searchddb = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(searchddb);
		
		s.selectByIndex(3);
		s.selectByValue("search-alias=beauty-intl-ship");
		s.selectByVisibleText("Books");
		
		
	}

}
