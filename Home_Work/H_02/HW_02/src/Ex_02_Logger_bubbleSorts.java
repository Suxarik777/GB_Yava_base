// 2) Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Ex_02_Logger_bubbleSorts {

    public static Logger iLogger = Logger.getLogger(Ex_02_Logger_bubbleSorts.class.getName());

    public static void loggerStart() throws IOException {
        //String Path  = System.getProperty("HW_02.dir"); // не заработало папка
        String FileName = "src/log_Ex_02.txt";
        //String FullPath = Path.concat(FileName);

        FileHandler fh = new FileHandler(FileName);
        iLogger.addHandler(fh);

        SimpleFormatter txt = new SimpleFormatter();
        fh.setFormatter(txt);
    }

    public static int[] fillArrayRandom(){
        int length = 10;
        Random random = new Random();

        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static String logMessageCircle(int i, int j, int[] array){
        return "Проход: " + i + " замена элементов " + j + " и " + (j+1) +
                "(" + array[j] + ", " + array[j+1] + ")" +
                "Массив: " + Arrays.toString(array);
    }

    public static void bubbleSorts(int[] array){
        int help;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    help = array[j+1];
                    array[j+1] = array[j];
                    array[j] = help;
                    iLogger.log(Level.INFO, logMessageCircle(i, j, array)); // метод строки выше
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        int[] array = fillArrayRandom();
        String startLogText = "Консольное приложение: Семинар 2, задача 2, пузырьковая сортировка." +
                "\nИсходный массив: ";

        System.out.println(Arrays.toString(array));

        loggerStart(); // запуск логгера
        iLogger.setUseParentHandlers(false); // команда отключения лога в консоль

        iLogger.log(Level.INFO, startLogText + Arrays.toString(array));

        bubbleSorts(array);

        System.out.println(Arrays.toString(array));

    }
}
