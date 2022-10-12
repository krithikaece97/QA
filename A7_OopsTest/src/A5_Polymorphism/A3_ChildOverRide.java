package A5_Polymorphism;

public class A3_ChildOverRide extends A2_ParentOverRide{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3_ChildOverRide c = new A3_ChildOverRide();
		c.copy();

	}
	public static void add()
	{
		//2+5
		System.out.println("i am from child add");
	}
	//                         1     1
	public static void add(int i, int j)
	{
		System.out.println(i+j+" from child");
	}
	
	public void copy() // non static method, only super keyword can be used
	{
		super.add(); // this line ill directly goes to immediate parent class add method
	add();
		add(1, 1);
		//super.add(2,2);
	}

}
