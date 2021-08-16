package lab.week2;
class Stest {
	String name, city;
	int age;
	static int m;
	public Stest() {
		// TODO Auto-generated constructor stub
	}
	void printData() {
		System.out.println("Student name = "+name);
		System.out.println("Student city = "+city);
		System.out.println("Student age = "+age);
		}
	}
 public class Student {
	public static void main(String args[]) {
		Stest s1=new Stest();
		Stest s2=new Stest();
		s1.name="Nikith";
		s1.city="Rajahmundry";
		s1.age=22;
		s2.name="Meghana";
		s2.city="Mumbai";
		s2.age=21;
		s2.printData();
		s1.printData();
		
		
		}
	}