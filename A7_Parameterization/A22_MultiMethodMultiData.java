package A7_Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A22_MultiMethodMultiData {
	@Test(priority = 1,dataProvider = "login")//we r using priority because of 2 methods
	public void login(String username,String password)
	{
		System.out.println("Enter the username -  "+username);
		System.out.println("Enter the password - "+password);
	}
	
	@Test(priority = 2,dataProvider = "book")
	public void booking(String ticket1,String ticket2)
	{
		System.out.println("Booking ticket 1 - "+ticket1);
		System.out.println("Booking ticket 2---"+ticket2);
	}
	
	@DataProvider(name="login")
	public Object[][] logindata()
	{
		
		//               [iterator] [data]
		//Object[][] i=new Object[2][4];
		
		Object[][] data=new Object[2][2];
		//1st iteration
		
		data[0][0]="abc1";
		data[0][1]="pass1";
		//2 nd iteration
		
		data[1][0]="abc2";
		data[1][1]="pass2";
	
		
		return data;
	}
	
	@DataProvider(name="book")
	public Object[][] bookingdata()
	{
		// single data pass single dimention
		//               [iterator] [data]
		//Object[][] i=new Object[2][2];
		
		Object[][] data=new Object[2][2];
		//1st iteration
		
		data[0][0]="Bus ticket1";
		data[0][1]="Train ticket1";
		//2 nd iteration
		
		data[1][0]="Bus ticket2";
		data[1][1]="Train ticket2";
	
		
		return data;
	}
}
