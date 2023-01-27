
// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *).
// int a ; int b; String op (op!=”Stop”); (char != ’b’)


import java.util.Scanner;

public class T_03_Calc {

    public static Scanner iScanner = new Scanner(System.in);

    public static int InputIntUser(String text){
        System.out.println(text);
        return iScanner.nextInt();
    }

    public static char InputCharUser(String text){
        System.out.println(text);
        return iScanner.next().charAt(0);
    }

    public static String InputStringActiv(String text){
        System.out.println(text);
        if(iScanner.hasNextLine()){
            return iScanner.nextLine();
        }
        return "";
    }

    public static boolean CheckActivFunc(String userInput){
        return !userInput.equals("Stop");
    }

    public static float Calculation(int a, int b, char ch){
        if(ch == '+') return a + b;
        else if (ch == '-') return a - b;
        else if (ch == '*') return a * b;
        else if (ch == '/' && a != 0 || b != 0) return a / b;
        else return -10000;
    }


    public static void main(String[] args) {
        boolean checkActiv = true;
        String active = "";

        while(CheckActivFunc(active)){

            int a = InputIntUser("Введите первое число ");
            int b = InputIntUser("Введите второе число ");
            char ch = InputCharUser("Укажите знак ");

            System.out.printf("Результат: %.1f\n", Calculation(a, b, ch));

            active = InputStringActiv("Остановить калькулятор? набирай Stop\nили жми Enter");
        }
        iScanner.close();
    }
}
