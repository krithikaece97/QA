package StringBufferAndStringBuilder;
//string is always immutable, it won't concatenate to overcome this we r going for stringbuffer and stringbuilder
public class StringBufferTest {
	//string buffer is mutable, it accepts append method
	//synchronized

	public static void main(String[] args) {
		String a = "Keerthi";//normal string wont concatinate
		a.concat("MTech");
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer("keerthi");
		sb.append("Mtech");
		System.out.println(sb);

	}

}
