
//Напишите метод, который принимает на вход строку (StringBulder)
// и определяет является ли строка палиндромом (возвращает boolean значение).
// equals и StringBulder для revers

import java.util.Scanner;

public class Ex_03_Polinom_StrinBuilder {

    public static Scanner iScanner = new Scanner(System.in);
    public static StringBuilder InputUser(String text){
        StringBuilder sb = new StringBuilder();

        System.out.println(text);
        String st = iScanner.nextLine();
        sb.append(st);
        return sb;
    }

    public static boolean CheckPolinom (StringBuilder sb) {
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(InputUser("Введите строку"));
        System.out.println(CheckPolinom(sb));
    }
}
