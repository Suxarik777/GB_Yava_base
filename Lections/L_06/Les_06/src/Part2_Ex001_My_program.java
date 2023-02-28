import java.util.Arrays;
import java.util.HashSet;

public class Part2_Ex001_My_program {
    public static void main(String[] args) {
        Worker w11 = new Worker(); // создаём экземпляр Воркера (класса который мы описали с полями отдельно)
        w11.firstName = "Имя_1"; // создаём конструктор
        w11.lastName = "Фамилия_1";
        w11.salary = 100;
        w11.id = 1000;

        Worker w44 = new Worker();
        w44.firstName = "Имя_1";
        w44.lastName = "Фамилия_1";
        w44.salary = 100;
        w44.id = 1000;

        Worker w22 = new Worker();
        w22.firstName = "Имя_2";
        w22.lastName = "Фамилия_2";
        w22.salary = 200;
        w22.id = 2000;

        Worker w33 = new Worker();
        w33.firstName = "Имя_3";
        w33.lastName = "Фамилия_3";
        w33.salary = 300;
        w33.id = 3000;

        System.out.println(w11==w44); //false
        System.out.println(w11.equals(w44)); //false

        var workers = new HashSet<Worker>(Arrays.asList(w11, w22, w33));
        System.out.println(workers.contains(w44)); //проверка наличия w44

        System.out.println(w11.toString());
        // System.out.println(w2);
        // System.out.println(w3);
    }
}
