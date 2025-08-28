
package Lec6_Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertBetween {
    
 
    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {   
            list.add(s);        
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
     
        String[] arr = new String[list.size()];
        arr = list.toArray(arr);
        return arr;
    }

    public static void main(String[] args) {
       
        String[] names1 = {"Ann", "Bob"};
        ArrayList<String> list1 = arrayToArrayList(names1);
        System.out.println("ArrayList từ mảng: " + list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Charles");
        list2.add("David");
        String[] names2 = arrayListToArray(list2);
        System.out.println("Mảng từ ArrayList: " + Arrays.toString(names2));
    }
}
