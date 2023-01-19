package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

public class Cicles_for_while {
    public static void main(String[] args) {
//        В java доступны следующие циклы:
//        цикл while;
//        цикл do while;
//        цикл for;
//          и его модификация for in -> он жe foreach работает для перебора коллекций или итерируемых типов

        int value = 321;
        int count = 0;

        while (value != 0){
            value /= 10;
            count++;
        }

        // do while - цикл с постусловием, который в начале что-то делает чтобы потом что-то проверять

        value = 321;
        count = 0;

        do{
            value /= 10;
            count++;
        } while (value != 0);

        System.out.println(count);

        ////////////
        // continue and break
        //        Выполнение следующей итерации цикла — continue.
        //        Прерывание текущей итерации цикла — break.
        //        * ближайшего к оператору

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0) continue; //если число четное пропускай цикл
            System.out.println(i);

            //ну a break тормознёт цикл
        }

        // цикл for in (foreach)   работает с коллекциями (например массивом
        int[] arr = new int[] {1, 2, 3, 4, 5, 77};
        for (int item : arr){
            System.out.printf("%d ", item);
        }
        // ВНИМАНИЕ ЗАПИСАТЬ НЕЛЬЗЯ в этом цикле

        System.out.println(); // пустая строка

    }
}

