package A4_Element;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A26_RadioButton {

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
		WebElement radiobuttonlink = wd.findElement(By.id("element4"));
		radiobuttonlink.click();
		List<WebElement> radio = wd.findElements(By.name("technology1"));
		for(int i=0; i<radio.size();i++)
		{
			String data = radio.get(i).getAttribute("value");
			System.out.println(data);
			if(data.equals("Selenium"))
			{
				radio.get(i).click();
				
			}
		}

	}

}
