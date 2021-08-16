package hit.day11;
public class InherDemo1 {
	public static void main(String[] args) {
		Emp h1 = new Emp();
		Eng e1 = new Eng();
		e1.met(1);
		h1.met(1);
	}
}
class Human{
	public void blabla() {
		System.out.println("bla bla method called....");
	}
}
class Emp extends Human{	
	public int met(int i) {
		System.out.println("met method of employee called...");
		return i;
	}
}
class Eng extends Emp{
	public int met(int i) {
		System.out.println("engineer met method called....");
		super.blabla();
		return i;
	}
}
class Att extends Eng{
	
}