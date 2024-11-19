package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy(id="first-name")
	WebElement FirstName;
	@FindBy(id="last-name")
	WebElement lastName;
	@FindBy(id="postal-code")
	WebElement postalCode;
	@FindBy(id="continue")
	WebElement Continue;
	@FindBy(id="finish")
	WebElement Finish;
	public  CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void passinfo(String fn,String ln,String pc) {
		FirstName.sendKeys(fn);
		lastName.sendKeys(ln);
		postalCode.sendKeys(pc);
		
		
	}
	public void Continue() {
		Continue.click();
	}
	public void finish() {
		Finish.click();
	}

}
