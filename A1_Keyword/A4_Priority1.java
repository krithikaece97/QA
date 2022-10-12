package A1_Keyword;
//we can add priority no based on wat we want like 0,-1,-2....

import org.testng.annotations.Test;

public class A4_Priority1 {
	
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
	public void add() {
		System.out.println("add");
	}
	@Test(priority=2)
	public void sub() {
		System.out.println("sub");
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
