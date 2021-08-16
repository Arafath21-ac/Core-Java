package hit.day16;

import java.lang.reflect.Field;

public class ReflectionDemo5 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Class c=emp.getClass();
		Field f=c.getField("name");
		Field f1=c.getField("age");
		f.set(emp,"ramu");
		f1.set(emp, 21);
		System.out.println("the value set was....:"+f.get(emp));
		System.out.println("the value set was....:"+f1.get(emp));
	}

}
class Employee{
	public String name;
	public int age;
	public int money;
}