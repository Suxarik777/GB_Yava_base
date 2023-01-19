package GB_Java_API_base.Shared_repo.Lections.L_01.Project_1;

public class formating_output_MASKI {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);

        int a1 = 1, b1 = 2;
        int c1 = a1 + b1;
        //либо
        // если хотим положить куда-то отформатированую строку
        String res1 = String.format("%d + %d = %d \n", a1, b1, c1); //%d - это маска в которую подставляют
        System.out.println(res); //
        //либо
        System.out.printf("%d + %d = %d \n", a1, b1, c1); // можно сразу запихнуть строку

        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        //        например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений


    }
}
