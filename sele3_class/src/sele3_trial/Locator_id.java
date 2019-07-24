package sele3_trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_id {

	public static void main(String[] args) {
	
				System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.facebook.com");
				driver.findElement(By.id("email")).sendKeys("shweta@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("shweta123");
				driver.findElement(By.id("u_0_2")).click();
				driver.quit();
	}
}