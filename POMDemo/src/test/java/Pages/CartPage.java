package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(css="div.cart_item" )
	WebElement cartList;
	@FindAll(value=@FindBy(css="div.cart_item"))
	List<WebElement> Items;
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement Removebtn;
	@FindBy(css="button[data-test='continue-shopping']")
	WebElement continuebtn;
	@FindBy(css="button[data-test='checkout']")
	WebElement checkoutbtn;
	public  CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyElementAdded() {
		return cartList.isDisplayed();
	}
	public void checkOut() {
		checkoutbtn.click();
	}
	
	

}
