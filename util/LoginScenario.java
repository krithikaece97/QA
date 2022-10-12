package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScenario {
	public static WebDriver loginVcentryApplication()//instead of void... we r using returntype (webdriver) here
	{
	WebDriverManager.chromedriver().setup();
	WebDriver wd = new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
	WebElement loginlink = wd.findElement(By.linkText("Login"));
	loginlink.click();
	WebElement username = wd.findElement(By.id("id_username"));
	username.sendKeys("Krithika");
	WebElement password = wd.findElement(By.name("password"));
	password.sendKeys("Keerthi@15");
	password.submit();
	wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
	return wd;//to intialize webdriver r using return
	
		
	}

}
