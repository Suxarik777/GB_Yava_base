package GB_Java_API_base.Shared_repo.Lections.L_01.Project_1;

import javax.sound.midi.Soundbank;

public class types_data_boolean {
    public static void main(String[] args) {
        boolean f = true && false; // И - логические операции или двойная аперсанда
        boolean f1 = true || false;

        boolean f2 = true & false; // это побитовые операции
        boolean f3 = true | false; // побитовая операция


        boolean flag1 = 123 <= 234; //
        System.out.println(flag1); // true

        boolean flag2 = 123 >= 234; //
        System.out.println(flag2);

        boolean flag3 = flag1 ^ flag2; // дизЪюнкция разделяющая
        // возвращает истину тогда и только тогда, когда одно из значений истина
        System.out.println(flag3);
    }
}
