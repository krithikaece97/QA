package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	public static void enterUserName(WebDriver wd,String username)
	{
		wd.findElement(By.name("username")).sendKeys(username);
	}
	public static void enterPassword(WebDriver wd,String password)
	{
		wd.findElement(By.name("password")).sendKeys(password);
	}
	public static void clickLoginButton(WebDriver wd)
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	
	
	
	
	
	
}