package sele3_trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAll_Reduced {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement day_dd= driver.findElement(By.id("day"));
		WebElement month_dd= driver.findElement(By.id("month"));
		WebElement year_dd= driver.findElement(By.id("year"));
		
		SetDropdownValue(day_dd,"29");
		SetDropdownValue(month_dd,"May");
		SetDropdownValue(year_dd,"1989");
		
		driver.close();
	}

	public static void SetDropdownValue(WebElement dd_name,String dd_value)
	{
		Select se= new Select(dd_name);
		System.out.println("before selection: "+se.getFirstSelectedOption().getText());
		
		se.selectByVisibleText(dd_value);
		System.out.println("after selection: "+se.getFirstSelectedOption().getText());
	}
}
