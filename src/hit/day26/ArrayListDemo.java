package hit.day26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//once you created iterator and list iterator you cannot add to collection
public class ArrayListDemo {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("Hello World");
		list.add("hai");
		list.add(120);
		list.add(new Stone());
		for (Object o : list) {
			System.out.println(o);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator iter=list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		ListIterator listiter=list.listIterator();
		while (listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while (listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
		String s[]=new String[4];
		s[0]="hello";
		s[1]="world";
		s[2]="welcme";
		s[3]="java";
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (String str : s) {
			System.out.println(str);
		}
	}
}
class Stone{
	
}

