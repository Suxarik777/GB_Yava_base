import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_01_HashMap_Passport_num_name {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> names = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите номер и фамилию: ");
            String[] name = iScanner.nextLine().split(" "); // name[0] - номер, name[1] - фамилия
            names.put(Integer.parseInt(name[0]), name[1]);
        }

        for (var element: names.entrySet()) {
            if (element.getValue().equals("Иванов"))
                System.out.printf("%d : %s \n", element.getKey(), element.getValue());
        }
        iScanner.close();
    }
}