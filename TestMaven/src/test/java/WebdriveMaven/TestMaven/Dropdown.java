package WebdriveMaven.TestMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		//launch chrome browser
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		//open https://www.opencart.com/index.php?route=account/register
				driver.get("https://testautomationpractice.blogspot.com/");
				WebElement element = driver.findElement(By.id("country"));

				Select dropdown = new Select(element);

				//dropdown.selectByVisibleText("Hong Kong");
				//dropdown.selectByValue("98");
				dropdown.selectByIndex(3);

				if(dropdown.isMultiple())
				{
					System.out.println("Drop down is multiple");
				}
				else
				{
					System.out.println("Drop down is not  multiple");
				}


				List <WebElement> alldropdownoptions = dropdown.getOptions();

				System.out.println("Total options:" + alldropdownoptions.size());
				for(WebElement el :alldropdownoptions )
				{
					System.out.println(el.getText());
				}
				
				driver.close();


	}

}
