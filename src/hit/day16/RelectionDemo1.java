package hit.day16;

import java.util.Scanner;

public class RelectionDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.static binding......things which cannot be changed
		Paint staticpaint = new RedPaint();
		System.out.println("object created through static way:"+staticpaint);
		//2. dynamic binding.... To dynamically create objects...

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the qualified class name:");
		String Paintclass=scan.next();
		Paint dynamicPaint=(Paint)Class.forName(Paintclass).newInstance();
		System.out.println("Object created through dynamic way...:"+dynamicPaint);
		//3. new way of creating objects dynamically....after jdk9
		System.out.println("please enter the one more class:");
		Paintclass=scan.next();
		Paint s=(Paint)Class.forName(Paintclass).getConstructor().newInstance();
		System.out.println("New dynamic way:"+s);
	}

}
abstract class Paint{
	
}
class RedPaint extends Paint{
	public RedPaint() {
		
	}
}
class BluePaint extends Paint{
	 public BluePaint(){
		
	}
}
