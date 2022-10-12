package A1_Keyword;
//if a client told u to execute a sub1,mul and then add() testcase in that order, priority no is also same for all the 3 test case.
//it is fully based on ascending order, we have rearrange the method through ascending oder which order we want to execute




import org.testng.annotations.Test;

public class A4_Priority3 {
	@Test(priority=1)
	public void c_add() {
		System.out.println("add");
	}
	@Test(priority=1)
	public void a_sub1() {
		System.out.println("add1");
	}
	@Test(priority=1)
	public void b_mul() {
		System.out.println("mul");
	}
}
