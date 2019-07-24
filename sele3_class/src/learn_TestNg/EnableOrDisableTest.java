package learn_TestNg;

import org.testng.annotations.Test;

public class EnableOrDisableTest 
{
	
	@Test(enabled=true)
	public void testcase_1()
	{
		System.out.println("test case 1");
	}
	
	@Test(enabled=false)
	public void testcase_2()
	{
		System.out.println("test case 2");
	}
	
	@Test
	public void testcase_3()
	{
		System.out.println("test case 3");
	}
	
	@Test(enabled=false)
	public void testcase_4()
	{
		System.out.println("test case 4");
	}
	
	@Test(enabled=true)
	public void testcase_5()
	{
		System.out.println("test case 5");
	}

}
