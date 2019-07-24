package sele3_trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		Select se_day_dd=new Select(driver.findElement(By.id("day")));
		se_day_dd.selectByIndex(0);
		Thread.sleep(3000);
		
		se_day_dd.selectByValue("22");
		Thread.sleep(3000);
		
		se_day_dd.selectByVisibleText("11");
		driver.quit();
	}
}

