package sele3_trial;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_anchortag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		List noofTags =(List) driver.findElement(By.tagName("a"));
		System.out.println("the total number of anchor tags are: "+noofTags.size());
		for(WebElement ele:noofTags){
			System.out.println(ele.getText());
			if(ele.getText().equals("Privacy")){
				ele.click();
				break;
			}
		}
		driver.quit();
	}
}
