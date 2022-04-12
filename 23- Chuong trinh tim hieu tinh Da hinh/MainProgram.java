/* Chuong trinh tim hieu tinh Da hinh (Polymorphism) trong Lap trinh Huong doi tuong */
/* Cùng 1 hàm nhưng trong mỗi class sẽ in ra kết quả khác nhau do sử dụng Override */

public class MainProgram {

    public static void main(String[] args) {
        
        CoinMarketCap coinmarketcap = new CoinMarketCap();      // khởi tạo đối tượng
        Binance binance = new Binance();
        Bitfinex bitfinex = new Bitfinex();

        System.out.println(coinmarketcap.getBTCprice());        // goi hàm để trả ve giá BTC khác nhau ở từng sàn
        System.out.println(binance.getBTCprice());
        System.out.println(bitfinex.getBTCprice());

    }
    
}
