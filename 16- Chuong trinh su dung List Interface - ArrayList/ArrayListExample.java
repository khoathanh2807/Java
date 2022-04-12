/* Chuong trinh khai bao va su dung ArrayList */
/* Chương trình nhập vào ArrayList và loại bo các phần tử trùng nhau */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();   // khai báo ArrayList

        Scanner myScan = new Scanner(System.in);

        System.out.print("\nNhap so phan tu cua ArrayList: ");
        int n = myScan.nextInt();
        
        for (int i = 0; i < n; i++) {   // Nhap tung phan tu vao ArrayList

            System.out.print("Nhap phan tu thu " + i + " cua ArrayList: ");
            numberList.add(myScan.nextInt());

        }

        // System.out.println("\nArrayList vua nhap la: ");

        // for (int i = 0; i < numberList.size(); i++) {   // in ra tung phan tu trong ArrayList

        //     System.out.print(numberList.get(i) + " ");

        // }

        System.out.println("\nArrayList vua nhap la: " + numberList);

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {   // Cach 1: tao ArrayList luu cac phan tu khong trung nhau trong numberList vua nhap vao

            if (!newList.contains(numberList.get(i))) {

                newList.add(numberList.get(i));

            }

        }

        // System.out.println("\nSau khi loai bo cac phan tu trung nhau (Cach 1): ");

        // for (int element : newList) {

        //     System.out.print(element + " ");
            
        // }

        System.out.println("\nSau khi loai bo cac phan tu trung nhau (Cach 1): " + newList);

        int check;

        for (int i = 0; i < numberList.size(); i++) {   // Cach 2: dung bien tam 'check' va lenh remove
            
            check = 0;

            for (int j = 0; j < numberList.size(); j++) {

                if (numberList.get(i) == numberList.get(j)) {

                    check++;

                }

            }

            if (check > 1) {

                numberList.remove(i);

            }

        }

        // System.out.println("\nSau khi loai bo cac phan tu trung nhau (Cach 2): ");

        // for (int element : numberList) {

        //     System.out.print(element + " ");
            
        // }

        System.out.println("\nSau khi loai bo cac phan tu trung nhau (Cach 2): " + numberList);

    }
    
}