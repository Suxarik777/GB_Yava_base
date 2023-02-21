// 2) Пусть дан список сотрудников:Иван Иванов и т.д.
// Написать программу, которая найдет
// и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


import java.util.*;

public class Ex_02_search_sorted_map_name {


    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван Иванов " +
                "Иван Петрова " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " ;
        String[] arrayNamesSurnames = employees.split(" ");
        for (int i = 0; i < arrayNamesSurnames.length; i += 2) {
            if (nameMap.containsKey(arrayNamesSurnames[i])) {
                nameMap.replace(arrayNamesSurnames[i], nameMap.get(arrayNamesSurnames[i]) + 1);
            } else {
                nameMap.put(arrayNamesSurnames[i], 1);
            }
        }
        System.out.println(nameMap);

        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int count : nameMap.values()) {
            if (count > max) {
                max = count;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);

    }
}
