package A4_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A25_CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement loginLink = wd.findElement(By.linkText("Login"));
		loginLink.click();
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("Krithika");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("Keerthi@15");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement element = wd.findElement(By.id("element1"));
		element.click();
		WebElement checkboxlink = wd.findElement(By.id("element3"));
		checkboxlink.click();
		WebElement dijango = wd.findElement(By.id("Django"));
		if(dijango.isDisplayed())
		{
			System.out.println("checkbox is displayed");
		}
		if(dijango.isEnabled())
		{
			System.out.println("checkbox is enabled");
		}
		if(!dijango.isSelected())
		{
			System.out.println("checkbox is not selected");
			dijango.click();
		}
		else
		{
			System.out.println("checkbox is already selected");
		}
	
		
	    
	    
	}

}
