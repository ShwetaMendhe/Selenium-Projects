package multipleWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows_Iterator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com");
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		//returns window id
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window id: "+parent);
		
		
		Set<String> wid = driver.getWindowHandles();
		
		Iterator<String> itr = wid.iterator();
		
		while(itr.hasNext())
		{
			String child_window=itr.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.quit();
		
	}

}
