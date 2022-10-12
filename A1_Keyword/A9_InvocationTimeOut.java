package A1_Keyword;
//invocation timeout should be always greater than a thread.sleep(equal or less than mns it ill not execute test case will be failed)
import org.testng.annotations.Test;

public class A9_InvocationTimeOut {

	@Test(priority=1,invocationTimeOut = 7000)
	public void add() throws InterruptedException {
		Thread.sleep(6000);
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
