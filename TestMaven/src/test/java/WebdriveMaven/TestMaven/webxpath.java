package WebdriveMaven.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webxpath {

	public static void main(String[] args) {
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//locate Username using single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		//locate password using Multiple attribute
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		//locate Login Button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		
		

	}

}
