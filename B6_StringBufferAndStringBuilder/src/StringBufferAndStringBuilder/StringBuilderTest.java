package StringBufferAndStringBuilder;
//non synchronized
//mutable
//it accept append
//no diff b/w string builder and string buffer

public class StringBuilderTest {

	public static void main(String[] args) {
		String a = "Keerthi";
		a.concat("MTech");
		System.out.println(a);
		
		StringBuilder sb = new StringBuilder("keerthi");
		sb.append("Mtech");
		System.out.println(sb);
	}

}
