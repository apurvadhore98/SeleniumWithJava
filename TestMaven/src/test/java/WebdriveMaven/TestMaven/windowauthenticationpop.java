package WebdriveMaven.TestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowauthenticationpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Maximize browser
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
