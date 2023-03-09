package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(9000);
		
	WebElement password= driver.findElement(By.name("password"));
	password.sendKeys("admin123");
	Thread.sleep(9000);
	
	WebElement loginbutton =driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
	loginbutton.click();
	System.out.println("home page");
	
		
	}


}
