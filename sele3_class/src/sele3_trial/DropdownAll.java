package sele3_trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement day_dd= driver.findElement(By.id("day"));
		Select se_day_dd =new Select(day_dd);
		se_day_dd.selectByIndex(29);
		
		WebElement month_dd= driver.findElement(By.id("month"));
		Select se_month_dd= new Select(month_dd);
		se_month_dd.selectByVisibleText("May");
		
		WebElement year_dd= driver.findElement(By.id("year"));
		Select se_year_dd= new Select(year_dd);
		se_year_dd.selectByValue("1989");
		
		driver.quit();
		
	
	}

}
