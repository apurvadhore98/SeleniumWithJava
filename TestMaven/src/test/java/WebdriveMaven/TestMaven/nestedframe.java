package WebdriveMaven.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nestedframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");//parent frame/outer frame
		driver.switchTo().frame("frame3");//child frame/inner frame
				
		//find webelemnt checkbox
		driver.findElement(By.id("a")).click();
				
		//switch to parent frame
		driver.switchTo().parentFrame();
				
		//find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("this is text msg");
				
		//switch to default content/main page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
				
		//find webelement animal dropdown
		 WebElement  dropDownElement =  driver.findElement(By.id("Animals"));
		 Select dropDown = new Select(dropDownElement);
				
		dropDown.selectByVisibleText("Cat");

	}

}
