package A15_ExplicitWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");
		
		WebElement loginLink=	wd.findElement(By.linkText("Login"));
		loginLink.click();
		WebElement username=	wd.findElement(By.id("id_username"));
		username.sendKeys("venkatvtu");
		WebElement password=	wd.findElement(By.name("password"));
		password.sendKeys("Venkat@12345");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		
		WebDriverWait w= new WebDriverWait(wd, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("element1")));
		
		WebElement elementSet1=	wd.findElement(By.id("element1"));
		elementSet1.click();
		WebElement radioButtonLink=	wd.findElement(By.id("element4"));//if we are handling single element 
		radioButtonLink.click();
		List<WebElement> radio=	wd.findElements(By.name("technology1"));// at a same time if we are handling multiple element 
		for(int i=0;i<radio.size();i++)
		{
		String data=	radio.get(i).getAttribute("value");
			System.out.println(data);
			if(data.equals("Flask"))
			{
				radio.get(i).click();
			}
		}
		
	}

}
