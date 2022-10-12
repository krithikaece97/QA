
 package A4_FailedscreenShot;
//we can use ITestResult, it will only take screenshoot of the failed testcase
//here bing window is failed, so it ill take screenshoot of bing window
//we can take a failed test case screen shot only @AfterMethod.
//ITestResult is a interface
//tearDown is a 
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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A17_FailedOnlyScreenShot {
	public WebDriver wd;
	@Test(priority = 2)
	public void google()
	{
	WebDriverManager.chromedriver().setup();
	wd= new ChromeDriver();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	wd.manage().window().maximize();
	
	wd.get("https://www.google.com/");
	WebElement search=wd.findElement(By.name("q"));
	
	search.sendKeys("chennai");
	search.submit();
}
	@Test(priority = 1)
	public void bing()
	{
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://www.Bing.com/");
		WebElement search=wd.findElement(By.name("vary"));
		
		search.sendKeys("chennai");
		search.submit();
	}
	@AfterMethod
	public void tearDown(ITestResult r) throws IOException
	{
		
		if(!r.isSuccess())// !(not) is used to execute the failed test case, if we did not use not it wll execute the passed test case
		{
		File src=    ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	
		FileHandler.copy(src, new File("D:\\Vcentry\\TestNg\\ScreenShot\\"+r.getName()+".png"));//normally we give a file name which we
		//want to store a screenshot...again and again we don't want to give a file name. for that here we r using getNmae() method.
		//it ill automatically create a file name, which test case is failed.
		}
	}
}
