package VariableA;

public class A4_InstanceVariable {

	// Instance Variables= without creating the object we can't call the instance variable 
	
		int i=1; //instance variable mns declaring only variable
		int j=2;
		public static void main(String[] args) {
			A4_InstanceVariable a= new A4_InstanceVariable();// class name and obj name should be same
			int k=a.i+a.j;
			System.out.println(k);
		}
		//public static void add()

		//{
			//A4_InstanceVariable a= new A4_InstanceVariable();
			//int k=a.i+a.j;
		//}

}
