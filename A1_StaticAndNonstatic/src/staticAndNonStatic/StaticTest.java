package staticAndNonStatic;

public class StaticTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest a= new StaticTest();
		System.out.println(a);
		//a.add();
	a.calc();

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
