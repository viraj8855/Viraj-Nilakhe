package testpack1;   //24.1.23 add to cart, chq cart,remove from cart

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoAddCart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	
		Thread.sleep(1000);
		System.out.println("Browser opended");
		
		WebElement username= driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
	System.out.println("user name entered");
		Thread.sleep(2000);
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		System.out.println("pass entered");
		Thread.sleep(2000);
		
		WebElement loginbtn = driver.findElement(By.id("login-button"));//a
		loginbtn.click();//b                                          // combine a+b no need loginbtn variable start frm driver
		System.out.println("Clicked on lgn btn");
		Thread.sleep(2000);
		
		String expectedtitle = "Swag Labs"; // its given in document
		String actualtitle = driver.getTitle();
		
	System.out.println(actualtitle);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	System.out.println("added to cart");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("(//body//div//a)[5]")).click(); //relative Xpath
	System.out.println("clicked on cart");
	Thread.sleep(4000);
	
	driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	System.out.println("item removed");
	Thread.sleep(4000);

	}

}
