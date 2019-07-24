package learn_TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_Annotation 
{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	
}
