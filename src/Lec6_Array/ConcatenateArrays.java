import java.util.Scanner;

public class ConcatenateArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng a1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhập phần tử a1[" + i + "]: ");
            a1[i] = sc.nextInt();
        }
        System.out.print("Nhập số phần tử của mảng a2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Nhập phần tử a2[" + i + "]: ");
            a2[i] = sc.nextInt();
        }
        int[] newArray = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            newArray[i] = a1[i];
        }
        for (int i = 0; i < n2; i++) {
            newArray[n1 + i] = a2[i];
        }
        System.out.println("Mảng sau khi nối:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
