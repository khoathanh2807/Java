/* Chuong trinh khai bao va su dung TreeMap */

import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapExample {

    public static void main(String[] args) {
        
        TreeMap<String, Integer> tm = new TreeMap<>();  // khai bao TreeMap

        tm.put("Ten", 10);
        tm.put("Six", 6);
        tm.put("Nine", 9);

        for (String key : tm.keySet()) {  // in ra keySet va value cua TreeMap

            System.out.println(key + " " + tm.get(key));

        }

        System.out.println();

        Iterator<String> iterator = tm.keySet().iterator();

        while (iterator.hasNext()) {    // in ra keySet cua TreeMap

            System.out.println(iterator.next());

        }

        System.out.println();
        
        for (Integer value : tm.values()) {  // in ra value cua TreeMap

            System.out.println(value);

        }

    }
    
}
