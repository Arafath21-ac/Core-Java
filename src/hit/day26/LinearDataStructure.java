package hit.day26;

import java.util.StringTokenizer;

public class LinearDataStructure {
	public static void main(String[] args) {
		String str= "Java,Python,Jee";
		StringTokenizer st=new StringTokenizer(str,",");
		while (st.hasMoreElements()) {
			System.out.println( st.nextElement());
			
		}
		}
}
