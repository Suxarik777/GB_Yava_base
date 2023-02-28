// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
//3. Создайте метод public boolean equals(Object o)
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//4. Создайте метод public int hashCode()
//который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
//5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.


import java.util.Arrays;
import java.util.HashSet;

public class Ex_004 {

    public static void main(String[] args) {
        Class_Cat_Ex Pushok = new Class_Cat_Ex("Pushok", "White");
        Class_Cat_Ex Barsik = new Class_Cat_Ex("Barsik", "Black");
        Class_Cat_Ex Tuzik = new Class_Cat_Ex("Barsik", "Black");

        HashSet<Class_Cat_Ex> cats = new HashSet<>(Arrays.asList(Pushok, Barsik, Tuzik)); // массив данных переводя в лист в хашлист
        for (var el : cats) {

            System.out.println(el.hashCode());
            el.Print();
        }

        System.out.println(Barsik.equals(Tuzik));
        System.out.println(Barsik.equals(Tuzik));

    }
}
