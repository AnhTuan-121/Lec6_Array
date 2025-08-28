package Lec6_Array;
import java.util.Scanner;
public class FindtheMaximumandMinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 mang so nguyen: ");
        int a = sc.nextInt();
        int [] arr = new int[a];
        System.out.println("elements: ");
        for(int i  = 0;i < a; i++ ) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1;i < a;i++) {
            if (arr[i] > max ) max  = arr[i];
            if (arr[i] < min ) min = arr[i];
        }
        System.out.println("Gia tri lon nhat: "+max);
        System.out.println("Gia tri nho nhat: "+min);

    }
}
