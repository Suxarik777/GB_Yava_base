package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

public class types_data_operation {
    public static void main(String[] args) {
        int a = 123;
        a++;
        System.out.println(a++); // приоритет альтерации инкремента ниже чем вывода на консоль
        System.out.println(++a); // приоритет префексный выше чем вывод

        int as = 123;
        as = --as - as--; //посчитайте в уме с учетом приоритета операции


        boolean f = 123 <= 124;
        System.out.println(f);

        //операции побитовых сдвигов >> <<
        int b = 8;
        // 1000   -> двоичное использование
        // мы хотим сдвинуть все биты на один бит влево
        b = b << 1;
        // образовался дополнительный бит новый нолик -> 10000
        System.out.println(b);

        int d = 18;
        // 10010   -> двоичное использование
        // мы хотим сдвинуть все биты на один бит вправо
        d = d >> 1;
        // образовался дополнительный бит новый нолик -> 1001
        System.out.println(d);

        // побитовые | -> будет при выборе чисел в двоичном выбирать True -> 1
        int x = 5;
        int y = 2;
        System.out.println(x | y);
        // 5 -> 101
        // 2 -> 010
        //      111

        // побитовые & -> будет при выборе чисел в двоичном выбирать False -> 0
        int x1 = 5;
        int y1 = 2;
        System.out.println(x1 & y1);
        // 5 -> 101
        // 2 -> 010
        //      000

        // побитовая разделительная ^ истина только тогда когда одно из начений истина True
        int x2 = 5;
        int y2 = 2;
        System.out.println(x2 ^ y2);
        // 5 -> 101
        // 2 -> 010
        //      111


        boolean o = true;
        boolean p = true;
        System.out.println(o & p);
        // o -> 1
        // p -> 1
        //      1

        boolean o1 = true;
        boolean p1 = true;
        System.out.println(o && p); //работают по разному с двумя антерсантами быстрая операция

        String g = "qwer"; //4, индексы от 0 до 3
        boolean l = g.length() >= 5 && g.charAt(4) == '1'; //длинна должна быть такой-то и 4 символ такой то
        System.out.println(l);

        //String g = "qwer"; //4, индексы от 0 до 3
        // с одной оперсантой вывалится
        //boolean l = g.length() >= 5 & g.charAt(5) == '1'; //длинна должна быть такой-то и 4 символ такой то
        System.out.println(l);

        // && -> будето смотреть в начале слева и если там ложь то и смотреть справа не будет
        // поэтому быстрая

        // & -> будет в любом случае всё смотреть

        // оператор или ||
        // || -> будето смотреть в начале слева и если там true то и смотреть справа не будет
        // поэтому быстрая

        // | -> будет в любом случае всё смотреть
    }
}