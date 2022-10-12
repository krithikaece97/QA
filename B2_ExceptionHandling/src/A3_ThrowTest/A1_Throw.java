package A3_ThrowTest;

public class A1_Throw {

	public static void main(String[] args) throws Exception {
		int age=17;
		if(age<18)
		{
			System.out.println("warning : you are not allow to vote");
			throw new Exception("you are under 18");// Throw will create the exception,throws ill pass the exception
		}// try and catch ill solve the exception

	}

}
