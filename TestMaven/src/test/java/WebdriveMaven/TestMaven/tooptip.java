package WebdriveMaven.TestMaven;

import javax.swing.ToolTipManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooptip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Maximize browser
		driver.manage().window().maximize();
		
		//open URL
        driver.get("https://www.facebook.com/");
		
		//find sign up web element
		String actualtoolTip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		String expectedToolTip = "Sign Up";
		
		if(actualtoolTip.equals(expectedToolTip))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	
		
	  }

			

	}


