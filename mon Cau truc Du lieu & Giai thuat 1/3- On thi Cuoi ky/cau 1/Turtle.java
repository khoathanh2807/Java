
public class Turtle implements Animal{

	private boolean seaTurtle;
	
	public Turtle() {		// constructor khong tham so

	}

	public Turtle(boolean seaTurtle) {		// constructor co tham so

		this.seaTurtle = seaTurtle;

	}
	
	public Turtle(Turtle t) {		// constructor co tham so, khoi tao sao chep

		this.seaTurtle = t.seaTurtle;

	}

	@Override
	public void move() {	// Override ham move cua class Animal

		System.out.println("Turtle is running");

	}

	@Override
	public String toString() {

		return "Turtle [ seaTurtle = " + seaTurtle + " ]";

	}

}