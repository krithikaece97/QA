package A1_excepionHandling;
//At a time only one exception will handle...... first exception ill always execute

public class A4_TryCatch {

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
		catch(Exception e) { //this is a parent of both index and arithmetic exception
			System.out.println("alert:something went wrong");
			System.out.println(e.getLocalizedMessage());
		}
	}

}
