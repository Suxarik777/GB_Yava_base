// 1) Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
//
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: String str =
// "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia”


import java.util.Scanner;

public class Ex_01_StringBuilderAppend {

    public static Scanner iScanner = new Scanner(System.in);

    public static StringBuilder userInput(String text, StringBuilder sb){

        System.out.println(text);
        String st = iScanner.nextLine();
        if(!st.isEmpty()) // если строка пустая, а точнее !если строка не пустая
            sb.append("\n" + text); sb.append(st);
        return sb;
    }

    public static void main(String[] args) {
        StringBuilder resultTaskSb = new StringBuilder();

        userInput("name: ", resultTaskSb);
        userInput("country: ", resultTaskSb);
        userInput("city: ", resultTaskSb);
        userInput("age: ", resultTaskSb);

        System.out.println("select * from students where ");
        System.out.println(resultTaskSb);
    }
}