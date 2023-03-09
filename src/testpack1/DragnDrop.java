package testpack1;//1-2-23

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(2000);
	
	WebElement oslo= driver.findElement(By.id("box1"));
	WebElement spain= driver.findElement(By.id("box107"));
	
	Actions act= new Actions(driver);
	act.dragAndDrop(oslo, spain).perform();
	}

}
