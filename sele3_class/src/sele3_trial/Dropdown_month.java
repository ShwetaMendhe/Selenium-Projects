package sele3_trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_month {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dd = driver.findElement(By.id("month"));
		Select se_day_dd= new Select(month_dd);
		
		WebElement selected_option=se_day_dd.getFirstSelectedOption();
		System.out.println("before selection selected value is: "+selected_option.getText());
		Thread.sleep(3000);
		
		se_day_dd.selectByVisibleText("Mar");
		Thread.sleep(3000);
		
		WebElement selected_option1=se_day_dd.getFirstSelectedOption();
		System.out.println("after selection selected value is: "+selected_option1.getText());
		driver.quit();
	}

}
