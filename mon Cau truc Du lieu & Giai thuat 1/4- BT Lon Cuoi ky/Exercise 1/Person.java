/*
 * DO NOT CHANGE ANYTHING IN THIS CLASS
 * @author Thanh Dai Khoa [517H0008]
 */

public abstract class Person {
    
    protected String id;       // Ma so SV / Ma so GV
    protected String name;     // Ho ten
    protected char gender;     // Gioi tinh

    public Person() {

        this.id = "";
        this.name = "";
        this.gender = 'F';

    }
    
    public Person(String id, String name, char gender) {

        this.id = id;
        this.name = name;
        this.gender = gender;

    }

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public char getGender() {

        return gender;

    }

    public void setGender(char gender) {

        this.gender = gender;

    }
    
}
