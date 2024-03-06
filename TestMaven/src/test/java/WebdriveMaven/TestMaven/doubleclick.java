package WebdriveMaven.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
				
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				
		Actions act = new Actions (driver);
		act.doubleClick(button).perform();//double click action
				

	}

}
