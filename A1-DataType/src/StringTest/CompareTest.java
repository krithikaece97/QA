package StringTest;

public class CompareTest {

	public static void main(String[] args) {
		String a="vcentry";
		String b="vcentry";
		System.out.println(a.compareTo(b));
		
		String c="Vcentry";
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));

	}

}
