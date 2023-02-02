
import java.util.*;

public class Ex004_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();

        // ЗДЕСЬ ПАРЫ упорядочиваются по ключу - логика упорядочивания

        tMap.put(1,"один"); System.out.println(tMap); 
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

        System.out.println(tMap.descendingKeySet()); // получить исключительно сами ключи в обратном порядке
        // [6, 4, 3, 2, 1]
        System.out.println(tMap.descendingMap()); // показать в обратном порядке
        // {6=шесть, 4=четыре, 3=три, 2=два, 1=один}

        //.put(K,V) - добавить пару
        //.get(K) - получить значение по ключу
        //.remove(K) - удалить значение по ключу
        //.descendingKeySet(V) - получить исключительно сами ключи в обратном порядке
        //.descendingMap() - показать в обратном порядке
        //.tailMap() - показать значения больше чем
        //.headMap() - показать множество элементов меньше чем
        //.lastEntry() - последнее значение
        //.firstEntry() - первое значение
    }
}
