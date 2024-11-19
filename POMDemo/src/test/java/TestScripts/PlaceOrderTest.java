package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.LoginPage;
import Pages.ProductList;

public class PlaceOrderTest {
	LoginPage loginPage;
	ProductList productList;
	WebDriver driver;
	CartPage cartPage;
	CheckOutPage checkoutpage;
	public PlaceOrderTest() {
		TestBase.InitDriver();
		
		driver=TestBase.getDriver();
		
		 loginPage= new LoginPage( driver);
		 productList=new ProductList(driver);
		 cartPage=new CartPage(driver);
		 checkoutpage=new CheckOutPage(driver);
		
	}
  
  @BeforeTest
  public  void SetUP() {
	  TestBase.openUrl("https://www.saucedemo.com");
	  loginPage.validLogin("standard_user", "secret_sauce");
	  
  }
  @Test(priority=1)
  public  void AddItemTest() {
		
		  boolean title =productList.IsOnproductPage(); 
		  Assert.assertTrue(title);
		
	  productList.AddtoCart();
	  productList.ViewCart();
	  boolean Isadded=cartPage.VerifyElementAdded();
	  Assert.assertTrue(Isadded);
	  //
	  
	  
	  
  }
  @Test(priority=2)
  public void checkingItems()
  {
	  cartPage.checkOut();
  }
  @Test(priority=3)
  public void continuetest() {
	  checkoutpage.passinfo("naresh", "tcs", "123456");  
	  checkoutpage.Continue();
  }
  @Test(priority=4)
  public void finishtest() {
	   
	  checkoutpage.finish();
  }
  
  @AfterClass
  public void closeBrowser() {
	  
	 // TestBase.tearDown();	
	}
}
