package A1_excepionHandling;
//IndexOutOfBoundsException ill execute first, bse it is a parent of ArithmeticException

public class A3_TryCatch {

	public static void main(String[] args) {
		System.out.println("program starts"); // indication of program starting
		try
		{
			int[] a = new int[2];//indexoutofboundsexception error ill occurs
			a[0]=1;
			a[1]=2;
			a[3]=3;
			int i=1/0; // this line will create arithmetic exception error.. so we put in try block..to avoid error
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("alert:please check the size");
			System.out.println(e.getLocalizedMessage());
		}
		catch(ArithmeticException e) { //in catch block we enter a exact error like arithmetic exception
			System.out.println("alert: Please enter valid input"); // alert msg
			System.out.println(e.getLocalizedMessage()); // this will get.. wat exact error will be..
		}
		System.out.println("program completed"); // completed msg

	}

}
