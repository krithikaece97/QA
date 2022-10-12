package A4_Encapsulation;

public class A2_Gpay { // in encapsulation, we can't relation sub and super  class
public static void main(String[] args) throws InterruptedException {
		
		A1_Encap e = new A1_Encap(); // we can relation through super class object
		e.setUsername("vcentry");
		System.out.println("yes customer name exists : "+e.getUsername());
		e.setProcessingamount(100);
		System.out.println("your request detection "+e.getProcessingamount());

	}


}
