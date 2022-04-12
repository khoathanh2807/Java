/* Chương trình sử dụng chuỗi kí tự String và các hàm hỗ trợ xử lý String */

public class StringExample {

    public static void main(String[] args) {
        
        String str = " Hello World ";
        System.out.println("\nstr = " + str);

        // hàm length: xác định độ dài chuỗi kí tự
        System.out.println("\nstr.length(): " + str.length());

        // hàm concat: nối 2 chuỗi kí tự
        String str2 = "Lap trinh Java ";
        System.out.println("str2.concat(str): " + str2.concat(str));

        // hàm equals: so sánh 2 chuỗi kí tự
        String str3 = new String ("Hello World");
        System.out.println("str.equals(str3): " + str.equals(str3));

        // hàm charAt: trả ve 1 kí tự ở vị trí nhất định trong chuỗi
        System.out.println("str.charAt(7): " + str.charAt(7));

        // hàm indexOf: trả ve vị trí của 1 chuỗi trong chuỗi khác
        System.out.println("str.indexOf(\"World\"): " + str.indexOf("World"));

        // hàm contains
        String str4 = "World";
        System.out.println("str.contains(str4): " + str.contains(str4));

        // hàm replace: thay thế chuỗi con bằng 1 chuỗi khác
        System.out.println("str.replace(\"Hello\", \"Xin chao\"): " + str.replace("Hello", "Xin chao"));
        
        // hàm trim: loại bo khoảng trắng ở đầu và cuối chuỗi
        System.out.println("str.trim(): " + str.trim());

        // hàm substring: tạo 1 chuỗi con từ chuỗi cha theo vị trí nhất định
        System.out.println("str.substring(): " + str.substring(1, 8));

        // hàm split: cắt chuỗi theo kí tự
        // hoc mảng sẽ hoc hàm này

        // hàm toLowerCase: chuyển hết kí tự trong chuỗi ve chữ thuong
        System.out.println("str.toLowerCase(): " + str.toLowerCase());

        // hàm toUpperCase: chuyển hết kí tự trong chuỗi ve chữ in
        System.out.println("str.toUpperCase(): " + str.toUpperCase());

        // hàm compareTo: trả ve giá trị < 0 nếu str < str2, trả ve giá trị > 0 nếu str > str2
        System.out.println("str.compareTo(str2): " + str.compareTo("str2"));

        // hàm endWith
        System.out.println("str.endsWith(\" \"): " + str.endsWith(" "));

    }
  
}