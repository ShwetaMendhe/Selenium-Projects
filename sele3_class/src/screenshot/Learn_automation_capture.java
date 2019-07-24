package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_automation_capture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("shweta@gmail.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);// takes screenshot and save in a file
		
		FileUtils.copyFile(source, new File("./screenshot/learn_capture.png"));
		
		System.out.println("screenshot taken");
		
		driver.quit();

	}

}
