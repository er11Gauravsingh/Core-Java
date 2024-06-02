package demopack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class windowPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://admin:admin@the-internet.herokuapp.com/"); // Here we are passing username as admin and password as admin 
		driver.findElement(By.linkText("Basic Auth")).click();
		// This program we are using without AutoIT Tool only with the help of the above link format 

	}

}
