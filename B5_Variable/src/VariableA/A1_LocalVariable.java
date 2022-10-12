package VariableA;

public class A1_LocalVariable {

	// Local variable starts from line6 to 12 . outside of tht we can not initialize that 
		public static void main(String[] args) 
		{
			int i=1;
			int j=2;
			int k=i+j;
			System.out.println(k);
		}
		public static void add()
		{
			int k=i+j; // thsi will not execute, bse this is not a local variable
		}

}
