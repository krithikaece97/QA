package A8_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A50_NormalScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		
		//TakeScreenShot and wd are interface.so we r type casting that. getscreenshots has OutputType and FILE format
		
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\Vcentry\\D1_WebDriverTest\\Screenshot\\google.png"));
	    //capture the ss and store in to a file. from is src and to is new file and location. at the end we have the add the file 
		//name and .extension... in automation mostly we use png

	}

}
