package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1744909695%3A1674146048288983&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfJR6sggjrRV_bHZIFFsDSz_bDRK5-NE5fnh95BU8X9cDnRQ3vzDkE2hgzpcB8tG9zso23kxw");
	Thread.sleep(2000);
	
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("8855854140");
	System.out.println("email entered");
	Thread.sleep(2000);
		
		WebElement Password= driver.findElement(By.id("pass"));
		Password.sendKeys("jagadish1733");
		System.out.println("pass entered");
		Thread.sleep(2000);
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		loginbtn.click();
		System.out.println("login");
		Thread.sleep(2000);
		
		String expectedtitle = "Facebook"; // its given in document
		String actualtitle = driver.getTitle();
		
		System.out.println(driver.getTitle());  // print title on console
		Thread.sleep(5000);
		
		if (expectedtitle.equals(actualtitle))     //dont use semicolon infront of if condn
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case failed");
		}
		
		driver.quit();
		System.out.println("browser is closed ");
	}
	
}
