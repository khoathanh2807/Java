/* Chuong trinh tim hieu tinh Dong goi (encapsulation) va Ke thua (inheritance) trong Lap trinh Huong doi tuong */
/* Chuong trinh khoi tao, gan thuoc tinh cho doi tuong Children va in ra thong tin cua doi tuong nay */

public class MainProgram {

    public static void main(String[] args) {
        
        Children child = new Children("Nguyen Xuan Phuc", 25);      // khoi tao doi tuong Children bang Constructor co truyen vao tham so

        child.showInfor();

        Children child2 = new Children();   // khoi tao doi tuong Children bang Constructor khong tham so

        child2.setName("Tran Kim Anh Tuan");
        child2.setAge(35);

        System.out.println("Name2: " + child2.getName() + " - Age2: " + child2.getAge());

    }
    
}
