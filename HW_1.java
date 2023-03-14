
// import java.lang.reflect.Array;
import java.util.*;

import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Random;

// // Заполнить список десятью случайными числами. 
// // Отсортировать список методом sort() и вывести его на экран.

// public class seminar_3 {
//     public static void main(String[] args) {
//     Random rdm = new Random();
//     ArrayList<Integer> rdm_list = new ArrayList<Integer>();
//     for (int i = 0; i < 10; i ++){
//         rdm_list.add(rdm.nextInt(1, 10));
//     }
//     rdm_list.sort(Comparator.naturalOrder());
//     System.out.println(rdm_list);
// }
// }

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

public class HW_1 {
    public static void main(String[] args) {
        // String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn",
        // "uranus", "neptune"};
        // ArrayList<String> planetsRes = new ArrayList<String>();

        // Random rnd = new Random();
        // for (int i = 0; i < 10; i++){
        // planetsRes.add(planets[rnd.nextInt(0, 7)]);
        // }
        // System.out.println(planetsRes);
        // for (int i = 0; i < planets.length; i++){
        // System.out.printf("%s встречается %d раз\n", planets[i],
        // Collections.frequency(planets, planets[i]));
        // }
// 2
        // ArrayList<String> planets = new ArrayList<String>(
        // Arrays.asList("mercury", "venus", "earth", "mars", "jupiter", "saturn",
        // "uranus", "neptune", "jupiter",
        // "jupiter", "saturn"));
        // planets.sort(Comparator.naturalOrder());

        // int count = 1;

        // for (int i = planets.size() - 1; i > 0; i--) {
        // if (planets.get(i).equals(planets.get(i - 1))) {
        // count++;
        // } else {
        // System.out.println(planets.get(i) + " Повторяется " + count + " раз.");
        // }
        // }
        // System.out.println(planets.get(0) + " Повторяется " + count + " раз.");
        // }
        // }

        // Создать список типа ArrayList. Поместить в него как строки, так и целые
        // числа.
        // // Пройти по списку, найти и удалить целые числа.

        // ArrayList mix_lst = new ArrayList<>();
        // String[] words = new String[]{"я","не","люблю","java"};
        // Random rdm = new Random();
        // for (int i = 0; i < 20; i++){
        // int type = rdm.nextInt(0,2
        // );
        // if (type == 0){
        // mix_lst.add(rdm.nextInt(1,10));

        // }
        // else{
        // mix_lst.add(words[rdm.nextInt(words.length)]);
        // }
        // }
        // int len = mix_lst.size();
        // for ( int i = 0; i < len; i++){
        // if (mix_lst.get(i) instanceof Integer){
        // mix_lst.remove(i);
        // len--;
        // i --;
        // }
        // }
        // System.out.println(mix_lst);
        // }
        // }

        // Пусть дан произвольный список целых чисел, удалить из него чётные числа

        ArrayList <Integer> arrLst = new ArrayList<Integer>(
                Arrays.asList(23, 44, 3, 65, 345, 8, 22, 77, 24, 100, 56));
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