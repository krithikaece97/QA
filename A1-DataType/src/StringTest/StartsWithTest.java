package StringTest;

public class StartsWithTest {

	public static void main(String[] args) {
		String a="Vcentry";
		System.out.println(a.startsWith("Vcen")); //true
		System.out.println(a.startsWith("vcen")); //false
		System.out.println(a.startsWith("cen")); //false
	}

}
