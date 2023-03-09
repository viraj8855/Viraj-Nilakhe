package projectFolder;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_Addbagproduct 
{
	@Test
	public void addbagproduct() throws IOException 
	{  
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is opened");
		
		UtilityclassforScreenshot.screenshotmethod(driver,"TC03_BAgproduct");
		System.out.println("Login page screenshot Captured");
		
		driver.manage().window().maximize();
		System.out.println("window maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// start login activity//
		
		// create object of LoginPomclass and INSErT (driver)* in argument of constructor
		LoginPOMclass s =new LoginPOMclass(driver);  
		
		s.SendUsername();
		System.out.println("Username is entered");
		
		s.SendPassword();
		System.out.println("pass is entered");
		
		s.clickloginbtn();
		System.out.println("clicked on lgn buttn");
		
		//............HOME PAGE........
		
		System.out.println("came on Homepage");
		
		//..........APPLY VERIFICATION...............//
	
		String expectedtitle="Swag Labs";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		
		HomePOMclass hp = new HomePOMclass(driver);
		hp.addbagproduct();
		System.out.println("bagproduct added to cart");
		
		String ExpectedProductSelected="3";                   //validation deliberatly wrong-- 1 expected
		String ActualProductSelected=hp.getTextFromcart();
		Assert.assertEquals(ActualProductSelected, ExpectedProductSelected);
		
		driver.quit();
		System.out.println("browser is closed");
		
		
		
		
		
	}


}
