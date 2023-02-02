

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();

        // вспоминаем что листы открывают следующие ячейки памяти для
        // массива как правило пропорционально увеличивая на 2
        // (но это не точно курим документацию)

        // Map<Integer,String> map2 = new HashMap<>(9); // если известно требуемое количество элементов
        // Map<Integer,String> map3 = new HashMap<>(9, 1.0f);
                // количество элементов массива,
                //увеличивать количество элементов нужно когда 100% заполнение 0.7 указало 70 %


        db.putIfAbsent(1, "один");  // метод проверка, если такой ключь есть то ничего добовлять не будем
        db.put(2, "два");           // добавить
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null);

        System.out.println(db); // {1=один, 2=два}

        System.out.println(db.containsValue("один")); //проверка значения // true
        // System.out.println(db.containsValue(1)); // соответсвенно это ключь в значении нет false
        // System.out.println(db.containsKey("один")); // это значение поэтому false
        System.out.println(db.containsKey(1)); // проверка ключа // true

        System.out.println(db.keySet()); // коллекция всех ключей
        System.out.println(db.values()); // коллекция всех значений

        // put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        // putIfAbsent(K,V) – произвести добавление если ключ не найден.
        // get(K) - получение значения по указанному ключу.
        // remove(K) – удаляет пару по указанному ключу.
        // containsValue(V) – проверка наличия значения.
        // containsKey(V) – проверка наличия ключа.
        // keySet() – возвращает множество ключей.
        // values() – возвращает набор значений.



    }
}