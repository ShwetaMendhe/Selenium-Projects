package multipleWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow_ForEachLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com");
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//return you window id's open by browser
		Set<String> wid = driver.getWindowHandles();
				
		Object[] id=wid.toArray();
		
		//for each loop
		for(Object id1:id)
		{
			System.out.println(id1);
			driver.switchTo().window((String) id1);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			driver.close();
		}
	}

}
