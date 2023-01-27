//Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//        N=5
//        c1=”Oleg”
//        c2=”Vasya”
//        res = “OlegVasyaOlegVasyaOleg”


import java.util.Scanner;

public class String_ot_1_do_N {

    public static Scanner iScanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введите число");
        int N = iScanner.nextInt();

        String c1 = "Oleg";
        String c2 = "Vasya";
        String res = "";

        for (int i = 0; i < N; i++)
            res = (i % 2 == 0) ? res + c1 : res + c2;
        System.out.println(res);
    }
}