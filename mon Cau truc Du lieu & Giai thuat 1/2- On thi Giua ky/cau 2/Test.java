public class Test {

	public static void main(String[] args){

		MyPoint p1 = new MyPoint(3.5, 7.5);
		MyPoint p2 = new MyPoint(7.5, 3.5);
		MyPoint p3 = new MyPoint(3.5, 7.5);

		System.out.println("\n Distance of p1 and p2: " + p1.getEuclideanDistance(p2));

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		
		System.out.println("\n Qty = " + MyPoint.getQuantity());

	}

}