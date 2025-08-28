package Lec6_Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RemovingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            ds.add(sc.nextInt());
        }
        ArrayList<Integer> ketQua = new ArrayList<>();
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i) <= 50) {
                ketQua.add(ds.get(i));
            }
        }
        System.out.println("Danh sách sau khi xóa: " + ketQua);
    }
}

