package hit.day16;

public class ReflectionDemo2 {

	public static void main(String[] args)throws Exception {
		//static dynamic
		Politician p = new abcPolitician("ramu","father ramu");
		System.out.println(p);
		//dynamic new one
        p=(Politician)Class.forName("hit.day16.abcPolitician").getConstructor(String.class,
			 String.class).newInstance("new dynamic ram","new dynamic father ram");
		System.out.println("new dynamic ramu : "+p);
		//dynamic old one
		p=(Politician)Class.forName("hit.day16.abcPolitician").getConstructor(new Class[] {String.class,String.class}).newInstance("Dynamicram","Dynamicfather ram");
		System.out.println("dynamic ramu...:"+p);
	
	
	}

}
abstract class Politician{
	
}
class abcPolitician extends Politician{
	
	String name; String fname;
	public abcPolitician(String name,String fname) {
		this.name=name;this.fname=fname;
		}
	@Override
	public String toString() {
		return"the object is:"+this.name+","+this.fname;
	}
}
class xyzPoliticain extends Politician{
	
}
