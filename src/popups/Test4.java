package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
