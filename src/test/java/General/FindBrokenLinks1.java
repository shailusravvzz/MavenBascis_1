package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class FindBrokenLinks1 {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/broken-link1.html");

		Thread.sleep(5000);


		List<WebElement> links=driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for(WebElement link:links) {

			String StringURl= link.getAttribute("href");

			URL url=new URL(StringURl);  		  

			URLConnection urlconnection= url.openConnection();

			HttpURLConnection httpConnection=(HttpURLConnection) urlconnection;

			httpConnection.setConnectTimeout(5000);

			httpConnection.connect();

			if (httpConnection.getResponseCode() != 200) {

				System.out.println(StringURl+ " " +  httpConnection.getResponseCode()+" " +httpConnection.getResponseMessage());
			}

			httpConnection.disconnect();


		}  driver.quit();

	}

}
