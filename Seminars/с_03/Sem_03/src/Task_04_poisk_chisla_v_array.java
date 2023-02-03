
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_04_poisk_chisla_v_array {

    public static void FillList(List<Integer> list) {


    }

    public static void main(String[] args) {
        ArrayList<String> comboArrayList = new ArrayList<>();
        comboArrayList.add("1");
        comboArrayList.add("Mars");
        comboArrayList.add("4");
        comboArrayList.add("vlad");



        for (int i = 0; i < comboArrayList.size(); i++) {
            if(comboArrayList.get(i).matches("\\d+")){ // вызов по i и .matches("\\d+") - проверяет являетсяли это число
                comboArrayList.remove(i); // функция удаления элемента
            }
        }


        System.out.println(Arrays.toString(comboArrayList.toArray()));


    }
}
