package A2_Interface;

public class A2_SBIBank implements A1_RBIBank{
	public static void main(String[] args) {
		A2_SBIBank s= new A2_SBIBank(); // creating object for class
		s.credit();
		s.debit();
		s.loan();
		s.lockerSystem();
		
		/*A1_RBIBank r = new A2_SBIBank();// instance of class and interface
		r.credit();
		r.debit();
		r.loan();*/
		
		
		
	}
	public void lockerSystem()
	{
		System.out.println("min 10 lakhs account holder locker facility is available");
	}
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}
	}


