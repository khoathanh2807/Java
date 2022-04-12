import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        MyFraction f1 = new MyFraction(3, 7);
		MyFraction f2 = new MyFraction(9, 5);
		MyFraction f3 = new MyFraction(3, 7);

        MyFraction sum = f1.tinhTong(f2);
        
		System.out.printf("\n Sum of f1(3, 7) and f2(9, 5): sum(%d, %d). \n", sum.getNum(), sum.getDenom());
        //System.out.println("\n Sum of f1(3, 7) and f2(9, 5): sum(" + sum.getNum() + ", " + sum.getDenom() + ").");

        MyFraction sub = f1.tinhHieu(f2);

		System.out.printf("\n Subtraction of f1(3, 7) and f2(9, 5): sub(%d, %d). \n", sub.getNum(), sub.getDenom());
        //System.out.println("\n Subtraction of f1(3, 7) and f2(9, 5): sub(" + sub.getNum() + ", " + sub.getDenom() + ").");

        MyFraction mult = f1.tinhTich(f2);
        
		System.out.printf("\n Multiplication of f1(3, 7) and f2(9, 5): mult(%d, %d). \n", mult.getNum(), mult.getDenom());
        //System.out.println("\n Multiplication of f1(3, 7) and f2(9, 5): mult(" + mult.getNum() + ", " + mult.getDenom() + ").");

        MyFraction div = f1.tinhThuong(f2);
        
		System.out.printf("\n Division of f1(3, 7) and f2(9, 5): div(%d, %d). \n\n", div.getNum(), div.getDenom());
        //System.out.println("\n Division of f1(3, 7) and f2(9, 5): div(" + div.getNum() + ", " + div.getDenom() + ").");

		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
		System.out.println(f2.equals(f3));
		
		System.out.println("\n Qty = " + MyFraction.getQuantity());

    }
    
}