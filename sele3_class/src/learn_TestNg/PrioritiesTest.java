package learn_TestNg;

import org.testng.annotations.Test;

public class PrioritiesTest
{
	//output according to given priority 

	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("login test");
	}
	
	@Test(priority=2)
	public void addToCart()
	{
		System.out.println("add to cart");
	}
	
	@Test(priority=3)
	public void payment()
	{
		System.out.println("payment test");
	}
	
	@Test(priority=4)
	public void checkout()
	{
		System.out.println("check out test");
	}
}
