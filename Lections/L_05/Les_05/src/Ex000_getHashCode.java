//
//        Map – это множество коллекций, работающих с данными
//        по принципу <Ключ / Значение>.
//        Ключевые особенности:
//        ● ускоренная обработка данных;
//        ● порядок добавления не запоминается.
//        В HashMap элементы располагаются как угодно и могут
//        менять свое положение.

//        ● допускаются только уникальные ключи, значения
//        могут повторяться;
//        ● помните про null значения*;
//        ● ускоренная обработка данных;
//        ● порядок добавления не запоминается.

public class Ex000_getHashCode {
    public static void main(String[] args) {

        Integer a = 123;
        System.out.println(a.hashCode()); // 122 // работает если переменная Integer
        System.out.println("z".hashCode());
    }
}