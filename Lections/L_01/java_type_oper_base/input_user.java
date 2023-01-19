package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

//!!!!!!!!
import java.util.Scanner;

public class input_user {
    public static void main(String[] args) {
        // считываем строку
        Scanner nameVarScaner = new Scanner(System.in); //в переменую кладем метод
        System.out.printf("name: ");
        String nameUser = nameVarScaner.nextLine(); // использую как получение следующей строки
        System.out.printf("Привет, %s!", nameUser);
        nameVarScaner.close();

        //считываем примитивы
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();


        //Проверка на соответстие получаемого типа
        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("int a: ");

        boolean check = iScanner2.hasNextInt(); // hasNex.... если возможно int тогда мы будем его считывать
        System.out.println(check); // получим True или False

        int i = iScanner2.nextInt();
        System.out.println(i);

        iScanner.close();

    }
}
