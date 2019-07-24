package properties_config_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config_FB {

	static Properties prop;
	
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(".//variable_fields//details.properties");
			
			prop = new Properties();
			
			prop.load(fis);
			
			System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get(prop.getProperty("url"));
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.name(prop.getProperty("firstname"))).sendKeys(prop.getProperty("firstname"));
			
			driver.findElement(By.id("reg_email__")).sendKeys(prop.getProperty("reg_email__"));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
