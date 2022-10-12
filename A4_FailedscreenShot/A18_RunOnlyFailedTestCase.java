package A4_FailedscreenShot;
//if we want to run only a failed test mns we have to use this concept... if we run this program, sub and mul method will be failed
//after executing this program... refresh it and left side test-output ----> under that we have to click testng-failed.xml, this
//file ill show the failed test case, we can run the failed test case methods

import org.testng.annotations.Test;

@Test
public class A18_RunOnlyFailedTestCase {
	
	public void add()
	{
		System.out.println("add");
	}
	public void sub()
	{
		int i=1/0;
		System.out.println("sub");
	}
	public void mul()
	{
		int j=1/0;
		System.out.println("mul");
	}
	public void div()
	{
		System.out.println("div");
	}
}
