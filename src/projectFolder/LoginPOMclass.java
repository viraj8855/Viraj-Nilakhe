package projectFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMclass 
{
	//1.WEBDRIVER DCLERE
	WebDriver driver;
	
	//2.FINDING ELE with @FindBy
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	//3.Action perform on Element (Inside METHOD)
	public void SendUsername()                  //...method for username en ter
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
    WebElement password;
	
	public void SendPassword()                 //....method for pass enter
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
    WebElement ClickLoginbtn;
	
	public void clickloginbtn ()                 //....method for clik on login btn
	{
		ClickLoginbtn.click();
	}

	
	//4. Create Constructor
	public LoginPOMclass(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
}
