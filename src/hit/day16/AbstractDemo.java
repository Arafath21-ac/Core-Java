package hit.day16;

abstract class Item{
	public abstract int cost();
	
} 
abstract class Cream extends Item{
	
}
abstract class Ingredients extends Item{
	
}
class Vanilla extends Cream{
	Item item;
	Vanilla(){
		
	}
	Vanilla(Item item){
		this.item=item;
	}

	@Override
	public int cost() {
		if(item==null) {
			return 10;
		}else {
			return 10+item.cost();
		}
	}
	
}
class ButterScotch extends Cream{
	Item item;
	ButterScotch(){
		
	}
	ButterScotch(Item item) {
		this.item=item;
	}

	@Override
	public int cost() {
		if(item==null) {
		return 15;
		}else {
			return 15+item.cost();
		}
		
	}
	
}
class Nuts extends Ingredients{
	Item item;
	Nuts(){
		
	}
	Nuts(Item item){
		this.item=item;
	}

	@Override
	public int cost() {
		if(item==null) {
			return 5;
		}else {
			return 5+item.cost();
		}
	}
	
}
class DryFruits extends Ingredients{
	Item item;
	DryFruits(){
		
	}
	DryFruits(Item item){
		this.item=item;
	}

	@Override
	public int cost() {
		if(item==null) {
		return 10;
	}else {
		return 10+item.cost();
	}
	
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Item icecream = new Vanilla(new ButterScotch(new Nuts(new DryFruits(new Vanilla()))));
		System.out.println("vanilla...+butter scotch...+Nuts....+DryFruits....+vanilla...:  "+icecream.cost());
	}

}
