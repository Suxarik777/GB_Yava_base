package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;


// вывод количества знаков после запятой
public class form_out_znaki_posle_zapyatoy {
    public static void main(String[] args) {
        float pi = 3.1314f;

        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        //        например, 3.1415e+01
        System.out.printf("%f\n", pi); // 3,131400
        System.out.printf("%.2f\n", pi); // 3,13
        System.out.printf("%.3f\n", pi); // 3,131
        System.out.printf("%e\n", pi); // 3,131400e+00
        System.out.printf("%.2e\n", pi); // 3,13e+00
        System.out.printf("%.3e\n", pi); // 3,131e+00


        // Напоминалка
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        //        например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений
    }
}
