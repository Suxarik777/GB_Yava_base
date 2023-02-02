// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифм из этого списка.


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex_03_list_float_int_convert {

    public static Scanner iScanner = new Scanner(System.in);

    public static void fillArrayList(ArrayList<Integer> list){
        Random random = new Random();
        int maxDigit = 10;
        int length = 5;

        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(maxDigit));
        }
    }

    public static int minDigitToList(ArrayList<Integer> list){
        int minNumber = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < minNumber) minNumber = list.get(i);
        }
        return minNumber;
    }

    public static int maxDigitToList(ArrayList<Integer> list){
        int maxNumber = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > maxNumber) maxNumber = list.get(i);
        }
        return maxNumber;
    }

    public static ArrayList<Float> convertListIntegerToFloat (ArrayList<Integer> list){
        ArrayList<Float> listFloat = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            listFloat.add((float)list.get(i));
        }
        return listFloat;
    }

    public static float arithmeticMeanToList(ArrayList<Float> listFloat){
        float arithmeticMean = 0;
        float sum = 0;

        for (int i = 0; i < listFloat.size(); i++) {
            sum += listFloat.get(i);
        }

        arithmeticMean = sum / listFloat.size();
        return arithmeticMean;
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillArrayList(list);

        System.out.println("Лист\n" + list);

        ArrayList<Float> listFloat = convertListIntegerToFloat(list);
        //System.out.println(listFloat);

        int minNumberToList = minDigitToList(list);
        int maxNumberToList = maxDigitToList(list);
        float arithmeticMean = arithmeticMeanToList(listFloat);

        System.out.printf("Минимальное число: %d\n" +
                        "Максимальное число %d\n" +
                        "Среднее арифмитическое число %.2f\n",
                        minNumberToList, maxNumberToList, arithmeticMean);
    }
}
