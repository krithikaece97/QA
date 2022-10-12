package A1_Keyword;
//if my client want to execute the 2 test case at same priority, we have to give same priority no of 2 test case, and it ill execute in ascending
//order of both test case

import org.testng.annotations.Test;

public class A4_Priority2 {
	@Test(priority=-1)
	public void network()
	{
		System.out.println("network");
	}
	@Test(priority=0)
	public void browser()
	{
		System.out.println("browser");
	}
	@Test(priority=1)
	public void add() {//depending on method name it ill give output in ascending order not a syso output
		System.out.println("add2");
	}
	@Test(priority=1)
	public void sub1() {
		System.out.println("add1");
	}
	@Test(priority=3)
	public void mul() {
		System.out.println("mul");
	}
	@Test(priority=4)
    public void div() {
    	System.out.println("div");
    }
}
