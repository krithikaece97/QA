package A1_excepionHandling;
//This prg ill be error, bse first catch will be parent exception so it ill handle all child class. If we execute child below parent
// mns it ill show u error
public class A6_TryCatch {

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
		}//while parent is present first, after that child wont allow
		catch(Exception e) { //this is a parent of both index and arithmetic exception
			System.out.println("alert:something went wrong");
			System.out.println(e.getLocalizedMessage());
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
