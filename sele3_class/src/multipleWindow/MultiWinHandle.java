package multipleWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWinHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com");
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//return you window id's open by browser
		Set<String> wid = driver.getWindowHandles();
		
		//window id's
		System.out.println(wid);
		System.out.println(driver.getTitle());
		
		Object[] id=wid.toArray();
		
		driver.switchTo().window((String) id[1]);
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window((String) id[2]);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
