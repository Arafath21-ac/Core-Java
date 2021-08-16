package hit.day20;

public interface Command {
	public void execute();
}
class DeathCertificate implements Command{
	MedicalDepartment hospital;PoliceDepartment police;Corporation corporation;
	public DeathCertificate(MedicalDepartment md,PoliceDepartment pd,Corporation c) {
		this.hospital=md;
		this.police=pd;
		this.corporation=c;
	}
	@Override
	public void execute() {
		System.out.println("set of instruction to carry out the command death certificate");
		System.out.println("started to work to get death certificate");
		police.enquiry();
		hospital.doPostmortem();
		hospital.deathDeclared();
		corporation.deathCertificate();
		System.out.println("death certi is ready");
		System.out.println("take the death certificate");
	}
}
class HotelOpeningCertificate implements Command{
	HealthDepartment health;PoliceDepartment police;Corporation corporation;
	public HotelOpeningCertificate(HealthDepartment md,PoliceDepartment pd,Corporation c) {
		this.health=md;
		this.police=pd;
		this.corporation=c;
		}
	@Override
	public void execute() {
		System.out.println("set of instruction to carry out the command open hotel certificate....");
		System.out.println("started the work....to get open hotel certi..");
		//here i will write the logic....
		health.healthCertificate();
		police.cleareance();
		corporation.hotelcertificate();
		System.out.println("Take the open hotel  certificate..");

		
	}
}

