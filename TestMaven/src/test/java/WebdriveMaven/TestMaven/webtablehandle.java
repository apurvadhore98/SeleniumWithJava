package WebdriveMaven.TestMaven;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Maximize browser
				driver.manage().window().maximize();
				
				//open URL
				driver.get("https://testautomationpractice.blogspot.com/");
				
				List<WebElement>rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
				System.out.println("rows:"+ rowList.size());
				
				List<WebElement>columList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
				System.out.println("rows:"+columList.size());
				

				for(int r =2;r<=rowList.size();r++)//row
				{
					for(int c=1;c<=columList.size();c++)//column
					{
						String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]" )).getText();
						System.out.println(data);
					}
				}
				driver.close();
				
				

	}

}
