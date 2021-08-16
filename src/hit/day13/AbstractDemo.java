package hit.day13;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new child();
	}

}
abstract class GrandParent{
	abstract public void met();
}
abstract class Parent extends GrandParent{
	final int i =18;
	abstract void method();
	public Parent() {
System.out.println("parent constructor is called,,,,,,");		// TODO Auto-generated constructor stub
	}
	
}
class child extends Parent{
	@Override
	public void met() {
		System.out.println("Grand Parents constructor called,,,,");// TODO Auto-generated method stub
		
	}
	@Override
	void method() {
		System.out.println("Parent constructor is called,,,,");// TODO Auto-generated method stub
		
	}
	public child() {//while creating obj for child parent constructor is called
		System.out.println("child is called");
		}
}
