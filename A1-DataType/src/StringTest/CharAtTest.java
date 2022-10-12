package StringTest;

public class CharAtTest {

	public static void main(String[] args) {
		        //0123456
		String a="Vcentry";
	    //System.out.println(a.split(","));
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(4));
		//System.out.println(a.charAt(7));  //index error
		System.out.println(a.charAt(-1)); //index error
	}

}
