
public abstract class Animal {

	protected int legs;
	
	public Animal() {	// constructor khong tham so

	}
	
	public Animal(int legs) {	// constructor co tham so

		this.legs = legs;

	}
	
	public abstract void move();

}
