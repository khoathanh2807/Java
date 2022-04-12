
public class Turtle extends Animal{

	private boolean seaTurtle;
	
	public Turtle() {	// constructor khong tham so

		super();

	}

	public Turtle(boolean seaTurtle, int legs) {		// constructor co tham so

		super(legs);
		this.seaTurtle = seaTurtle;

	}
	
	public Turtle(Turtle tur) {			// constructor co tham so, khoi tao sao chep

		super(tur.legs);
		this.seaTurtle = tur.seaTurtle;

	}

	@Override
	public void move() {

		System.out.println("Turtle is running");

	}

	@Override
	public String toString() {

		return "Turtle [ seaTurtle = " + seaTurtle + ", legs = " + legs + " ]";

	}

}
