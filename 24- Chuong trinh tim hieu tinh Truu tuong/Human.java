/* Chuong trinh tim hieu tinh Truu tuong (Abstraction)) trong Lap trinh Huong doi tuong */

public abstract class Human {

    abstract String eatStyle();     // khi dùng từ khóa abstract để khai báo hàm, thì các class con kế thừa class Human phải override lại hàm eatStyle này
                                    // abstract method không có định nghĩa nào bên trong, định nghĩa cụ thể sẽ nằm ở các hàm con kế thừa abstract class này
}
