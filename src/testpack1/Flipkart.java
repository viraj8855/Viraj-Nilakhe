package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
WebDriver driver = new ChromeDriver(); 
driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_CjwKCAiAoL6eBhA3EiwAXDom5kxYG08pu0thNrsCQ2vwmshnikd2z__-V9W0q0ky9d5x3lF2ooGPIRoCoPIQAvD_BwE_k_&gclid=CjwKCAiAoL6eBhA3EiwAXDom5kxYG08pu0thNrsCQ2vwmshnikd2z__-V9W0q0ky9d5x3lF2ooGPIRoCoPIQAvD_BwE");

driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
driver.findElement(By.id("ap_email")).sendKeys("8855854140");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("vvvv");
driver.findElement(By.id("signInSubmit")).click();

	}


}
