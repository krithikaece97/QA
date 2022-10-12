package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_InputEmail {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement inputboxlink = wd.findElement(By.id("element2"));
		inputboxlink.click();
		WebElement inputemail = wd.findElement(By.name("email"));
		inputemail.sendKeys("krithikaece97@gmail.com");
		Thread.sleep(2000);
		WebElement inputemailsubmit= wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[3]/div/form/input[2]"));
		inputemailsubmit.click();
		WebElement inputfiletext = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[4]/div/form/input"));
		inputfiletext.sendKeys("C:\\Users\\HP\\Desktop\\Resume\\krithi.pdf");
		System.out.println("file is uploaded");
		

	}

}
