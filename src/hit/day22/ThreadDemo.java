package hit.day22;

public class ThreadDemo {
public static void main(String[] args)throws Exception {
	Thread t=Thread.currentThread();
	t.setName("this my main thread");
	t.setPriority(10);
	System.out.println("now thread will slepp for 5sec");
	System.out.println("start the class");
	for (int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(1000);
		}
	}

static void VaccinationCentre()throws Exception{
	System.out.println("met called");
	Thread.sleep(5000);
}
}
