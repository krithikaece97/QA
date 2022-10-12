package A6_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A41_ClickAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/alert/");
		WebElement elementlink = wd.findElement(By.id("element1"));
		elementlink.click();
		WebElement alertlink = wd.findElement(By.id("element7"));
		alertlink.click();
		WebElement alert = wd.findElement(By.id("id1"));
		alert.click();
		Alert a = wd.switchTo().alert();//alert returntype is Alert. switchTo is used for targetelement. This line is for alert window
		Thread.sleep(1000);
		a.accept();//to click ok
		//a.dismiss();//to click cancel
	}

}
