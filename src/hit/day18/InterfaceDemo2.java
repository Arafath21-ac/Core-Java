package hit.day18;

public class InterfaceDemo2 {
	public static void mySomeMethod() {
		System.out.println("my somme ,ethod is called,,,,,");
	}
	public void myAnotherMethod() {
		System.out.println("my another method is called,,,,");
	}

	public static void main(String[] args)throws Exception {
		teacher teacher=InterfaceDemo2::mySomeMethod;
		teacher.doTeach();

  teacher.doTeach();
		

	}
	interface teacher{
		public void doTeach();
//		public void doTalk();
	} 

}
