
// Пусть дан произвольный список целых чисел, удалить из него четные числа


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex_02 {

    public static Scanner iScanner = new Scanner(System.in);

    public static int inputNumberUser(String text){
        System.out.println(text);
        return iScanner.nextInt();
    }

    public static void fillArrayList (ArrayList<Integer> list, int length){
        Random random = new Random();
        int maxDigit = 10;
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(maxDigit));
        }
    }

    public static void printArrayList(ArrayList<Integer> list){
        for (Integer item: list) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    public static void resultTask(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }


    public static void main(String[] args) {
        int lengthList = inputNumberUser("Введите длину List ");
        ArrayList <Integer> list = new ArrayList<>();

        fillArrayList(list, lengthList);
        printArrayList(list);

        System.out.println("Результат: ");
        resultTask(list);
        printArrayList(list);
    }
}
