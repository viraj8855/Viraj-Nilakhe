package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoQAClick
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	Thread.sleep(2000);
	
		//for double click
	WebElement doubleclickMe= driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));//find webelemnet
	
		Actions xyz= new Actions(driver);   //xyz=act
		
		xyz.doubleClick(doubleclickMe); //xyz.doubleClick(doubleclickMe).perform
		xyz.perform();
		Thread.sleep(4000);
		
		//for right click
		WebElement rightclickMe= driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
		
			Actions act= new Actions(driver);   
			
			act.contextClick(rightclickMe).perform(); 
			Thread.sleep(4000);
			
			//for single click
			WebElement clickMe= driver.findElement(By.xpath("//button[text()='Click Me']"));
			
				Actions ff= new Actions(driver);   
				
				ff.click(clickMe).perform(); 
				Thread.sleep(4000);
			
		
	
	}


}
