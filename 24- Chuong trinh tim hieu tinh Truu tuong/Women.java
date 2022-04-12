/* Chuong trinh tim hieu tinh Truu tuong (Abstraction)) trong Lap trinh Huong doi tuong */
/* Tinh Truu tuong bao gom tinh Ke thua (extends) va Da hinh (Override) */

public class Women extends Human implements Sex {

    @Override
    String eatStyle() {     // các class con khi kế thừa Abstract class phải override lại các hàm abstract

        // TODO Auto-generated method stub
        return "chopstick";

    }

    @Override
    public boolean isWomen() {

        // TODO Auto-generated method stub
        return true;

    }
    
}
