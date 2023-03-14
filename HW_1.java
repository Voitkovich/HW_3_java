import java.util.*;
import java.util.ArrayList;

public class HW_1 {
    public static void main(String[] args) {
       

        // Пусть дан произвольный список целых чисел, удалить из него чётные числа

        ArrayList <Integer> arrLst = new ArrayList<Integer>(
                Arrays.asList(23, 44, 3, 65, 345, 8, 35, 243, 22, 77, 24, 100, 56));
        System.out.println(arrLst);
        int i = 0;
        while (i < arrLst.size()) {
            if (arrLst.get(i) % 2 == 0) {
                arrLst.remove(i);
            }
            else{
                i++;
            }
            
        }
        System.out.println(arrLst);
    }
}
