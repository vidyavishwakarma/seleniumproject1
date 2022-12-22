package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwinyfqjoYn6AhWQJCsKHeXwAYEYABAAGgJzZg&ohost=www.google.com&cid=CAESa-D2ISfPII28GzAgGYHwRde-5YVR8BBX0TaffpSWdybw5rBNILMyfxAzSCKWpeOC4uCfOAxd33vkAyDTpgCUYXwvrabLw5Y8cENTj7A5si_tQCJUDeyUK4Kn_DTH0ILIon4g76I4NT0Qj1cC&sig=AOD64_3zHfXXYOKm1-J6IzgQk-r1sr0nxA&q&adurl&ved=2ahUKEwjwjfOjoYn6AhWNTmwGHT9YAY8Q0Qx6BAgCEAE");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	}

}
