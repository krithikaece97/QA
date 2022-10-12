package A3_Asserts;
//softassert is a class, so we can create a object here
//softassert ill execute all the testcase, even if it is error in testcase.
//if use assertall in this softassert, it ill execute the program and failed the testcase

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A15_SoftAssert {
	@Test(priority=1)
	public void title() throws InterruptedException
	{
		System.out.println("validating the title");
		String actual= "google";
		String expected= "Google";
		
		//Assert.assertEquals(actual, expected);
		System.out.println(".....");
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual,expected);
		Thread.sleep(3000);
		s.assertAll();//if we dont use assert.all function here mns it ill execute the title testcase without showing error, it is not suitable for real tym
		System.out.println("validation is complete");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("login page");
	}

}
