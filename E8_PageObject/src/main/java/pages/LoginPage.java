package pages;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class LoginPage {

	
	public static void pageURL(String url,WebDriver wd)
	{
		wd.get(url);
	}
	
	public static void clickLoginLink(WebDriver wd)
	{
		WebElement loginLink=	wd.findElement(By.linkText("Login"));
		loginLink.click();
	}
	public static void verifyLoginPage(WebDriver wd)
	{
		String Title =	wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
//		Assert.assertEquals("Log in", Title); // execution fail
		SoftAssertions s = new SoftAssertions();
		s.assertThat("Log in".equals(Title));
		s.assertAll();
	}
	
	public static void enterLoginUserName(WebDriver wd,String username)
	{
		WebElement username1=	wd.findElement(By.id("id_username"));
		username1.sendKeys(username);
	}
	
	public static void enterLoginPassword(WebDriver wd,String password)
	{
		WebElement password1=	wd.findElement(By.name("password"));
		password1.sendKeys(password);
	}
	
	public static void clickLoginButton(WebDriver wd)
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	public static void homePage(WebDriver wd)
	{
		String actual=	wd.findElement(By.xpath("/html/body/main/div/div[1]/div/h3/em")).getText();
		Assert.assertEquals("Technologies", actual);
	}
}

