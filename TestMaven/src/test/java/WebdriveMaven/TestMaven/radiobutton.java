package WebdriveMaven.TestMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://udyamregistration.gov.in/udyam_Login.aspx");
		List<WebElement>radioButtonList =driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio button on web page :"+ radioButtonList.size());
		
		driver.close();

	}

}
