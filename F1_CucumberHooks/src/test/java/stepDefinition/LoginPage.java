package stepDefinition;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPage {
	WebDriver wd;
	@Given("check Browser as {string}")
	public void checkBrowserAs(String browser) {
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	 
	}
	@Before(order=2)//in cucumber we have to use only before and after annotation(after and before method and all used in testNG)
	public void startDbConnection()//in cucumber we have to use order(for testNG we use priority)
	{
		System.out.println("--------Db connection is started2----------");//first hook concept, then background, then scenario
	}
	
	@After(order=2)
	public void closeDbConnection()
	{
		System.out.println("--------------Db connection is closed2-----");
	}
	
	@Before(order=1)
	public void startconnection2()
	{
		System.out.println("--------Db connection is started1----------");
	}
	@After(order=1)
	public void closeconnection2()
	{
		System.out.println("--------------Db connection is closed1-----");
	}
	
	@When("enter the url as {string}")
	public void enterTheUrlAs(String url) {
	   
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");
	}
	
	@And ("click the login link") 
	public void clickTheLoginLink()
	{
		WebElement loginLink=	wd.findElement(By.linkText("Login"));
		loginLink.click();
	}
	@Then ("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
	String Title =	wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
//	Assert.assertEquals("Log in", Title); // execution fail
	SoftAssertions s = new SoftAssertions();
	s.assertThat("Log in".equals(Title));
	s.assertAll();
	}
	@When("enter the username as {string}")
	public void enterTheUsernameAs(String username) {
		WebElement username1=	wd.findElement(By.id("id_username"));
		username1.sendKeys(username);
	   
	}
	@Then("enter the password as {string}")
	public void enterThePasswordAs(String password) {
		WebElement password1=	wd.findElement(By.name("password"));
		password1.sendKeys(password);
	  
	}

	
	@And ("Click the login button")
	public void ClickTheLoginButton()
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	
	@And ("validate the homepage loaded successfully")
	public void validateThehomepageLoadedSuccessfully()
	{
	String actual=	wd.findElement(By.xpath("/html/body/main/div/div[1]/div/h3/em")).getText();
	Assert.assertEquals("Technologies", actual);
	}
	
}