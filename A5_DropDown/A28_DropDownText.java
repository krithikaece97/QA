package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A28_DropDownText {

	public static void main(String[] args) {
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
		WebElement elementlink = wd.findElement(By.id("element10"));
		elementlink.click();
		WebElement dropdownlink = wd.findElement(By.id("element11"));
		dropdownlink.click();
		WebElement month = wd.findElement(By.id("month"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)// to all the options we r using for loop
		{
			String text = options.get(i).getText();//return type of gettext is string
			System.out.println(text);
		}
		

	}

}
