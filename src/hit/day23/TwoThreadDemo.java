package hit.day23;

public class TwoThreadDemo {
public static void main(String[] args) {
	Thread t= Thread.currentThread();
	t.setName("kaala");
	ReservationCounter central=new ReservationCounter();
	Thread imran=new Thread(new JobToReserve(central, 1000),"imran");
	Thread taqi=new Thread(new JobToReserve(central,500),"taqi");
	imran.start();
	taqi.start();
	
}
}
class JobToReserve implements Runnable{
	ReservationCounter central; int amt;
	public JobToReserve(ReservationCounter central, int amt) {
		this.amt=amt;
		this.central=central;
	}
	@Override
	public void run() {
		synchronized (central) {
			central.bookTicket(amt);
			central.giveChange();	
		}	
	}
}
class ReservationCounter{
	ReservationCounter central; int amt;
	public void bookTicket( int amt) {
		this.amt=amt;
		Thread t= Thread.currentThread();
		t.getName();
		String name=t.getName();
		System.out.println(name+""+"camw to book the tickets");
		System.out.println("has bought the tickets"+amt);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {}
	}
	public void giveChange() {
		Thread t= Thread.currentThread();
		t.getName();
		String name=t.getName();
		System.out.println(name+""+"givrn change");
		System.out.println("he is given the "+(this.amt-100));
	}
}
 