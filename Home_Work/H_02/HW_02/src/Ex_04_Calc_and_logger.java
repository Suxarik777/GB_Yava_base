// 4) К калькулятору из предыдущего дз добавить логирование.


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Ex_04_Calc_and_logger {
    public static Scanner iScanner = new Scanner(System.in);
    public static Logger iLogger = Logger.getLogger(Ex_04_Calc_and_logger.class.getName());

    public static void startLogger() throws IOException {
        String FileName = "src/Ex_04_log.txt";
        FileHandler fh = new FileHandler(FileName);
        iLogger.addHandler(fh);

        SimpleFormatter txt = new SimpleFormatter();
        fh.setFormatter(txt);
    }


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

    public static float Calculation(int a, int b, char ch){
        if(ch == '+') return a + b;
        else if (ch == '-') return a - b;
        else if (ch == '*') return a * b;
        else if (ch == '/' && a != 0 || b != 0) return a / b;
        else return -10000;
    }


    public static void main(String[] args) throws IOException {
        boolean checkActiv = true;
        String active = "";

        while(CheckActivFunc(active)){
            startLogger();

            int a = InputIntUser("Введите первое число ");
            int b = InputIntUser("Введите второе число ");
            char ch = InputCharUser("Укажите знак ");

            float res = Calculation(a, b, ch);



            System.out.printf("Результат: %.1f\n", res);

            iLogger.log(Level.INFO, a + String.valueOf(ch) + b + "=" + res); // метод, чтобы не возвращался код символа

            active = InputStringActiv("Остановить калькулятор? набирай Stop\nили жми Enter");
        }
        iScanner.close();
    }

}
