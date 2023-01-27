import java.util.Scanner;

public class Test {

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