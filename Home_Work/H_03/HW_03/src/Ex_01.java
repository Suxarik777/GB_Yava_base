// Реализовать алгоритм сортировки слиянием


import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Ex_01 {

    public static Scanner iScanner = new Scanner(System.in);

    public static int inputNumberUser(String text){
        System.out.println(text);
        return iScanner.nextInt();
    }


    public static void fillArrayList(ArrayList<Integer> list, int maxDigit, int length){
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int rand = random.nextInt(maxDigit);
            list.add(rand);
        }
    }

    public static void printArrayList(ArrayList<Integer> list){
        for (Integer item : list) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    public static void mergeSortTwoArrayList(ArrayList<Integer> list1,
                                             ArrayList<Integer> list2,
                                             ArrayList<Integer> listResult){

        int lengthResult = list1.size() + list2.size();
        int i = 0, j = 0; // индексы для двух листов

        for (int k = 0; k < lengthResult; k++) {
            if (i >= list1.size()) {
            listResult.add(list2.get(j));
            } else if (j >= list2.size()) {
            listResult.add(list1.get(i));
            } else if (list1.get(i) <= list2.get(j)) {
                listResult.add(list1.get(i));
                i++;
            } else if (list2.get(j) < list1.get(i)) {
                listResult.add(list2.get(j));
                j++;
            }
        }
    }



    public static void main(String[] args) {
        int maxRandomDigit = inputNumberUser("Введите максимальное число random ");
        int lengthList = inputNumberUser("Введите длину List ");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listResult = new ArrayList<>();

        fillArrayList(list1, maxRandomDigit, lengthList);
        fillArrayList(list2, maxRandomDigit, lengthList);

        printArrayList(list1);
        printArrayList(list2);

        list1.sort(null);
        list2.sort(null);

        System.out.println("Сортированные листы: ");
        printArrayList(list1);
        printArrayList(list2);

        mergeSortTwoArrayList(list1, list2, listResult);

        System.out.println("Результат: ");
        printArrayList(listResult);

        iScanner.close();
    }
}