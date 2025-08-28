package Lec6_Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int a = 0;
        int sum = 0;
        System.out.println("Nhập các số nguyên: ");
        while (true) {
            a = sc.nextInt();
            if (a == -1 ) break;
            number.add(a);
            sum += a;
        }
        System.out.println("Các số đã nhập: "+number);
        System.out.println("Tổng: "+sum);
    }
}

