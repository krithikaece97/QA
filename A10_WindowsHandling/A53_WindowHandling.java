package A10_WindowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A53_WindowHandling {

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
		WebElement windowhandlelink = wd.findElement(By.xpath("//*[@id=\"element6\"]"));
		windowhandlelink.click();
		//wd.get("https://djangovinoth.pythonanywhere.com/multiwindow/");
		wd.findElement(By.id("id1")).click();
		Set<String> windowhandle = wd.getWindowHandles();// getwindowhandles returntype is set<string>
		//This set is linkedhashset type, it will maintain the insertion order.for windowshandling we want only linkedhashset
		Iterator<String> it = windowhandle.iterator();//if we r using set concept mns we have to iterator.
		String parent = it.next();//this program we have 3windows...so we have to use 3 it.next()
		String child1 = it.next();
		String child2 = it.next();
		
		System.out.println(child1);
		wd.switchTo().window(child2);//this switchTo window ill directly go to the targeted window(which we pass in parameter)
		String text = wd.getTitle();//here after we can access the window in normal way like gettext, sendvalues etc...
		System.out.println(text);
		Thread.sleep(1000);
		
		

	}

}
