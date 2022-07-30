package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class FindBrokenLinks {

	public static void main(String[] args) throws Exception {
		
		// Configuring the system properties of Chrome driver
		//System.setProperty(parameter, value)
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");

		//Initializing the browser driver
		//WebDriver-interface, Driver=local variable, new=keyword, ChromeDriver= abstract class
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		Thread.sleep(5000);
		
		
		//Step-2 
		
		//find out the links using tage <a> and storing in list(list to avoid dublicates)
		
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   
	   System.out.println(links.size());
	   
	   //step-3 access one by one ,converting into URL by acessing href attribute from locator
	   int i=0;
	   
	   for(WebElement link:links) {
		   
		  String StringURl= link.getAttribute("href");
		   
		 //step -4: Converting string into URL object
		  
		  URL url=new URL(StringURl);         //url instance created
		  
		  //Step-5 open connection to server -Once open a connection one object is creatred, store in URLConnecgtion
		  
		 URLConnection urlconnection= url.openConnection();
		 
		 //Step -6:  convert url into Http request, HttpURLConnection is abstract Class
		 
		 HttpURLConnection httpConnection=(HttpURLConnection) urlconnection;
		 
		 
		 //Step -7:  Sending HTPPS/HTTP request to server,
		 
		 httpConnection.setConnectTimeout(5000);
		 
		 httpConnection.connect();
		 
		 //Step-8: TO get th response code
		 
		 if (httpConnection.getResponseCode() != 200) {
			 
			 System.out.println(link+ " " +  httpConnection.getResponseCode()+" " +httpConnection.getResponseMessage());
		i++; }
		 
		 httpConnection.disconnect();
		 
		  
	   } System.out.println(i);
	    driver.quit();
	    
	}

}
