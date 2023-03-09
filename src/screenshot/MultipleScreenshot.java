package screenshot; // 18.SCREENSHOTS METHOD//7.2.23

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshot 
{
	//screenshotmethod//create
	static WebDriver driver;
	public static void screenshotmethod(String name) throws IOException 
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File destfile= new File("E:\\Screenshotsjava\\"+name+".jpg");
		FileHandler.copy(sourcefile, destfile);
		
	}
	// MAIN METHOD REGULAR PROGRAM//
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
		 driver =new ChromeDriver();   //** DONT USE WebDriver driver**
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		// SCREENSHOT 1
		screenshotmethod("SaaucedemoLoginpage"); 
		System.out.println("Screenshot of login page taken");
		
		
		WebElement username= driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
				Thread.sleep(4000);
				
			WebElement password= driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			Thread.sleep(2000);
			
			WebElement loginbutton =driver.findElement(By.id("login-button"));
			loginbutton.click();
			System.out.println("home page");
			
			// SCREENSHOT 2
			screenshotmethod("SaucedemoHomepg");
			System.out.println("Screenshot of login page taken");
		
	}
	

}
