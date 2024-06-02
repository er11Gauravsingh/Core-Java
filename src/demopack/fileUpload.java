package demopack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException 
	{ 
		String downloadPath=System.getProperty("user.dir");
		int i =1;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gaurav Singh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		// This is how  to set the default directory in chrome
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("profile.default_content_settings.popups", 0);
	    chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions options =new ChromeOptions();		
		options.setExperimentalOption("prefs",chromePrefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Gaurav Singh\\Documents\\check\\fileupload.exe");
		// Downloading process of the file
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTask")));
		driver.findElement(By.cssSelector("#processTask")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
		driver.findElement(By.id("pickfiles")).click();
		File f = new File (downloadPath+"/PDC_page-000"+i+".jpg");
		Thread.sleep(3000);
		if(f.exists())
		{
		    Assert.assertTrue(f.exists());
			if(f.delete()) 
			{
				System.out.println("File deleted");
			}
		}
		     i++;
		
	}
	

}
