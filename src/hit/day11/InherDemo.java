package hit.day11;
public class InherDemo {
	public static void main(String[] args) {
		Employee p=new Attender();
		Engineer eng=new Engineer();
		p.met(1);
		eng.met(1);
	}
}
class Employee{
	int met(int i) {
		System.out.println("employee method is called");
		return i;
	}	
}

class Engineer extends Employee{
	int met(int i) {
		System.out.println("Engineer method is called");
		super.met(2);
		return i;
	}
}
class Attender extends Employee{
	protected int met(int i) {
		System.out.println("attender method is called");
		super.met(1);
		return i;
	}
}
