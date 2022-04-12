/* Chuong trinh khai bao va su dung HashMap */

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<>();  // khai bao HashMap

        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");

        for (int key : hm.keySet()) {   // in ra keySet va value cua HashMap

            System.out.println(key + " " + hm.get(key));

        }

        System.out.println();

        Iterator<Integer> iterator = hm.keySet().iterator();

        while (iterator.hasNext()) {    // in ra keySet cua HashMap

            System.out.println(iterator.next());

        }

        System.out.println();
        
        for (String value : hm.values()) {  // in ra value cua HashMap

            System.out.println(value);

        }

    }
    
}
