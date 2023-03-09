package projectFolder;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_verifyLogOutFunctionality 
{
	@Test
	public void verifyLogOutFunctionality() throws IOException
	{  
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is opened");
		
		UtilityclassforScreenshot.screenshotmethod(driver,"TC02_VErifyLOgout");
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
		
		HomePOMclass hp= new HomePOMclass(driver);
		
		hp.settingbtnClick();
		System.out.println("clicked on setting button");
		
		hp.clicklogoutbtn();
		System.out.println("clicked on logout button");
		
	
		driver.quit();
		System.out.println("browser is closed");
		
		
		
		
	}


}
