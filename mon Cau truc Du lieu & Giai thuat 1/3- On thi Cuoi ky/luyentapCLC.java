import java.util.*;

int add(int item) {
	// tạo nút chứa data mới 
	Node newnode = new Node(item,null);
	// trường hợp đặc biệt
	if(head==null) {
		head = newnode;
		size++;
		return size;
	}
	if(head.getData()>item) {
		newnode.setNext(head);
		head = newnode;
		size++;
		return size;
	}
	// trường hợp bình thường:
	Node p = head;
	Node before_p = head; 
	while(p!=null) {
		if(p.getData()<item) { 
			before_p = p;
			p = p.getNext();
		}
		else if(p.getData()==item) 
			return size;
		else
			break;
	}
	before_p.setNext(newnode);
	newnode.setNext(p);
	size++;
	return size;
}

boolean remove(int item) {
	// trường hợp đặc biệt 
	if(head == null)
		return false;
	Node p = head;
	Node q = null;
	if(p.getData()==item) {
		head = head.getNext();
		size--;
		return true;
	}
	// trường hợp bình thường 
	while(p!=null) {
		if(p.getData()<item) {
			q = p;
			p = p.getNext();
		}
	}
	// p.data == item hoac p = null
	if(p==null)
		return false;
	else {
		q.setNext(p.getNext());
		size--;
		return true;
	}
		
	
}

====================================
double computeA(int n) {
	
	if(n==1)
		return 1;
	else 
		return 2*computeA(n-1) + 1/2;
}

double computeB(int n) {
	
	if(n==0)
		return 2.0/3;
	else 
		return computeB(n-1) + Math.sqrt(2);
	//// Math.pow(2,1/2);
}

double computeC(int n) {
	
	if(n==0)
		return 2.0/3;
	else if(n==1)
		return 3.0/4;
	else 
		return 2*Math.sqrt(3)*computeC(n-2) + computeC(n-1);
	//// Math.pow(2,1/2);
}

double computeD(int m, int n) {
	
	if(m==0)
		return 2*n+3;
	else if(n==0 && m>0)
		return computeD(4*m+1,2);
	else
		return computeD(m-2,computeD(2*m,n-3));	
}

======================================================
abstract class Animal {
	protected int leg;
	public Animal () {
		leg = 0;
	}
	public Animal(int leg) {
		this.leg = leg;
	}
	abstract public void move();
}

public class Turtle extends Animal {
	private boolean seaTurtle;
	
	public Turtle() {
		super();
		seaTurtle = false;
	}
	public Turtle(int leg, boolean seaTurtle) {
		super(leg);
		this.seaTurtle = seaTurtle;
	}
	public Turtle(Turtle obj) {
		super(obj.leg);
		this.seaTurtle = obj.seaTurtle;
	}
	
	public void move() {
		System.out.println("Turtle is running");
	}
	public String toString() {
		return "seaTurtle="+seaTurtle + "\nleg=" +leg; 
	} 
	
} 


=============================================

public interface Animal {
	public void move();
}

public class Turtle implements Animal {
	private boolean seaTurtle;
	
	public Turtle() {
		seaTurtle = false;
	}
	public Turtle(boolean seaTurtle) {
		this.seaTurtle = seaTurtle;
	}
	public Turtle(Turtle obj) {
		this.seaTurtle = obj.seaTurtle;
	}
	//----------------------------
	public void move() {
		System.out.println("Turtle is running");
	}
	public String toString() {
		if(seaTurtle)
			return "seaTurtle is true";
		else
			return "seaTurtle is false";
	}
	
}
public class Rabbit implements Animal{
	private double speed;
	public Rabbit() {
		speed = 0;
	}
	public Rabbit(double speed) {
		this.speed = speed;
	}
	public Rabbit(Rabbit obj) {
		this.speed = obj.speed;
	}
	//--------------------------------
	public void move() {
		System.out.println("Rabbit is running");
	}
	public String toString() {
		return "speed = " + speed;		
	}
	
}