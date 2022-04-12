/* Chương trình tìm hiểu các kiểu dữ liệu trong Java */

public class DataType {

    public static void main(String[] args) {
        
        // kiểu dữ liệu boolean
        boolean bo = true;
        System.out.println("boolean: bo = " + bo);

        // kiểu dữ liệu byte
        byte b = 127;
        System.out.println("byte: b = " + b);

        // kiểu dữ liệu short
        short s = 32767;
        System.out.println("short: s = " + s);

        // kiểu dữ liệu char
        char c = 'K';
        char c2 = 65;
        System.out.println("char: c = " + c + ", c2 = " + c2);

        // kiểu dữ liệu integer
        int i = 2000000000;
        System.out.println("interger: i = " + i);

        // kiểu dữ liệu long
        int l = 2000000000;
        System.out.println("long: l = " + l);

        // kiểu dữ liệu float
        float f = 500000.5f;
        System.out.println("float: f = " + f);

        // kiểu dữ liệu float
        double d = 800000.8;
        System.out.println("double: d = " + d);

        // Wrapper Class: kiểu dữ liệu nguyên thủy sẽ được đóng gói vào trong các đối tượng
        int x = 10;
        Integer y = x;  // đây là cơ chế autoboxing, đóng gói x vào Wrapper Class Integer

        //Integer p = Integer.valueOf(20);  //cách khai báo này đã bị loại bo ở phiên bản Java 9
        Integer p = Integer.valueOf(20);    // khởi tạo và gán giá trị cho Wrapper Class Integer
        int q = p;      // đây là cơ chế unboxing, đưa từ kiểu dữ liệu đối tượng ve kieu dữ liệu nguyên thủy
        System.out.println("Wrapper Class: y = " + y + ", int: q = " + q);

        // Ép kiểu dữ kiệu
        int m = 100;
        float n = m;    //Widening: từ kiểu dl có kích thức nho sang kiểu dl có kích thước lớn
        System.out.println("Ep kieu: int m = " + m + ", float n = " + n);

        float a = 100.51f;
        int h = (int)a; //Narrowing: từ kiểu dl có kích thức lớn sang kiểu dl có kích thước nho
        System.out.println("Ep kieu: float a = " + a + ", int h = " + h);

    }
    
}
