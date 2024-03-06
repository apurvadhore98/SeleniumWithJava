package WebdriveMaven.TestMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadfile {

	public static void main(String[] args) throws AWTException {
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();

		//open https://www.opencart.com/index.php?route=account/register
		driver.get("https://demoqa.com/upload-download");
		
		//Find Web element choose file 
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		Robot rb = new Robot();
		rb.delay(2000);
		
		//Copy File to to clipboard
		StringSelection ss= new StringSelection("C:\\Users\\APURVA\\OneDrive\\Desktop\\Software Quality Assurance Notes.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//perform control + v action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
