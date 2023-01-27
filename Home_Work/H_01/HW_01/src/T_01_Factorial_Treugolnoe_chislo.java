// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)


import java.util.Scanner;

public class T_01_Factorial_Treugolnoe_chislo {

    public static int SumDigitsResult (int a){
        return (a * (a + 1)) / 2;
    }

    public static int Factorial (int length){
        int factorial = 1;
        for (int i = 1; i <= length; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.println("Введите число N: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", SumDigitsResult(i));
        System.out.printf("Факториал (произведение чисел от 1 до n): %d\n", Factorial(i));
        iScanner.close();
    }


}