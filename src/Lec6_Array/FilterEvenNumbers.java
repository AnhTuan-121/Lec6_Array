package Lec6_Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + i + ": ");
            mang[i] = sc.nextInt();
        }
        ArrayList<Integer> soChan = new ArrayList<>();
        for (int so : mang) {
            if (so % 2 == 0) {
                soChan.add(so);
            }
        }
        System.out.print("Cac so chan trong mang la: ");
        for (int so : soChan) {
            System.out.print(so + " ");
        }
    }
}

