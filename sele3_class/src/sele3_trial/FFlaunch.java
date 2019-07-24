package sele3_trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFlaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shweta\\Firefox Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		//FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.gmail.com");
		
		driver.close();

	}

}
