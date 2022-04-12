/* Chuong trinh tim hieu tinh Da hinh (Polymorphism) trong Lap trinh Huong doi tuong */
/* Cùng 1 hàm getBTCprice nhưng trong mỗi class sẽ in ra kết quả khác nhau do sử dụng Override */

public class Bitfinex extends CoinMarketCap {

    @Override
    public String getBTCprice() {   // hàm getBTCprice được gi đè (Override) ở lớp con

        // TODO Auto-generated method stub
        return "$ 8,185";

    }
    
}
