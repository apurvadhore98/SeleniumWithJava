package WebdriveMaven.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class scrollwebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize Browser
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.calculator.net/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		//scroll Vertically down by 500pixels
		js.executeScript("window.scrollBy(0,1000)"); 
		
		//To scroll till visibility of web element
		WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		js.executeScript("arguments[0].scrollIntoView();",element );
		
		//To scroll down the web page at the bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		

	}

}
