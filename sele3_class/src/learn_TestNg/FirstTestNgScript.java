package learn_TestNg;

import org.testng.annotations.Test;

public class FirstTestNgScript 
{
	//if we are not providing any order then jUnit automatically follow alphabetical order
	
	
	@Test
	public void loginApplication(){
		System.out.println("hey this is my first script");
	}
	
	@Test
	public void selectItem(){
		System.out.println("Item selected");
	}
	
	@Test
	public void checkout(){
		System.out.println("check out completed");
	}

	
}
