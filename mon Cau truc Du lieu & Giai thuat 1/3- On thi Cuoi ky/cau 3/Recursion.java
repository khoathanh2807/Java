public class Recursion {

	public double A(int n) {

		if (n == 1)
			return 1;
		
		if (n > 1)
			return 2 * A(n - 1) + 0.5;

		return 0;

	}	
	
	public double B(int n) {

		if (n == 0)
			return (double)2/3;

		if (n > 0)
			return Math.sqrt(2) + B(n - 1);

		return 0;

	}
	
	public double C(int n) {

		if (n == 0)
			return (double)2/3;

		if (n == 1)
			return (double)3/4;

		if (n > 1)
			return 2 * Math.sqrt(3) * C(n - 2) + C(n - 1);

		return 0;

	}
	
	public double D(int m, int n) {

		if (m == 0)
			return 2 * n + 3;

		if (m > 0 && n == 0)
			return D(m - 1, 0);

		if (m > 0 && n > 0)
			return D(2 * m - 2, n - 2);
			
		return 0;

	}

}
