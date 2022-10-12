package validateLogin;
//BDD(Behavioral Driven Development)
//Language(Gherkin language)plain english
//Junit is the execution here
//if DryRun=true mns, check only the steps in feature file and class file whether it is matches or not
//monochrome mns, just it will a console in neat mannner
//here we have to run a test case in runnerfile
//whatever we r entering in login.feature file... same ill be in loginpage file with the annotation and separate methods 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	@Given("check Browser is opened")
	public void checkBrowserIsOpened()
	{
		System.out.println("-------------Browser Opened");
	}
	
	@When ("enter the url")
	public void enterTheUrl()
	{
		System.out.println("---------------- enter the url");
	}
	@And ("click the login button") 
	public void clickTheLoginButton()
	{
		System.out.println("----------------CLicklogin");
	}
	@Then ("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
		System.out.println("-------------------- verifylogin");
	}
	@When ("enter the username") 
	public void enterTheUserName()
	{
		System.out.println("-------------- enter the username");
	}
	@Then  ("enter the password")
	public void enterThePassword()
	{
		System.out.println("-------------- enter the password");
	}
	@And ("Click the login button")
	public void ClickTheLoginButton()
	{
		System.out.println("---------------- click login button");
	}
	
	@And ("validate the homepage loaded successfully")
	public void validateThehomepageLoadedSuccessfully()
	{
		System.out.println("------------------- validate the login");
	}
	
}
