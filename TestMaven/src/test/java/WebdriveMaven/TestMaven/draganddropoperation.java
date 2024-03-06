package WebdriveMaven.TestMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class draganddropoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				//open https://www.opencart.com/index.php?route=account/register
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
				//find source and target web element
				
				WebElement source = driver.findElement(By.id("box6"));//rome
				WebElement target = driver.findElement(By.id("box106"));//Itlay
				
				Actions act = new Actions(driver);
						
				//dragAndDrop(sourceElemement, targetElement)
				act.dragAndDrop(source, target).perform();
				
	}

}
