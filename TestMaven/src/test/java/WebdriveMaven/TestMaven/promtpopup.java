package WebdriveMaven.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promtpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Maximize browser
		driver.manage().window().maximize();
				
		//Open URL
		driver.get("https://testautomationpractice.blogspot.com/");
				
		//find alert button and perform click action
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
				
		//switch to alert window, enter name
		driver.switchTo().alert().sendKeys("Harry Potter");
		
		//Accept alert
		driver.switchTo().alert().accept();
						

	}

}
