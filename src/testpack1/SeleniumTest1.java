package testpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
WebDriver driver = new ChromeDriver(); 
driver.get("https://www.burstoralcare.com");
System.out.println(driver.getTitle());       // not required

	}

}
