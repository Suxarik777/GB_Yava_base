// Каталог товаров книжного магазина сохранен в виде двумерного списка
// List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
// содержится название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_05_List_in_sublist {

    public static Scanner iScanner = new Scanner(System.in);

    public static String inputUser(String text){
        System.out.println(text);
        String user = iScanner.nextLine();
        return user;
    }



    public static void main(String[] args) {
        ArrayList<ArrayList<String>> dc = new ArrayList<>();
        String usersJanr = inputUser("Введите жанр");

        boolean flag = false;

        for (int i = 0; i < dc.size(); i++) {
            if(usersJanr.equals(dc.get(i).get(0))){ // сравни по листу 0 элемент сублиста
                flag = true;
            }
        }

        if (flag){
            System.out.println("Такой жанр уже есть на позици ");
        } else {
            dc.add(new ArrayList<>());
            dc.get(dc.size()-1).add(usersJanr);
        }

        System.out.println(Arrays.toString(dc.toArray())); // выведи массив (лист переведи в массив)

        String book = inputUser("Введите книгу");


        // dc.add(new ArrayList<>()); // внешний
        // dc.get(i).add("нужная книжка"); // внутренний
    }
}
