package hit.day22;
import java.util.Date;
public class ThreadDemo2 {
//	Thread t = new Thread();
	public static void main(String[] args) throws Exception{
		Vaccination vc=new Vaccination();
		Thread t=Thread.currentThread();
		t.setName("shoiab");
		System.out.println(new Date());
		System.out.println("Before comming to class....");
		Thread kala=new Thread(new JobToKala(vc),"kala");
		kala.start();
		//vc.getToken();
		System.out.println("Take class.....for 7-9 Golden Batch...."+new Date());
	}	
	

}
class JobToKala implements Runnable{
	Vaccination vc;
	public JobToKala(Vaccination vc) {
		this.vc=vc;
		
	}
	@Override
	public void run() {
		System.out.println("The job given to kala is executed from this method...");
		try{
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
class Vaccination{
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"...standing in queue for token....");
		Thread.sleep(10000);
		System.out.println("token received..."+new Date());

}
}