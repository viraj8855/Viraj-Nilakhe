package keyboardact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyAct1heroku 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chrome driver\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		Actions act = new Actions(driver);
		act.sendKeys("k").perform();
		
		WebElement msg= driver.findElement(By.xpath("//p[@id=\"result\"]"));
		
		String expectedmsg = "You entered: K"; 
		String actualmsg = msg.getText();
		
		System.out.println(actualmsg);
		
		if(expectedmsg.equals(actualmsg))
		{
			System.out.println("TC pass");
		
		}
		else
		{
			System.out.println("TC fail");
		}
		
		

		
	}

}

