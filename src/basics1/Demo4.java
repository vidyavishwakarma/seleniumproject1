package basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement stb = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(stb);
		s.selectByIndex(1);
		s.selectByValue("search-alias=automotive-intl-ship");
		s.selectByVisibleText("Baby");
	}

}
