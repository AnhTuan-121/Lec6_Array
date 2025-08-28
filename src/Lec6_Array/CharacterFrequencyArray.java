package Lec6_Array;
import java.util.Scanner;

public class CharacterFrequencyArray  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi (chỉ chữ thường): ");
        String text = sc.nextLine();

        int[] count = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }
        System.out.println("Kết quả:");
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }
    }
}
