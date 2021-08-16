package hit.day18;

public class InterfacwDemo3 {

	public static void main(String[] args) {
	Student student=()->{
		System.out.println("learning,,,,");
	
	};
	student.learn();

}
interface Student{
	void learn();
//	void doubts();
}
interface Driver{
	void drive(String s);
}
interface Pilot{
	void fly(String name,int speed);
}
	
}
