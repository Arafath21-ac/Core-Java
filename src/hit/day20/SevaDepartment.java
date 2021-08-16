package hit.day20;

public class SevaDepartment {
	Command command[]=new Command[5];
	public SevaDepartment() {
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}
	}
	void executeCommand(int slot) {
		command[slot].execute();
	}
	void setCommand(Command c,int slot) {
		this.command[slot]=c;
	}
	

}
class DummyCommand implements Command{
	@Override
	public void execute() {
		System.out.println("im dummy yet to operational");
	}
}
class MedicalDepartment{
	void doPostmortem() {
		System.out.println("postmortem is done");
	}
	void deathDeclared() {
		System.out.println("death declaration done");
	}
}
class PoliceDepartment{
	void enquiry() {
		System.out.println("enquiry done");
	}
	void cleareance() {
		System.out.println("cleareance is given");
	}
}
class Corporation{
	void deathCertificate() {
		System.out.println("death certificate is given");
	}
	void hotelcertificate() {
		System.out.println("hotel certuficate is given");
	}
}
class HealthDepartment{
	void healthCertificate() {
		System.out.println("health certuficate is given");
	}
}