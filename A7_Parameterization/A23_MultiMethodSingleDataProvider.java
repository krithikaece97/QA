 package A7_Parameterization;
//multiple method with single data provider using constructor concept
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class A23_MultiMethodSingleDataProvider {
//          abc1
	String username;//initalize the variable in global
	String password;
	String ticket1;
	String ticket2;
	
	// By using constructor we can solve this problem//class and constructor name should be same
	@Factory(dataProvider = "testdata")//in constructor we can't use @Test annotation, we use @Factory annotation here
	public A23_MultiMethodSingleDataProvider(String username,String password,String ticket1,String ticket2)//in previous concept, we are 
	//passing a parameter in methods, here we can pass all parameters in constructor method.
	{//         abc1      "abc1
		this.username=username;
		this.password=password;
		this.ticket1=ticket1;
		this.ticket2=ticket2;
		
		
	}
	
	@Test(priority = 1)
	public void login()
	{                                             // abc1
		System.out.println("Enter the username -  "+username);
		System.out.println("Enter the password - "+password);
	}
	
	@Test(priority = 2)
	public void booking()
	{
		System.out.println("Booking ticket 1 - "+ticket1);
		System.out.println("Booking ticket 2---"+ticket2);
	}
	@DataProvider(name="testdata")
	public static Object[][] intializedata()
	{
		// single data pass single dimention
		//               [iterator] [data]
		//Object[][] i=new Object[2][4];
		
		Object[][] data=new Object[3][4];
		//1st iteration
		data[0][0]="abc1";
		data[0][1]="pass1";
		data[0][2]="Bus ticket1";
		data[0][3]="Train ticket1";
		//2 nd iteration
		data[1][0]="abc2";
		data[1][1]="pass2";
		data[1][2]="Bus ticket2";
		data[1][3]="Train ticket2";
		//3rd iteration
		data[2][0]="abc3";
		data[2][1]="pass3";
		data[2][2]="Bus ticket3";
		data[2][3]="Train ticket3";
		
		return data;
	}
	
}

