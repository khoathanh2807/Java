/* Chương trình tìm hiểu các loại toán tử số học, toán tử so sánh và toán tử logic */

public class Operator {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 7;
        System.out.println("\na = " + a + ", b = " + b);

// Các toán tử số hoc:

        System.out.println("\nCac toan tu so hoc: ");

        // phép cộng
        int tong = a + b;

        System.out.println("tong = a + b = " + tong);
        
        // phép trừ
        int hieu = b - a;

        System.out.println("hieu = b - a = " + hieu);

        // phép nhân
        int tich = a * b;

        System.out.println("tich = a * b = " + tich);

        // phép chia
        float thuong = (float)b / a;

        System.out.println("thuong = b / a = " + thuong);

        // phép chia lấy dư
        int chiaLayDu = b % a;

        System.out.println("chiaLayDu = b % a = " + chiaLayDu);

// Các toán tử so sánh:

        System.out.println("\nCac toan tu so sanh: ");

        // phép so sánh ==
        boolean check = a == b;

        System.out.println("a == b: " + check);

        // phép so sánh !=
        check = a != b;

        System.out.println("a != b: " + check);

        // phép so sánh <
        check = a < b;

        System.out.println("a < b: " + check);

        // phép so sánh >
        check = a > b;

        System.out.println("a > b: " + check);

        // phép so sánh <=
        check = a <= b;

        System.out.println("a <= b: " + check);

        // phép so sánh >=
        check = a >= b;

        System.out.println("a >= b: " + check);

// Các toán tử logic:

        System.out.println("\nCac toan tu logic: ");

        // toán tử &&
        check = (a > b && a != b);  // false && true => false

        System.out.println("&&: check = " + check);

        // toán tử ||
        check = (a > b || a != b);  // false || true => true
        
        System.out.println("||: check = " + check);

        // toán tử !
        check = !(b > a);  // ! true => false
        
        System.out.println("!: check = " + check);

// Các toán tử 1 ngôi:

        System.out.println("\nCac toan tu 1 ngoi: ");

        // toán tử số âm -
        int c = -10;

        System.out.println("c < 0: " + (c < 0));

        // toán tử ++
        int d = 1;
        //d++;    // d = d + 1
        //++d;
        System.out.println("\nd = " + d);

        int h = d++ + c;
        System.out.println("h = d++ + (-10) = " + h);
        System.out.println("d = " + d);

        d = 1;
        int k = ++d + c;
        System.out.println("k = ++d + (-10) = " + k);
        System.out.println("d = " + d);

        // toán tử --
        d = 1;
        System.out.println("\nd = " + d);

        h = d-- + c;
        System.out.println("h = d-- + (-10) = " + h);
        System.out.println("d = " + d);

        d = 1;
        k = --d + c;
        System.out.println("k = --d + (-10) = " + k);
        System.out.println("d = " + d);

    }

}
