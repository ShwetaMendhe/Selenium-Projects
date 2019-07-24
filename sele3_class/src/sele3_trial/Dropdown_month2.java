package sele3_trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_month2 {
	
	static Select se_day_dd;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dd= driver.findElement(By.id("month"));
		se_day_dd= new Select(month_dd);
		
		List<WebElement> dd_list = se_day_dd.getOptions();
		for(int i=0;i<dd_list.size();i++)
		{
			String dd_value = dd_list.get(i).getText();
			System.out.println("dropdown value is: "+dd_value);
			
			if(dd_value.equals("May"))
			{
				se_day_dd.selectByVisibleText(dd_value);
				break;	
			}
		}
		
		driver.quit();
			
	}
}
