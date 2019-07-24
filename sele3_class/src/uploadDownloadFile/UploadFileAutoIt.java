package uploadDownloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileAutoIt {
	
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\SOFTWARE STUDY\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("file:///C:/Users/Nano/Desktop/fileupload.html");
		
		driver.findElement(By.id("1")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Nano\\Desktop\\AutoIT\\chromeupload.exe");
	}

}
