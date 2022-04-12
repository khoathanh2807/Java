public class Test {

    public static void main(String[] args) {
        
        MyInvoice i1 = new MyInvoice("IN001", "Invoice No. 001", 34, 8000);
		MyInvoice i2 = new MyInvoice("IN004", "Invoice No. 004", 11, 10000);
		MyInvoice i3 = new MyInvoice("IN001", "Invoice No. 001", 34, 8000);


        System.out.println("\nThe total amount of invoice 001: " + i1.getTotal());
        System.out.println("The total amount of invoice 002: " + i2.getTotal());


		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i2.equals(i3));
		
		System.out.println("\n Qty = " + MyInvoice.getQuantity());

    }
    
}
