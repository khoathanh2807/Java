/* Chương trình sử dụng vòng lặp while và do while */

public class WhileCommand {
    
    public static void main(String[] args) {
       
        int n = 0;

        while (n < 10) {    //vòng lặp while này chạy 10 lần từ 0 đến 9

            n++;

        }

        System.out.println("n = " + n);

        do {

            n = n + 2;  // n += 2;

        } while (n < 10);

        System.out.println("n = " + n);

    }

}
