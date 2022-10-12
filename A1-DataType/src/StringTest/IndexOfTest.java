package StringTest;

public class IndexOfTest {

	public static void main(String[] args) {
		
		String a="Vcentry";
		System.out.println(a.indexOf('e'));
		System.out.println(a.indexOf('y'));
		System.out.println(a.indexOf('a'));
		System.out.println(a.indexOf('d')); // -1 will return, bse d is not present in the string
	}

}
