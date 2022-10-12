package A1_excepionHandling;
//eventhough it executes exception or not, it will definetly execute finally block

public class A9_TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("program starts"); // indication of program starting
		try
		{
			int i=1/0; // this line will create arithmetic exception error.. so we put in try block..to avoid error
		}
		catch(ArithmeticException e) { //in catch block we enter a exact error like arithmetic exception
		System.out.println("alert: Please enter valid input"); // alert msg
		System.out.println(e.getLocalizedMessage()); // this will get.. wat exact error will be..
	}
		finally // execute the finally block before execute the exception
		{
			System.out.println("logout");
			
		}
	System.out.println("try finally completed"); // completed msg
	}

}
