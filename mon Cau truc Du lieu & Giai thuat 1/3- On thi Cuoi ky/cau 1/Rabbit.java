
public class Rabbit implements Animal {

	private double speed;

	public Rabbit() {	// constructor khong tham so

	}

	public Rabbit(double speed) {	// constructor co tham so

		this.speed = speed;

	}
	
	public Rabbit(Rabbit ra) {		// constructor co tham so, khoi tao sao chep

		this.speed = ra.speed;

	}

	@Override
	public void move() {	// Override ham move cua class Animal

		System.out.println("Rabbit is running");

	}

	@Override
	public String toString() {

		return "Rabbit [ speed = " + speed + " ]";

	}

}