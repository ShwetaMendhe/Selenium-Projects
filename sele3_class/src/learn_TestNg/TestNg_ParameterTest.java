package learn_TestNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_ParameterTest {

	@Test
	@Parameters({"data1","data2"})
	
		public void test(@Optional("myfirstvalue") String s1,@Optional("mysecondvalue") String s2 )
		{
			System.out.println(s1+"---------"+s2);
		}
	}
	

