package Lec6_Array;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng 1: ");
        int n1 = sc.nextInt();
        int[] mang1 = new int[n1];
        System.out.println("Nhập các phần tử của mảng 1 (tăng dần):");
        for (int i = 0; i < n1; i++) {
            mang1[i] = sc.nextInt();
        }
        System.out.print("Nhập số phần tử mảng 2: ");
        int n2 = sc.nextInt();
        int[] mang2 = new int[n2];
        System.out.println("Nhập các phần tử của mảng 2 (tăng dần):");
        for (int i = 0; i < n2; i++) {
            mang2[i] = sc.nextInt();
        }
        int[] ketQua = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (mang1[i] < mang2[j]) {
                ketQua[k] = mang1[i];
                i++;
            } else {
                ketQua[k] = mang2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            ketQua[k] = mang1[i];
            i++;
            k++;
        }
        while (j < n2) {
            ketQua[k] = mang2[j];
            j++;
            k++;
        }
        System.out.println("Mảng sau khi gộp:");
        for (int x = 0; x < ketQua.length; x++) {
            System.out.print(ketQua[x] + " ");
        }
    }
}
