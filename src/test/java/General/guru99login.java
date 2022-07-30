package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class guru99login {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		//PageFactory.initElements(driver,this);
		
		
		driver.get("https://demo.guru99.com/V4/");
		
		WebElement txtUsername  = driver.findElement(By.name("uid"));
		WebElement txtPassword  = driver.findElement(By.name("password"));
		WebElement btnLogi      = driver.findElement(By.name("btnLogin"));
		
		txtUsername.sendKeys("mngr406145");
		txtPassword.sendKeys("myreden");
		btnLogi.click();
		
		//Thread.sleep(3000);
		
		WebElement NewCustomer =driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
		
		NewCustomer.click();
		
		driver.quit();
		
	}

}
