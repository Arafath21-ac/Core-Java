package hit.day27;

public class GenricsDemo1 {
	public static void main(String[] args) {
		
		Paint1 paint=new RedPaint1();
		
		Powder powder=new WhitePowder();
		
		GoodPaintBrushes gbp=new GoodPaintBrushes();
		
		
		gbp.obj=powder;
		gbp.execute();
		
		
		gbp.obj=paint;
		gbp.execute();
	}
}
abstract class Paint1{
	public abstract void color1();
}
class RedPaint1 extends Paint1{
	@Override
	public void color1() {
		System.out.println("red color...");
	}
}
class BluePaint1 extends Paint1{
	@Override
	public void color1() {
		System.out.println("blue color");
	}
}
abstract class Powder{
	public abstract void doMakeup();
}
class WhitePowder extends Powder{
	@Override
	public void doMakeup() {
		System.out.println("apply white...");
	}
}
class RosePowder extends Powder{
	@Override
	public void doMakeup() {
		System.out.println("apply rose....");
	}
}
class GoodPaintBrushes{
	Object obj;
	public void execute() {
		if(obj instanceof Paint1) {
			Paint1 paint=(Paint1)obj;
			paint.color1();
		}
		if (obj instanceof Powder) {
			Powder makeup=(Powder)obj;
			makeup.doMakeup();
		}
	}
}