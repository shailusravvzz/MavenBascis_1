package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopeCommerse {

	public  void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://admin-demo.nopcommerce.com/login");
	
		WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement subbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		
		email.sendKeys("admin@yourstore.com");
		password.sendKeys("admin");
		subbtn.click();
		
		driver.quit();
	}
		
    }


