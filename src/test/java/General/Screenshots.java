package General;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

//https://www.youtube.com/watch?v=DlhWLWzHPvw&list=PPSV

public class Screenshots {

	public static void main(String[] args) throws Exception {
		
//Step -1:
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		
//Step -2 : 
	//getscreenshoot methos not available in webdriver so  driver should be casted to takescreenshot (interface)
		
		TakesScreenshot takesscreenshot=(TakesScreenshot) driver;         //refernce to takesScreenShot
				
		File sourcefile =takesscreenshot.getScreenshotAs(OutputType.FILE); //Screen shot stores in file   // equals to driver.getscreenshotsAs
		
		File Distnfile=new File("./ScreenShots/image1.jpg"); // creating new Screenshot in local folder  
		
		FileUtils.copyFile(sourcefile, Distnfile);
		
		System.out.println("File  ScreenShot saved Sucessfully");
		
	}

}
