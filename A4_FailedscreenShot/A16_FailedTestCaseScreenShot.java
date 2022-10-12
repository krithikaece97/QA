package A4_FailedscreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A16_FailedTestCaseScreenShot {
	public WebDriver wd;
	@Test
	public void google()
	{
	WebDriverManager.chromedriver().setup();
	wd= new ChromeDriver();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	wd.manage().window().maximize();
	
	wd.get("https://www.google.com/");
	WebElement search=wd.findElement(By.name("vary"));
	
	search.sendKeys("chennai");
	search.submit();
}
	
	@Test
	public void tearDown() throws IOException
	{
		File src=    ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	
		FileHandler.copy(src, new File("D:\\Vcentry\\TestNg\\ScreenShot\\failed.png"));
		
	}
}
