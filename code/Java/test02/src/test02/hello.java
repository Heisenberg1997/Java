package test02;
import java.util.*;
public class hello {

	public static void main(String[] args) {
		String a="A",b="B",c="C",d="D",e="E";
		List<String>list = new LinkedList<String>();
		list.add(a);
		list.add(e);
		list.add(d);
		list.set(1,b);
		Iterator<String> itor = list.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + "  ");
		}
		
		list.add(2,c);
		Iterator<String> itor2 = list.iterator();
		while(itor2.hasNext()) {
			System.out.print(itor2.next()+ "  ");
		}
		//System.out.println("Hello World!");
	}

}
