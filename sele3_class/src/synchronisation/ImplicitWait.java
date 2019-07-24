package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("Shweta");
		driver.findElement(By.name("lastname")).sendKeys("Mendhe");
		driver.findElement(By.name("reg_email__")).sendKeys("sweety@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Shweta123");
		
		driver.quit();
	}

}
