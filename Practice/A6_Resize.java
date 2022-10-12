package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_Resize {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
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
		WebElement actionlink = wd.findElement(By.id("element20"));//findelement of action link
		actionlink.click();
		WebElement resizelink = wd.findElement(By.id("element21"));//findelement of resize link
		resizelink.click();
		
		Actions a = new Actions(wd);//if we want to perform mouse r action, we want to create a Actions object. then pass the parameter wd
		WebElement resize = wd.findElement(By.xpath("//*[@id=\"id6\"]/div/div"));//findelement of resize
		a.clickAndHold(resize).build().perform();//this ill click and hold the resize box
		Thread.sleep(2000);
		System.out.println("...");
		a.moveToElement(resize, 150, 150).build().perform();//this ill move the x and y axis of the box
		a.release(resize).build().perform();//after movement we have to release the mouse. In action class we have to use build and perform always
		

	}

}
