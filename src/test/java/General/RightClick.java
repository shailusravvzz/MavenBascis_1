package General;
//https://www.youtube.com/watch?v=wuEefkHhT5o&list=PPSV

import org.apache.commons.codec.net.PercentCodec;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		Actions actions=new Actions(driver);  //actiosn class for mouse operations
		
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		//Actions actions=new Actions(driver);
		
		actions 
		.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
		.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
		.moveToElement(driver.findElement(By.id("menu_admin_viewLocations")))
		.click()
		.perform();
		
		
		driver.findElement(By.id("searchLocation_name")).sendKeys("Hyderabad");
		
		actions.doubleClick(driver.findElement(By.id("searchLocation_name"))).perform();
		Thread.sleep(5000);
		
		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//double clik is context click
		
		actions.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
				
	driver.quit();	
		
	}

}
