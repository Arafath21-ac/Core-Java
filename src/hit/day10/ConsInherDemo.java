package hit.day10;
public class ConsInherDemo {
	public static void main(String[] args) {
		Shoe shoe=new LeatherShoe(100);
	}
}
class Shoe{
	int i;
	public Shoe() {
		System.out.println("cons of shoe called....");
	}
	public Shoe(int i) {
		System.out.println("parametric constructor of shoe called....");
	}
	public void met() {
		System.out.println("parent shoe class method called...");
	}
}
class LeatherShoe extends Shoe{
	
	public LeatherShoe(int i) {
		super(343);
		super.i=100;
		super.met();
		System.out.println("cons of leather shoe called....");
	}
}