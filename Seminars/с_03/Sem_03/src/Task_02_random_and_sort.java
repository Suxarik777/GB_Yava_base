
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_02_random_and_sort {

    public static void FillList(List<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
           int rand = random.nextInt(100);
           list.add(rand);
        }
    }

    public static void PrintList(List<Integer> list){
        list.sort(null);
        for (Integer integer: list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        FillList(list);
        PrintList(list);
    }
}
