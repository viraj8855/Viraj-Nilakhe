package testpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo1 
{
	
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	Thread.sleep(2000);
		
		WebElement username= driver.findElement(By.id("user-name"));
		
		
		username.sendKeys("standard_user");
		Thread.sleep(4000);
		
	WebElement password= driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	WebElement loginbutton =driver.findElement(By.id("login-button"));
	loginbutton.click();
	System.out.println("home page");

		
	}

}
