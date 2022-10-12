package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
//pageobject is a basic framework... we have to create a separate separate package for all functions like login page, dropdown like that
//in real tym we have more than 100 package, if we take vcentry website also nearly 50+ classes..

public class LoginPage {
	
	public static void enterUserName(WebDriver wd,String username)//here we need not to directly declare a username and all, pass a parameter
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

