package WebdriveMaven.TestMaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindowopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();

		//open url
		driver.get("https://www.google.com/");
		System.out.println("first page: " + driver.getTitle());

		//open new tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		System.out.println("second tab: " + driver.getTitle());

		//get window handles of open windows
		Set <String> windowHandles=	driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
				
		driver.close();
		driver.switchTo().window(handles.get(0));//switch to google.com
		System.out.println("first page: " + driver.getTitle());
				
				

	}

}
