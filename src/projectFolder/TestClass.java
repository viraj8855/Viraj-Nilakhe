package projectFolder;    //37 notes

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBaseclass
{
	//1.LOGIN
	@Test
	public void verifylogin01()
	{
		String ExpectedTitle="Swag Labs";
		String ActualTitle= driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	//2.LOGOUT 
	
	@Test
	public void verifylogout02()
	{
		HomePOMclass hp = new HomePOMclass(driver);
		
		hp.settingbtnClick();
		System.out.println("Clicked on setting button");
		
		hp.clicklogoutbtn();
		System.out.println("clicked on logout button");
		
		// Apply validation
		String ExpectedTitle="Swag Labs";
		String ActualTitle= driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	//3.ADD BAG PRODUCT
	@Test
	public void verifyAddBagProduct()
	{
		HomePOMclass hp = new HomePOMclass(driver);
		
		hp.addbagproduct();
		System.out.println("bagproduct added to cart");
		
		String ExpectedProductSelected="3";                   //validation
		String ActualProductSelected=hp.getTextFromcart();
		Assert.assertEquals(ActualProductSelected, ExpectedProductSelected);
		
		
		
	}
	
	

}
