package hit.day16;

public class ReflectionDemo3  {
	public static void main(String[] args) throws Exception {
//		Students s=(Students)Class.forName("hit.day16.JavaStudents").getConstructor(String.class).newInstance(null);
//		System.out.println(s);
		Students s=(Students)Class.forName("hit.day16.JavaStudents").getDeclaredConstructor().newInstance();
		System.out.println(s);
		 s=(Students)Class.forName("hit.day16.JavaStudents").getDeclaredConstructor(String.class).newInstance("Ramu");
		System.out.println(s);
	}
}
abstract class Students{
	
}
class JavaStudents extends Students{
	String s;
	JavaStudents(){
		
	}
	JavaStudents(String s){
		this.s=s;
		System.out.println("The dynamic way is : "+this.s);
	}
}
