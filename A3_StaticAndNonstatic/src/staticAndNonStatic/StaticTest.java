package staticAndNonStatic;

public class StaticTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest a= new StaticTest();
		System.out.println(a); 
		a.add(); // non static method so we can access by using object
		sub(); //static method so we can directly access
	    a.calc(); // non static method so we can access by using object

	}
	public void add()
	{
		System.out.println("add");
	}
	public static void sub()
	{
		System.out.println("sub");
	}
	public void calc()
	{
		add();
		sub();
	}
}
