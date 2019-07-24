package learn_TestNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNg_Assertion {

	@Test
	public void testcase_1()
	{
		System.out.println("test case 1");
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void testcase_2()
	{
		System.out.println("test case 2");
		
		Assert.assertTrue("condition doesn't match", false);
	}
	
	@Test
	public void testcase_3()
	{
		System.out.println("test case 3");
	
		Assert.assertFalse("condition doesn't match", true);
	
	}
	
	@Test
	public void testcase_4()
	{
		System.out.println("test case 4");
		
		Assert.assertFalse("condition doesn't match", false);
	}
	
	@Test
	public void testcase_5()
	{
		System.out.println("test case 5");
		
		Assert.assertEquals("value doesn't match", 12, 13);
	}
	
	@Test
	public void testcase_6()
	{
		System.out.println("test case 6");
		
		Assert.assertEquals("value doesn't match", 12, 12);
	}
}
