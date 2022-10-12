package A5_Polymorphism;
// same function or method called in different ways in same class
// by no of parameters
// by different data types
// by rearrange the data types and parameter

public class A1_OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,1);
		add(1,1,1);
		add(2,2,"two+two= ");
		add(3,"three+three= ",3);
		

	}
	public static void add(int i,int j)
	{
		//int i=1;
		//int j=1;
	//        1+1	
		int k=i+j;
		System.out.println(k);
	}
	public static void add(int i,int j,int k)
	{
		
		int z=i+j+k;
		System.out.println(z);
	}
	public static void add(int i,int j,String msg)
	{
		int k= i+j;
		System.out.println(msg+k);
	}
	public static void add(int i,String msg,int j)
	{
		int k= i+j;
		System.out.println(msg+k);
	}

}
