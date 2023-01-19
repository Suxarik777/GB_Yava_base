package GB_Java_API_base.Shared_repo.Lections.L_01.Project_1;

public class Transformations {
    public static void main(String[] args) {
        // неявные преобразования (посто можно присвоить)
        //               char
        //                ↓
        //byte → short → int  →  long
        //                ↓   ⤩   ↓
        //              float   double

        // МОЖНО!
        int i = 123; double d = i;
        System.out.println(i);  // 123
        System.out.println(d);  // 123.0

        d = 3.1415; i = (int)d;
        System.out.println(d);  // 3.1415
        System.out.println(i);  // 3

        d = 3.9415; i = (int)d;
        System.out.println(d);  // 3.9415
        System.out.println(i);  // 3


        byte b = Byte.parseByte("123");
        System.out.println(b);  // 123

        b = Byte.parseByte("1234");
        System.out.println(b);  // NumberFormatException: Value out of range

        //ПРОБЛЕМЫ
        byte y = Byte.parseByte("121211");
        System.out.println(y); //переполнение


        // А вот в массив другой тип данных не положешь
        int[] arr = new int[10];
        // double[] arr_b = arr; //изучаем ивариантность, ковариантность и контрвариантность
        // технически такая необходимость может возникнуть когда будем работать со ссылочными типами
    }
}
