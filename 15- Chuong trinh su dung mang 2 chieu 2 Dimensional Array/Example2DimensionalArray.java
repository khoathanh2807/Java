/* Chuong trinh khai bao va su dung mang 2 chieu (2 Dimensional Array) */
/* Chương trình nhập vào 2 mảng 2 chieu và tính tổng, hiệu 2 mảng này */

import java.util.Scanner;

public class Example2DimensionalArray {

    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);    // lenh Scanner(System.in) dung de doc ki tu nhap vao tu ban phim

        System.out.print("\nNhap so dong cua ma tran: ");
        int n = myScan.nextInt();   // nhập vào so dong cua mang 2 chieu từ bàn phím

        System.out.print("Nhap so cot cua ma tran: ");
        int m = myScan.nextInt();   // nhập vào so cot cua mang 2 chieu từ bàn phím

        int [][] matrix1 = new int [n][m];  // mảng 2 chieu thứ nhất
        int [][] matrix2 = new int [n][m];  // mảng 2 chieu thứ 2

        int [][] matrix = new int [n][m];   // mảng 2 chieu lưu kết quả tính tổng, hiệu

        System.out.println("\nNhap ma tran 1: ");   

        for (int i = 0; i < n; i++) {   // Nhap ma tran 1

            //System.out.println();

            for (int j = 0; j < m; j++) {

                System.out.print("Nhap phan tu tai dong " + i + " cot " + j + " cua ma tran 1: ");
                matrix1[i][j] = myScan.nextInt();   // nhập vào tung phan tu cua mang 2 chieu từ bàn phím

            }

        }

        System.out.println("\nNhap ma tran 2: ");   

        for (int i = 0; i < n; i++) {   // Nhap ma tran 2

            //System.out.println();

            for (int j = 0; j < m; j++) {

                System.out.print("Nhap phan tu tai dong " + i + " cot " + j + " cua ma tran 2: ");
                matrix2[i][j] = myScan.nextInt();   // nhập vào tung phan tu cua mang 2 chieu từ bàn phím

            }

        }

        for (int i = 0; i < n; i++) {   // phép cộng 2 mảng 2 chieu vừa nhập

            for (int j = 0; j < m; j++) {

                matrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }

        }

        System.out.println("\nTong cua 2 ma tran vua nhap: ");  // in ra tong 2 ma tran

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + "\t");

            }

            System.out.println();

        }

        for (int i = 0; i < n; i++) {   // phép trừ 2 mảng 2 chieu vừa nhập

            for (int j = 0; j < m; j++) {

                matrix[i][j] = matrix1[i][j] - matrix2[i][j];

            }

        }

        System.out.println("\nHieu cua 2 ma tran vua nhap: ");  // in ra hieu 2 ma tran

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + "\t");

            }

            System.out.println();

        }

    }
    
}