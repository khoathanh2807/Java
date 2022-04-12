
public class Rabbit extends Animal {
	
	private double speed;

	public Rabbit() {	// constructor khong tham so

		super();

	}

	public Rabbit(Rabbit ra) {		// constructor co tham so

		super(ra.legs);
		this.speed = ra.speed;

	}

	public Rabbit(double speed, int legs) {		// constructor co tham so, khoi tao sao chep

		super(legs);
		this.speed = speed;

	}

	@Override
	public void move() {

		System.out.println("Rabbit is running");

	}

	@Override
	public String toString() {

		return "Rabbit [ speed = " + speed + ", legs = " + legs + " ]";

	}

}
