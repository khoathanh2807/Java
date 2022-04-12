/* Chuong trinh tim hieu tinh Dong goi (encapsulation) va Ke thua (inheritance) trong Lap trinh Huong doi tuong */
/* Chuong trinh tao class Parent gom cac thuoc tinh sname, age va cac phuong thuc get, set */

public class Parent {
    
    private String name;
    private int age;

    public Parent () {  // construtor

    }

    public Parent (String name, int age) {  // construtor

        super();

        this.name = name;
        this.age = age;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public int getAge() {

        return age;

    }

}
