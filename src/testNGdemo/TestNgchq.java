package testNGdemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgchq 
{
	@Test
	public void method1()
	{
		System.out.println("hello");
	}

	@BeforeMethod
	public void method2()
	{
		System.out.println("bye");
	}

}
