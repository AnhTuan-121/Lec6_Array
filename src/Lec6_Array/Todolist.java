package Lec6_Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> jobs = new ArrayList<>();

        while (true) {
            System.out.println("0. Out");
            System.out.println("1. Add");
            System.out.println("2. View all");
            System.out.println("3. Remove");
            System.out.print("Nhap hanh dong: ");
            int option = sc.nextInt();

            if (option == 0) {
                break;
            } else if (option == 1) {
                sc.nextLine();
                System.out.print("Nhap cong viec: ");
                String cv = sc.nextLine();
                jobs.add(cv);
            } else if (option == 2) {
                for (int i = 0; i < jobs.size(); i++) {
                    System.out.println(i + ". " + jobs.get(i));
                }
            } else if (option == 3) {
                System.out.print("Xoa cong viec o vi tri thu: ");
                int z = sc.nextInt();
                if (z >= 0 && z < jobs.size()) {
                    jobs.remove(z);
                } else {
                    System.out.println("Vi tri khong hop le!");
                }
            } else {
                System.out.println("Nhap sai");
            }
        }
    }
}
