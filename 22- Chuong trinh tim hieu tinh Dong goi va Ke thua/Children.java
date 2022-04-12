/* Chuong trinh tim hieu tinh Dong goi (encapsulation) va Ke thua (inheritance) trong Lap trinh Huong doi tuong */
/* Chuong trinh tao class Children ke thua cac thuoc tinh va ham tu classs Parent */

public class Children extends Parent {

    public Children () {

    }

    public Children (String name, int age) {

        super(name, age);

    }

    public void showInfor() {   // hàm in ra thông tin
        
        System.out.println("Name: " + this.getName() + " - Age: " + this.getAge());

    }
    
}
