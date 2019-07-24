package learn_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {
	
	@Test
	public void loginTest()
	{
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods={"loginTest"})
	public void addToCart()
	{
		System.out.println("add to cart");
		Assert.assertTrue(false, "the condition is failed----");
	}
	
	@Test(dependsOnMethods={"loginTest","addToCart"})
	public void payment()
	{
		System.out.println("payment test");
	}
	
	@Test(dependsOnMethods={"payment"})
	public void checkout()
	{
		System.out.println("check out test");
	}

}
