package projectFolder;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMclass 
{
	//1.WEBDRIVER DCLERE
		WebDriver driver;
		
		//setting btn
		@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
		WebElement settingbtn;
		
		public void settingbtnClick()              
		{
			settingbtn.click();
		}
		
		//Aboutbtn
		@FindBy(xpath="//button[@id=\"about_sidebar_link\"]")
	    WebElement Aboutbtn;
		
		public void aboutbtnclk()                 //....method for pass enter
		{
			Aboutbtn.click();	
		}
		
		//logout btn
		@FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")
	    WebElement logoutbtn ;
		
		public void clicklogoutbtn ()                 //....method 
		{
			logoutbtn.click();
		}
		
		//add bag prodt 
		@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	    WebElement addbagproduct ;
		
		public void addbagproduct ()                 //....method 
		{
			addbagproduct.click();
		}
		
		//cart icon clik
				@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
			    WebElement cart ;                                 // find elemnt
				
				public void clickoncart ()                 //....method for click = action perform
				{
					cart.click();
				}
				
				public String getTextFromcart()           // method to get text from cart= action perform
				{

					String actualProductSelected = cart.getText();
					return actualProductSelected;
				}
				
				//multiprod
				@FindBy(xpath = "//button[text()='Add to cart']")

				List<WebElement> multiProducts;
				
				public void clickMultiproduct()

				{
					for (WebElement a:multiProducts)

					{
						a.click();
					}
				}

        //dropdown
				@FindBy(xpath = "//select[@class=\"product_sort_container\"]")

				private WebElement dropDown;

				public void clickDropDown() 
				{
					dropDown.click();
					Select s = new Select(dropDown);
					s.selectByValue("lowtohigh");
				}
				
				
		
		
		//4. Create Constructor
		public HomePOMclass(WebDriver driver)
		{
			this.driver= driver;
			
			PageFactory.initElements(driver, this);
		}
}
