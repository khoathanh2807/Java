/* Chuong trinh khai bao va su dung mang (Array) */
/* Chương trình đoc mảng nhập vào và sắp xếp, tìm vị trí phần tử trong mảng */

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        
        boolean flag = false;

        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap kich thuoc cua mang: ");
        int n = myScan.nextInt();   // nhập vào kich thuoc cua mang từ bàn phím

        int [] intArr = new int[n];

        System.out.println("\nNhap cac phan tu cua mang: ");

        for (int i = 0; i < n; i++) {    // nhập vào từng phần tử của mảng

            System.out.print("Nhap phan tu thu " + i + " : ");
            intArr[i] = myScan.nextInt();

        }

        System.out.print("\nMang vua nhap vao la: ");   //in ra màn hình từng phần tử của mảng vừa nhập

        for (int i = 0; i < intArr.length; i++) {

            System.out.print(intArr[i] + " ");

        }

        // thuật toán Bubble Sort:
        // 5 3 1 6 2
        // 3 5 1 6 2
        // 3 1 5 6 2
        // 3 1 5 2 6 -> xong 1 vòng lặp gồm 3 bước
        // 1 3 5 2 6

        for (int i = 0; i < n - 1; i++) {       // sắp xếp mảng theo thứ tự tăng dần

            for (int j = 0; j < n - 1 - i; j++) {

                if (intArr[j] > intArr[j + 1]) {

                    int temp = intArr[j];       // temp = intArr[0] = 5; 
                    intArr[j] = intArr[j + 1];  // intArr[0] = 3;
                    intArr[j + 1] = temp;       // intArr[1] = 5

                }

            }

        }

        System.out.print("\nMang sau khi sap xep theo thu tu tang dan: ");   

        for (int i = 0; i < intArr.length; i++) {

            System.out.print(intArr[i] + " ");

        }

        for (int i = 0; i < n - 1; i++) {       // sắp xếp mảng theo thứ tự giảm dần

            for (int j = 0; j < n - i - 1; j++) {
    
                if (intArr[j] < intArr[j + 1]) {
    
                    int temp = intArr[j];       
                    intArr[j] = intArr[j + 1];  
                    intArr[j + 1] = temp;      
    
                }
    
            }
    
        }
    
        System.out.print("\nMang sau khi sap xep theo thu tu giam dan: ");   
    
        for (int i = 0; i < intArr.length; i++) {
    
            System.out.print(intArr[i] + " ");
    
        }

        System.out.print("\n\nNhap vao so can tim kiem: ");
        int x = myScan.nextInt();   // nhập vào số x cần tìm trong mảng intArr[] từ bàn phím

        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] == x) {   // tìm vị trí của phần tử được nhập vào trong mảng intArr[]

                System.out.println("Vi tri cua " + x + " trong mang intArr[] la: [" + i + "]. ");
                flag = true;    // nếu phần tử nhập cần tìm có xuất hiện trong mảng intArr[] thì flag = true
                break;

            }

        }

        if (flag == false) {

            System.out.println( x + " khong xuat hien trong mang intArr[]");
            
        }

    }

}