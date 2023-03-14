// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.*;
import java.util.ArrayList;

public class HW_2 {
    public static void main(String[] args) {
        ArrayList <Integer> arrLst = new ArrayList<Integer>(
                Arrays.asList(23, 44, 3, 65, 345, 8, 35, 243, 22, 77, 24, 100, 56));
        System.out.println(arrLst);

        int maxEl= arrLst.get(0);
        int minEl = arrLst.get(0);
        int sumEl = 0;
        for (int i : arrLst) {
            if (i > maxEl) {
                maxEl = i;
            }
            if (i < minEl) {
                minEl = i;
            }
            sumEl += i;
        }
        float middle = (float)sumEl/arrLst.size();
       
        System.out.printf("Максимальный элемент %s\n", maxEl);
        System.out.printf("Минимальный элемент %s\n", minEl);
        System.out.printf("Сумма элементов %s\n", sumEl);
        System.out.printf("Среднее арифметическое %s\n", middle);
    }
    
}
