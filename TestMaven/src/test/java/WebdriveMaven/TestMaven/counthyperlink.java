package WebdriveMaven.TestMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class counthyperlink {

	private static WebElement[] linkElements;

	public static void main(String[] args) {
		
		//launch chrome browser
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		List <WebElement> linksElements = driver.findElements(By.tagName("a"));
		System.out.println("Total links on Web page:"+ linksElements.size());
				
		for(WebElement el:linkElements)
		{
			System.out.println(el.getText());
		}
		driver.close();

	}

}
