package A2_Annotations;
//it ill execute starting of the test and ending of the test
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A13_BeforeTestAfterTest {
	
	@BeforeTest
	public void systemOn()
	{
		System.out.println("system on");
	}
	@AfterTest
	public void systemOff()
	{
		System.out.println("system off");
	}
	@BeforeClass
	public void startNetwork()
	{
		System.out.println("network is enable");
	}
	@AfterClass
	public void closeNetwork()
	{
		System.out.println("netwok is disconnected");
	}
	
	
	@BeforeMethod
	public void browser(){
		System.out.println("browser opened");
	}
	
	@AfterMethod
	public void browserClosed() {
		System.out.println("browser closed");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void search()
	{
		System.out.println("search");
	}
	@Test
	public void book()
	{
		System.out.println("book");
	}
	@Test
	public void cancel()
	{
		System.out.println("cancel");
	}
}
