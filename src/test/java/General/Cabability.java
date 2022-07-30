package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Cabability {

	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=lvIXXilkw60&list=PPSV
		//Desired Capabilities is a class in Selenium used to set properties of browsers to perform cross browser testing of web applications
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.merge(caps);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://cacert.com");

	}

}
