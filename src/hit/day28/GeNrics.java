package hit.day28;

public class GeNrics {
	public static void main(String[] args) {
		Child3<Ball>child3=new Child3<>();
		child3.setObj(new Ball());
		child3.getObj().play();
		Child3<Sweet>child33=new Child3<>();
		child33.setObj(new Sweet());
		child33.getObj().eat();
	}
}
class Ball{
	public void play() {
		System.out.println("chold playing eith the ball");
	}
}
class Sweet{
	public void eat() {
		System.out.println("eating with sweet");
	}
}
//apraoach 1
class Child{
Ball ball;
public void action() {
	ball.play();
}
}
//2.Appraoch 2
class child2{
	Object obj;
	public void action() {
		if (obj instanceof Ball) {
			Ball ball =(Ball)obj;
			ball.play();
		}else if (obj instanceof Sweet) {
			Sweet sweet=(Sweet)obj;
			sweet.eat();
		}
	}
}
//3.appraoach 3
class Child3<T>{
	T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}