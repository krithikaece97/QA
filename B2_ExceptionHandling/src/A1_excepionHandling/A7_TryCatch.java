package A1_excepionHandling;

public class A7_TryCatch {

	public static void main(String[] args) {
		try
		{
			String name=null;
			name.toUpperCase();
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
		catch(Exception e) { //this is a parent of both index and arithmetic exception
			System.out.println("alert:something went wrong");
			System.out.println(e.getLocalizedMessage());
		}
		catch(Throwable e) { //this is a grandparent.. If we put this catch in first mns.. it ill show error
			System.out.println("alert:server error");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("program completed"); // completed msg

	}

}
