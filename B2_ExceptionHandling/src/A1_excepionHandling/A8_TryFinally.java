package A1_excepionHandling;

public class A8_TryFinally {

	public static void main(String[] args) {
		System.out.println("program starts");
		try
		{
			System.out.println("login");
			int i=1/0;
		}
		finally // execute the finally block before execute the exception
		{
			System.out.println("logout");
			
		}
		System.out.println("try finally completed");
	}

}
