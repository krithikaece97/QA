package A4_Encapsulation;

public class A1_Encap {
	private String username;
	private int processingamount;
	
	
	
	public String getUsername() throws InterruptedException {
		System.out.println("please wait we are processing ur request");
		Thread.sleep(3000);
		return username;
	}
	public void setUsername(String username) { // by passing the parameter
		this.username = username; // this keyword is used to set the current method
	}
	public int getProcessingamount() {
		
		int oldamount=1000;
		int newamount=oldamount-processingamount;
		System.out.println("customer old amount "+oldamount);
		System.out.println("after detection : "+newamount);

		return processingamount;
	}
	public void setProcessingamount(int processingamount) {
		this.processingamount = processingamount;
	}
	
	
	
	

}
