package Lec6_Array  ;

import java.util.Scanner;

public class SwapTwoElements {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số phần tử của mảng: ");
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + i + ": ");
                numbers[i] = sc.nextInt();
            }
            System.out.print("Nhập vị trí a: ");
            int a = sc.nextInt();
            System.out.print("Nhập vị trí b: ");
            int b = sc.nextInt();
            int temp = numbers[a];
            numbers[a] = numbers[b];
            numbers[b] = temp;
            System.out.println("Mảng sau khi đổi chỗ:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }
