package hit.day27;

import java.util.ArrayList;
import java.util.List;

public class GericsInCollection {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("fdfss");
		//processing
		for(Object ob:list) {//A good way of coding
			String s=(String)ob;
			System.out.println(s);
		}
		for (Object ob : list) {//bad way of coding as its has if-condtion
			if(ob instanceof String) {
				String ss=(String)ob;
				System.out.println(ss);
			}else if(ob instanceof Box) {
				Box bb=(Box)ob;
				System.out.println(bb);
			}
		}
	}
}
class Box{
	
}