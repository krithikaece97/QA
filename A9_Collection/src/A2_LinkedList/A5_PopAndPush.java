package A2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A5_PopAndPush {

public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("a");
		l.add("d");
		l.add("e");
		l.add("f");
		System.out.println(l.pop()); // this line will remove the first data outside
		l.push("aaa");// it will insert in 1st line
		
		Iterator it =   l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
	