// * В калькулятор добавьте возможность отменить последнюю операцию.



import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex_03 {

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
        System.out.println(text + "\n");
        iScanner.nextLine();
        return iScanner.nextLine();
    }

    public static boolean CheckActivFunc(String userInput){
        return !userInput.equals("Stop");
    }

    public static boolean CheckReturn(String userInput){
        return !userInput.equals("Return");
    }

    public static float Calculation(int a, int b, char ch){
        if(ch == '+') return a + b;
        else if (ch == '-') return a - b;
        else if (ch == '*') return a * b;
        else if (ch == '/' && a != 0 || b != 0) return a / b;
        else return -10000;
    }

    // public static void addListCollection (Deque <Object>)

    public static void main(String[] args) {

        String active = "";

        Deque <Object> listCollection = new LinkedList<>();

        while(CheckActivFunc(active)){

            int a = InputIntUser("Введите первое число ");
            listCollection.add(a);

            int b = InputIntUser("Введите второе число ");

            char ch = InputCharUser("Укажите знак ");

            float result = Calculation(a, b, ch);

            System.out.printf("Результат: %.1f\n", Calculation(a, b, ch));

            active = InputStringActiv("Остановить калькулятор? набирай Stop\nили жми Enter");
        }
        iScanner.close();
    }
}
