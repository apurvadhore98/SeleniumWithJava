package WebdriveMaven.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmpop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Maximize browser
		driver.manage().window().maximize();
				
		//Open URL
		driver.get("https://testautomationpractice.blogspot.com/");
				
		//find alert button and perform click action
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		Thread.sleep(2000);
				
		//switch to alert window, enter name
		driver.switchTo().alert().accept();//ok button pressed
		
		//driver.switchTo().alert().dismiss();//cancel button pressed
						

	}

}
