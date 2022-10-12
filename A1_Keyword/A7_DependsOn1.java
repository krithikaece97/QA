package A1_Keyword;

import org.testng.annotations.Test;
//dependson keyword is used for depending a previous test case... if one testcase failed(any exception) mns remaining all dependson 
//testcase will be skiped and not executed
public class A7_DependsOn1 {
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login")
	public void search()
	{
		int i =1/0;//arithmetic exception so this method ill failed and remaining all execution ill skipped
		System.out.println("search");
	}
	@Test(dependsOnMethods = "search")
	public void book()
	{
		System.out.println("book");
	}
	@Test(dependsOnMethods = "book")
	public void cancel()
	{
		System.out.println("cancel");
	}

}
