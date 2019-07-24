package sele3_trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {   

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.quit();
		
	}

}
