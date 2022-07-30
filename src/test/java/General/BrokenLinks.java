package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		//System.setProperty(“propertyName”, “value”)
		
		//Step -1
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Workspace\\MavenBasics\\MavenBasics\\Drivers\\chromedriver.exe");
		
		//WebDriverManager.chromedriver.setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//step-2
		
		
	}

}
