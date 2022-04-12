/* Chuong trinh khai bao va su dung HashSet */

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        
        System.out.println("\nHashSet: ");
        System.out.println();

        // HashSet Integer
        HashSet<Integer> hs = new HashSet<>();  // khai bao HashSet dang Integer

        hs.add(10);
        hs.add(6);
        hs.add(2);
        hs.add(8);
        hs.add(4);  
        hs.add(6); 
        hs.add(2);
        hs.add(4);
        

        for (Integer i : hs) {  // in ra tung phan tu cua HashSet

            System.out.println(i);
            
        }

        System.out.println();

        // HashSet String
        HashSet<String> hs2 = new HashSet<>();  // khai bao HashSet dang String

        hs2.add("An");
        hs2.add("Tuan");
        hs2.add("Binh");
        hs2.add("Khoa");

        for (String s : hs2) {  // in ra tung phan tu cua HashSet

            System.out.println(s);
            
        }        

    }
    
}
