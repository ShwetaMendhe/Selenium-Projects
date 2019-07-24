package sele3_trial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		CaptureScreenShots("image");
		driver.findElement(By.id("email")).sendKeys("shweta@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("shweta123");
		CaptureScreenShots("image1");
		driver.quit();
	}


	public static void CaptureScreenShots(String screenshotsName ) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile =ts.getScreenshotAs(OutputType.FILE);
		File destfile= new File("./screenshot/fb.png");
		try {
			FileUtils.copyFile(srcfile, destfile);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}