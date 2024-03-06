package WebdriveMaven.TestMaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.saucedemo.com/v1/");
		
		//Locate user name -tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//Locate password- Tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//Locate Login button Using Tag value of class name
		driver.findElement(By.cssSelector("#login-button")).click();
		
		//Switch Product Page
		String CurrentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(CurrentWindowHandle);
		
		//Tag.value class[attribute=value]
		driver.findElement(By.cssSelector("button.btn[body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)]")).click();
		
		//Tag attribute$=string
		driver.findElement(By.cssSelector("button[name=light]")).click(); 

	}

}
