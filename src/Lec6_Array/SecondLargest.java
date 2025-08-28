    package Lec6_Array;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int a = arr[0];
        int b = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > a) {
                b = a;
                a = arr[i];
            } else if (arr[i] > b && arr[i] < a) {
                b = arr[i];
            }
        }
        if (a == b) {
            System.out.println("Không có phần tử lớn thứ hai.");
        } else {
            System.out.println("Phần tử lớn thứ hai là: " + b);
        }
    }
}
