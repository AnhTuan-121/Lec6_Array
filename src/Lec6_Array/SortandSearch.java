
package Lec6_Array;
import java.util.Arrays;
import java.util.Scanner;
public class SortandSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Nhập 5 số:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
            System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));

        System.out.print("Nhập số cần tìm: ");
        int x = sc.nextInt();

        int viTri = -1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == x) {
                viTri = i;
                break;
            }
        }

        if (viTri != -1) {
            System.out.println("Số " + x + " ở vị trí index " + viTri);
        } else {
            System.out.println("Không tìm thấy số " + x);
        }

    }
}

