package keyboardact;       //26.notes //14/2/23

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPst 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find txt box1--typemsg(sendkeys)--selectall--copy
	    WebElement txtbox1= driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
	    txtbox1.sendKeys("Hello Viraj");
		
		Actions act = new Actions(driver);   // for copy---paste using keyboard
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//find txtbox2 ---click--paste
		WebElement txtbox2= driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		txtbox2.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//apply validations if else//
	
		
		
	}
}
