package basics1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/amazon.png");
		
		FileUtils.copyFile(ram, dest);
		
	}

	
}
