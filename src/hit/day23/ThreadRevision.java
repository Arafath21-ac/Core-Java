package hit.day23;

public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new Job());
		t.start();
	}
public static void main(String[] args) {
	new ThreadRevision();
	Thread t= Thread.currentThread();
//	System.out.println(t);  
	for(int i=0;i<5;i++){
//		System.out.println(i);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
  
		System.out.println(i);
		}
	
}
}
class Job implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread is executed");
	}
}
