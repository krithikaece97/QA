package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A40_Deselect {

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
		WebElement elementlink = wd.findElement(By.id("element10"));
		elementlink.click();
		WebElement dropdownlink = wd.findElement(By.id("element11"));
		dropdownlink.click();
		WebElement days = wd.findElement(By.id("days"));
		Select s = new Select(days);
        s.selectByIndex(0);//this will select the index value of 0
        Thread.sleep(1000);
        s.selectByIndex(1);//this will select the index value of 1
        Thread.sleep(1000);
        s.selectByIndex(2);//this will select the index value of 2
        Thread.sleep(1000);
        //get all selected
        
        List<WebElement> day = s.getAllSelectedOptions();//returntype of getallselectedoption is List<webelement>
        for (int i=0;i<day.size();i++)//this loop ill execute the selected option
        {
        	String text = day.get(i).getText();
        	System.out.println(text);
        }
        
        //deselect
        
        s.deselectByIndex(0);
        Thread.sleep(1000);
        s.deselectByIndex(1);
        Thread.sleep(1000);
        s.deselectByIndex(2);
        Thread.sleep(1000);

	}

}
