package learn_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_TestNG_FbPage {

	//this will take data from data provider which we created
	@Test(dataProvider="testdata")
	public void TestChrome(String uname, String upass) throws InterruptedException
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		//clear E-mail field and enter username
		//driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		
		
		//clear password field and enter password
		//driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(upass);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	//data provider to actually feed data to our test case
	
			@DataProvider(name="testdata") 
			public Object[][] TestDataFeed(){
				Object[][] fbdata=new Object[3][2];
				
				fbdata[0][0]="shweta@gmail.com";
				fbdata[0][1]="shweta789";
				
				fbdata[1][0]="sweety@gmail.com";
				fbdata[1][1]="sweety123";
				
				fbdata[2][0]="pravin@yahoo.com";
				fbdata[2][1]="pravin";
				
				//return array object
				return fbdata;
				
			}
	
	
}
