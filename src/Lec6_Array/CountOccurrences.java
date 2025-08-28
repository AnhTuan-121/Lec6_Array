package Lec6_Array;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập số X cần tìm: ");
        int x = sc.nextInt();


        int dem = 0;
        for (int num : arr) {
            if (num == x) {
                dem++;
            }
        }
        System.out.println("Số " + x + " xuất hiện " + dem + " lần.");
    }
}
