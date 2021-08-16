package hit.day18;

public class InterfaceDemo {
public static void main(String[] args)throws Exception {
	AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
	Doctor doctor=(Doctor)stanley;
	doctor.docure();
	Nurse nurse=(Nurse)stanley;
	nurse.doNursing();
	
	HomeoPathyMedicalCollege homeoDoctor=new HomeoPathyMedicalCollege();
	Doctor doctor2=(Doctor)homeoDoctor;
	doctor2.docure();
	Nurse nurse2=(Nurse)homeoDoctor;
	nurse2.doNursing();
	  }
}
interface Doctor{
	public void docure();
	 
	//int i=10;
	default public void met() {
		System.out.println("met called,,,,,");
	}
}
interface Surgeon extends Doctor{
	
}
interface Nurse{
	public void doNursing();
}
class AlopathyMedicalCollege implements Doctor,Nurse{
	@Override
	public void docure() {
    System.out.println("nursing method called....");		
	}
	@Override
	public void doNursing() {
		System.out.println("do cure method ....as per alopathy....");
	}
}
class HomeoPathyMedicalCollege implements Doctor{
	@Override
	public void docure() {
     System.out.println("do cure method called.....as per homeopathy...");		
	}
}