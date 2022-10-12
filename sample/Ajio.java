package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		WebElement emailid = wd.findElement(By.id("ap_email"));
		emailid.sendKeys("krithikasankar05@gmail.com");
		WebElement cont = wd.findElement(By.id("continue"));
	    cont.click();
		WebElement password = wd.findElement(By.id("ap_password"));
		password.sendKeys("..........");
		WebElement signin = wd.findElement(By.id("signInSubmit"));
		signin.click();
		WebElement search = wd.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 13 pro");
		search.submit();
		WebElement phone = wd.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		phone.click();
		WebElement buynow = wd.findElement(By.id("buy-now-button"));
		buynow.click();
		
	
	}

}
