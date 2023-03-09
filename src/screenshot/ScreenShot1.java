package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Screenshot1
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File sourceFile= ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("E:\\Screenshotsjava\\SauceDemologinpg.jpg"); // name.jpg remember
		FileHandler.copy(sourceFile, destFile);
		System.out.println("Screenshot is taken");
		
WebElement username= driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(4000);
		
	WebElement password= driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	WebElement loginbutton =driver.findElement(By.id("login-button"));
	loginbutton.click();
	System.out.println("home page");
	
	//SS2
	TakesScreenshot hp= (TakesScreenshot)driver;
	
	File sourceFile1= hp.getScreenshotAs(OutputType.FILE);
	File destFile1=new File("E:\\Screenshotsjava\\SauceDemoHomepg.jpg"); // name.jpg remember
	FileHandler.copy(sourceFile1, destFile1);
	System.out.println("Screenshot2 is taken");
		
	}

}
