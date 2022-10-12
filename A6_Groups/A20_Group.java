package A6_Groups;
//in a 100 testcase, we want to separate in 30 + 30 + 40 testcase...  that's y we r using groups concept
import org.testng.annotations.Test;

public class A20_Group {
	@Test(priority = 1,groups = {"login","book","logout"})
	public void login()
	{
		System.out.println("login Executed");
	}
	@Test(priority = 2,groups = {"login","book"})
	public void search()
	{
		System.out.println("search the ticket");
	}
	@Test(priority = 3,groups = {"login","book"})
	public void booking()
	{
		System.out.println("booking is completed");
	}
	@Test(priority = 4,groups = {"login"})
	public void cancel()
	{
		System.out.println("ticket cancelled");
	}
	@Test(priority = 5,groups = {"login","logout"})
	public void logout()
	{
		System.out.println("logout successful");
	}

}
