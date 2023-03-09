package testpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox1 
{
	public static void main(String[] args) 
	{
		
System.setProperty("webDriver.gecko.driver", "C:\\selenium webdriver\\geckodriver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver(); 
driver.get("https://www.facebook.com");
    

	}
	
}
