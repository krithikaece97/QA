package A4_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A55_AutoComplete {

	public static void main(String[] args) throws InterruptedException {
    
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
		WebElement elementlink = wd.findElement(By.id("element1"));
		elementlink.click();
		wd.get("https://djangovinoth.pythonanywhere.com/autocomplete/");
		//WebElement autocompletelink = wd.findElement(By.xpath("//*[@id=\"element5\"]"));
		//autocompletelink.click();
		WebElement tag1 = wd.findElement(By.id("tags1"));
		tag1.sendKeys("a");
		List<WebElement> tag2 = wd.findElements(By.xpath("//*[@id=\"ui-id-3\"]/li"));
		System.out.println("hi");
		System.out.println(tag2.size());
		
		for(int i=0; i<tag2.size(); i++)
		{
			String text = tag2.get(i).getText(); 
			System.out.println(text); 
			
	}
	}

}
