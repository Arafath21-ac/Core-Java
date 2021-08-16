package hit.day17;

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Sheep implements Cloneable{
	public void sheep(){
		System.out.println("sheep object is created,,,,,");
	}
	 String name;
	 Sheep createClone() {
		try {
			return (Sheep)super.clone();
		}catch(CloneNotSupportedException cne) {
			cne.printStackTrace();
		return null;
		}
	}
}