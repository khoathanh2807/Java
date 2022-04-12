/* Chuong trinh tim hieu tinh Truu tuong (Abstraction)) trong Lap trinh Huong doi tuong */
/* Tinh Truu tuong bao gom tinh Ke thua (extends) va Da hinh (Override) */

public class MainProgram {

    public static void main(String[] args) {
     
        Women women = new Women();      // khởi tạo đối tượng
        Men men = new Men();

        System.out.println("Men: estStyle: " + men.eatStyle() + " - isWomen: " + men.isWomen());
        System.out.println("Women: estStyle: " + women.eatStyle() + " - isWomen: " + women.isWomen());

    }
    
}