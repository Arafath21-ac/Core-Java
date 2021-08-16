package hit.day10;
public class InherDemos {
	public static void main(String[] args) {
		Employee1 p=new Engineer1();
		Engineer1 eng=new Engineer1();
		
		p.met(2);
		eng.met(2);
	}
}
class Human1{
	public void blabla() {
		System.out.println("bla bla method called....");
	}
}
class Employee1 extends Human1{	
	public int met(int i) {
		System.out.println("met method of employee called...");
		return i;
	}
}

class Engineer1 extends Employee1{
	public int met(int i) {
		System.out.println("engineer met method called....");
		super.met(4);
		super.blabla();
		return i;
	}
}
class Attender1 extends Employee1{
	
}
