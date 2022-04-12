/* Chuong trinh khai bao va su dung TreeSet */

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        
        System.out.println("\nTreeSet: ");
        System.out.println();

        // TreeSet String
        TreeSet<String> ts = new TreeSet<>();   // khai bao TreeSet dang String

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Coconut");
        ts.add("Orange");
        ts.add("Apple");
        ts.add("Banana");

        for (String s : ts) {   // in ra tung phan tu cua TreeSet

            System.out.println(s);
            
        }

        System.out.println();

        // TreeSet Integer
        TreeSet<Integer> ts2 = new TreeSet<>(); // khai bao TreeSet dang Integer

        ts2.add(100);
        ts2.add(1000);
        ts2.add(-10);
        ts2.add(0);
        ts2.add(100);
        ts2.add(1000);

        for (Integer i : ts2) {   // in ra tung phan tu cua TreeSet

            System.out.println(i);
            
        }

    }
    
}
