package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A38_JavaSelectByValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement loginlink = wd.findElement(By.linkText("Login"));
		loginlink.click();
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("Krithika");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("Keerthi@15");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement elementlink = wd.findElement(By.id("element10"));
		elementlink.click();
		WebElement dropdownlink = wd.findElement(By.id("element11"));
		dropdownlink.click();
		WebElement month = wd.findElement(By.id("month"));
		List<WebElement> options = month.findElements(By.tagName("option"));
		System.out.println("Total size:" + options.size());
		for(int i=0;i<options.size();i++)
		{
			String text = options.get(i).getAttribute("value");
			if(text.equals("38"))
			{
				options.get(i).click();
			}
		}
	}

}
