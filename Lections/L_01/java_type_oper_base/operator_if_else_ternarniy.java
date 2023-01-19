package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

// Упровляющие конструкции, условный оператор
public class operator_if_else_ternarniy {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;

        // полная форма
        if (a>b) {
            c = a;
        } else {
            c = b;
        }

        //сокращенная форма операторов
        if (a > b) c = a;
        if (b > a) c = b;

        System.out.println(c);

        // тернарный оператор
        a = 1;
        b = 2;
        int min = a < b ? a : b;
        // если a < b верное то бери значение слево после ? // если ложь то справа


        System.out.println(min);
    }
}
