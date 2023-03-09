package testpack1; //new26

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBcreateacc 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
		WebElement createnewacc= driver.findElement(By.xpath("(//body//form//div/a)[3]"));
		
		createnewacc.click();
	System.out.println("clicked on Creat new btn");
	Thread.sleep(4000);
	
	// for date dropdown
	WebElement date= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	date.click();
	Thread.sleep(2000);
	
	Select d = new Select(date);
	d.selectByIndex(5);
	Thread.sleep(2000);
	 
	// for month drop down
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	month.click();
	
	Select m = new Select(month);
	m.selectByIndex(11);
	Thread.sleep(2000);
	
		//for yeardropdown
	WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	year.click();
	
	Select y = new Select(year);
	y.selectByValue("1996");
	Thread.sleep(2000);
		
		
	
	}

}
