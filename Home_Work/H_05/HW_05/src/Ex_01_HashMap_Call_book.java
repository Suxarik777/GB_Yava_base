// 1) Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.


import java.util.HashMap;
import java.util.Scanner;

public class Ex_01_HashMap_Call_book {

    public static Scanner iScanner = new Scanner(System.in);

    public static int menu (String text){
        System.out.println(text);
        int userInput = iScanner.nextInt();
        return userInput;
    }
    public static void main(String[] args) {
        HashMap<String, String> nameCall = new HashMap<>();

        while(true){
            int menuSelect = menu("Выберите пункт меню:\n1.Добавить запись" +
                    "\n2.Посмотреть все записи" +
                    "\n3.Найти абонента" +
                    "\n4.Стоп");

            if(menuSelect == 4){
                break;
            }

            if(menuSelect == 1){
                while (true){

                    iScanner.nextLine();

                    System.out.println("Введите фамилию");
                    String surname = iScanner.nextLine();

                    System.out.println("Введите номер телефона");
                    String numberCall = iScanner.nextLine();

                    nameCall.put(numberCall, surname);
                    System.out.println("Запись добавлена");

                    System.out.println("Для остановки наберите - stop\nДля ввода нового абонента жми Enter");
                    String check = iScanner.nextLine();
                    if(check.equals("stop")) break;
                }
            }

            if (menuSelect == 2){
                for (var element: nameCall.entrySet()) {
                    System.out.printf("%s : %s \n", element.getKey(), element.getValue());
                }
            }

            if (menuSelect == 3){
                iScanner.nextLine();

                System.out.println("Введите фамилию абонента");
                String userCall = iScanner.nextLine();
                boolean flag = false;

                for (var element: nameCall.entrySet()) {
                    if(element.getValue().equals(userCall)){
                        System.out.printf("%s : %s \n", element.getKey(), element.getValue());
                        flag = true;
                    }
                }

                if (flag == false) {
                    System.out.println("Такого абонента нет");
                }
            }

        }

        iScanner.close();
    }
}