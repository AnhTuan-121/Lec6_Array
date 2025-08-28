package Lec6_Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        ArrayList result = new ArrayList();

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
            if (!result.contains(value)) {
                result.add(value);
            }
        }

        System.out.println("Danh sách gốc: " + list);
        System.out.println("Danh sách sau khi xóa trùng: " + result);
        sc.close();
    }
}
