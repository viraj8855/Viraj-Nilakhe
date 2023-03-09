package projectFolder;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityclassforScreenshot 
{
	
	public static void screenshotmethod(WebDriver driver, String name) throws IOException 
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File destfile= new File("E:\\Screenshotsjava\\"+name+".jpg");
		FileHandler.copy(sourcefile, destfile);
		
	}
}
