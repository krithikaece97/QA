package stepDefinition;
import java.util.concurrent.TimeUnit;

//import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.LoginPage;

public class LoginTest {
	WebDriver wd;
	@Given("check Browser as {string}")
	public void checkBrowserAs(String browser) {
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	 
	}
	@When("enter the url as {string}")
	public void enterTheUrlAs(String url) {
	   //wd.get(url);
		LoginPage.pageURL(url, wd);
	}
	
	@And ("click the login link") 
	public void clickTheLoginLink()
	{
		LoginPage.clickLoginLink(wd);
	}
	@Then ("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
		LoginPage.verifyLoginPage(wd);
	}
	@When("enter the username as {string}")
	public void enterTheUsernameAs(String username) {
		
		LoginPage.enterLoginUserName(wd, username);
	}
	@Then("enter the password as {string}")
	public void enterThePasswordAs(String password) {
		
		LoginPage.enterLoginPassword(wd, password);
	}

	
	@And ("Click the login button")
	public void ClickTheLoginButton()
	{
		LoginPage.clickLoginButton(wd);
	}
	
	@And ("validate the homepage loaded successfully")
	public void validateThehomepageLoadedSuccessfully()
	{
		LoginPage.homePage(wd);
	}
	
}
