package A1_ConstructorTest;
//1.constructor name should be same as class name
//2.constructor should not be have a static keyword
//3.Initialize the local variable and assign the value to global variables.
//4.void is not present means then it is constructor
//5.constructor will be called at the time of object creation
//6.constructor can't be a final, but we can declare public,private,default,protected
//7.constructor have default constructor and parameterized constructor.

public class A1_ConstructorTest {

	public static int i;//2nd point, globaly declare
	public static int j;//2nd point,
	
	public static void main(String[] args) {
		System.out.println(i);//o/p 0
		System.out.println(j);// o/p 0
		A1_ConstructorTest d= new A1_ConstructorTest();// d for default constructor, 1.class name and object name should be same.
		System.out.println(i); // o/p 5
		System.out.println(j); // o/p 5
		A1_ConstructorTest p= new A1_ConstructorTest(10,10);//passing the value for parametrised constructor 
		System.out.println(i);// o/p 10
		System.out.println(j); // o/p 10
	}
	public A1_ConstructorTest() // default constructor
	{
		i=5;
		j=5;
	}
	public A1_ConstructorTest(int i,int j) // parametirized constructor
	{
		this.i=i;//over riding the function
		this.j=j; 
	}

}
