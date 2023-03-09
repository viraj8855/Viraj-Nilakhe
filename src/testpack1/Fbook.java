package testpack1;   //17.01.23 notes  // 19.01.23 prac // phto like activity 26.01

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbook 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("8855854140");
	System.out.println("email entered");
	Thread.sleep(2000);
		
		WebElement Password= driver.findElement(By.id("pass"));
		Password.sendKeys("xxxxxxx");
		System.out.println("pass entered");
		Thread.sleep(2000);
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		loginbtn.click();
		System.out.println("login");
		Thread.sleep(5000);
		
		String expectedtitle = "Facebook"; // its given in document
		String actualtitle = driver.getTitle();
		
		System.out.println(driver.getTitle());  // or (actualtitle)// print title on console
		Thread.sleep(5000);
		
		if (expectedtitle.equals(actualtitle))     //dont use semicolon infront of if condn
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case failed");
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div[1]//i")).click(); //remove Span from xpath at last
		System.out.println("liked photo");
		Thread.sleep(4000);
	}

}
