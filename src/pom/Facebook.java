package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void email(String emailaddress) {
		emailtb.sendKeys(emailaddress);
	}
	
	public void password(String password) {
		passwordtb.sendKeys(password);
	}
	
	public void login() {
		loginbtn.click();
	}

}
