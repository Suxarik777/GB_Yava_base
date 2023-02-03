// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Ex_03_Collections_reverse_tempStack {

    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args){


        Stack<String> tempStack = new Stack<>();

        while (true){
            String txt = iScanner.nextLine();
            if (txt.equals("")) break;
            else if (txt.equals("print")) {
                Collections.reverse(tempStack); //перевернуть массив
                System.out.println(tempStack.toString()); // так как ссылочный покажет уже перевернутый
                Collections.reverse(tempStack); // переворачиваем назад
            } else if (txt.equals("revert")) {
                tempStack.pop(); // удаление
                System.out.println(tempStack.toString()); // превратить в строку
            } else {
                tempStack.push(txt);
            }
        }
        iScanner.close();

        // Collection.reverse(list);
    }
}
