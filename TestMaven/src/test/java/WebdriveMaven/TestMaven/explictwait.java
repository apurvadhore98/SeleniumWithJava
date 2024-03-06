package WebdriveMaven.TestMaven;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class explictwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//open URL
		driver.get("http://www.ebay.in/");
		//explicit wait of 10 seconds
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	
				
		Stopwatch watch = null;

				try {
					watch = Stopwatch.createStarted();
					//find webelement "START SELLING"
					WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
					element.click();
					//driver.findElement(By.linkText("START SELLING")).click();
				}
				catch(Exception e)
				{
					watch.stop();
					System.out.println(e);
					System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
				}
			

	}

}
