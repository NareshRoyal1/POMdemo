package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	@FindBy (id="user-name")
	WebElement Username;
	@FindBy (id="password")
	WebElement pwd;
	@FindBy (id="login-button")
	WebElement LoginBtn;
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validLogin(String StrUser , String StrPwd) {
		Username.sendKeys(StrUser);
		pwd.sendKeys(StrPwd);
		LoginBtn.click();
	}

}
