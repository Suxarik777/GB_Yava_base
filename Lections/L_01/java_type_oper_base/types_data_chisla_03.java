package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

// gримитивные типы данных чисел
public class types_data_chisla_03 {
    public static void main(String[] args) {
        short age = 10;            // более мелкие типы типа шорт
        int salary = 123456;      // занимает 4 байта

        System.out.println(age);
        System.out.println(salary);


        float e = 2.7F;     //ВНИМАНИЕ1! в вещественных числах используем суфикс f -> 0.01f
        double pi = 3.1415; // для double можно этого не делать
        double pi_2 = 2.1234D; // по приколу можно добавлять D - но необязательно

        System.out.println(e); // 2.7
        System.out.println(pi); // 3/1415
        System.out.println(pi_2);
    }
}