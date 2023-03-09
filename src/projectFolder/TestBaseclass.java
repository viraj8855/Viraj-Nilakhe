package projectFolder;       //34 notes sel

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBaseclass 

{
	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	System.out.println("browser is opened");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("url is opened");
	
	UtilityclassforScreenshot.screenshotmethod(driver,"TC01_LoginPageScreenshot");
	System.out.println("Login page screenshot Captured");
	
	driver.manage().window().maximize();
	System.out.println("window maximized");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	LoginPOMclass lp = new LoginPOMclass(driver);
	
	lp.SendUsername();
	System.out.println("username entered");
	
	lp.SendPassword();
	System.out.println("pass entered");
	lp.clickloginbtn();
	
	
	}
	
	public void teardown()
	{
	driver.quit();
	System.out.println("browser is closed");
	}
}
