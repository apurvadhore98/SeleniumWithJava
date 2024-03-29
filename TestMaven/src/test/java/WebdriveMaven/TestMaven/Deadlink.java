package WebdriveMaven.TestMaven;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deadlink {

	public static void main(String[] args) {
		
		//launch chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\APURVA\\eclipse-workspace\\TestMaven\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				//maximise browser
				driver.manage().window().maximize();

				//wait 10 seconds
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

				//open url
				driver.get("http://www.deadlinkcity.com/");

				//find hyperlinks
				List <WebElement> linkList = driver.findElements(By.tagName("a"));

				int resCode = 200;//2xx response code is valid link 
				int brokenLinkCnt = 0;
				
				System.out.println("Total links on page:" + linkList.size());
				
				for(WebElement element:linkList)
				{
					String url = element.getAttribute("href");

					try {
						URL urllink = new URL(url);
						HttpsURLConnection huc = (HttpsURLConnection)urllink.openConnection();
						huc.setRequestMethod("HEAD");
						huc.connect();
						
						resCode = huc.getResponseCode();
						
						if(resCode >=400)
						{
							System.out.println(url + "broken link.");
							brokenLinkCnt ++;
						}


					}

					catch(MalformedURLException e)
					{

					}
					catch(Exception e)
					{

					}

				}
				System.out.println("Total broken links: " + brokenLinkCnt);





		

	}

}
