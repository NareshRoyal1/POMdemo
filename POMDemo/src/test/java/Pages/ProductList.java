package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductList {
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement itemOne;
	@FindBy (id="add-to-cart-sauce-labs-bike-light")
	WebElement itemTwo;
	@FindBy(xpath="//span[contains(text(),'Products')]")
	WebElement products;
	@FindBy(id="shopping_cart_container")
	WebElement ViewCart;
	public  ProductList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddtoCart() {
		itemOne.click();
		itemTwo.click();
	}
	public void ViewCart() {
		ViewCart.click();
		
	}
	public boolean  IsOnproductPage() {
		return products.isDisplayed();
	}


}
