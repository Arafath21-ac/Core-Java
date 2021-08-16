 package hit.day22;

public class ThreadDemo3 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	t.setName("muhaimeen");
	System.out.println(t);
	System.out.println("reservation counter started working"+t.getName());
	ReservationCounter central= new ReservationCounter();
	Thread imran=new Thread (new BookingJob(central,1000),"imran");
	Thread taqi=new Thread (new BookingJob(central,500),"taqi");
	imran.start();
	taqi.start();

}
}
class BookingJob implements Runnable{
	ReservationCounter central;int amnt;
	 public BookingJob(ReservationCounter central,int amnt) {
		this.central=central;this.amnt=amnt;
		}
	@Override
	public void run() {
		central.bookticket(amnt);
		central.giveChange();
		
	}
}
class ReservationCounter{
	int amnt;
	public void bookticket(int amnt) {
		Thread t=Thread.currentThread();
		this.amnt=amnt;
		String name=t.getName();
		System.out.println(name+"has come to book the ticket");
		System.out.println(name+"brought"+amnt);
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		System.out.println(name+"change is given");
		System.out.println(name+"takes"+(amnt-100));
	}
}
