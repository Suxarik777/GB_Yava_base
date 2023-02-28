//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// Создать множество ноутбуков.
//1. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет выборку:
// имя ноутбука и выбранный критерий . Критерии фильтрации можно хранить в Map.
//Сделать выборку.
//Например:
//Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Пользователь ввел 1. Вывести в виде.
//|Имя| ОЗУ|
//|--------|-----------|
//| Asus | 2ГБ |
//| HP | 4ГБ |
//| MSI | 6ГБ |
//2. Отфильтровать ноутбуки первоначального множества. По имени ноутбука в алфавитном порядке, по цене по убыванию
//Например, по алфавиту
//|Имя| ОЗУ| Цена
//|--------|-----------|-----------|
//| Asus | 2ГБ | 4666|
//| MSI | 4ГБ |6600|
//| HP | 6ГБ| 5555|


import java.util.*;

public class Main {

    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // создание класса Notebook и сущностей
        Notebook notebook1 = new Notebook("Xiaomi", "16гб", "500 гб",
                                        "Windows 10", "grey", 83000);
        Notebook notebook2 = new Notebook("HP", "8гб", "500 гб",
                                        "-", "grey", 50000);
        Notebook notebook3 = new Notebook("Asus", "4гб", "250 гб",
                                        "Linux", "black", 38000);
        Notebook notebook4 = new Notebook("MSI", "16гб", "1000 гб",
                                        "Linux", "red", 89000);
        Notebook notebook5 = new Notebook("Aser", "32гб", "2000 гб",
                                        "Windows 11", "black", 220000);

        HashSet<Notebook> notebookHashSet = new HashSet<>(Arrays.asList(notebook1,
                                                                        notebook2,
                                                                        notebook3,
                                                                        notebook4,
                                                                        notebook5));

        // 1 часть задания

        String userSelectMenu = menu();

        if (userSelectMenu.equals("1")) {
            Map<String, String> selectNotebookMap = new HashMap<>();
            userSelectNotebook(selectNotebookMap);
            System.out.println("Вы указали следующие критерии:\n" + selectNotebookMap);

            filterExport(notebookHashSet, selectNotebookMap);
        }
        else{
            sortsExport(notebookHashSet);
        }



        iScanner.close();
    }

    public static String menu(){
        System.out.println("Выберете пункт меню:" +
                "\n(введите число соответствующее пункту меню)" +
                "\n1 - Начать задачу по вводу критериев и фильтрации" +
                "\n2 - Отсортировать ноутбуки первоночального множества");
        String userInput = iScanner.nextLine();
        if (userInput.equals("1") || userInput.equals("2")){
            return userInput;
        } else { menu(); }
        return userInput;
    }
    public static void userSelectNotebook(Map<String, String> selectNotebookMap){
        while (true){
            System.out.println("Выберете пункт меню:" +
                                "\n(введите число соответствующее пункту меню)" +
                                "\n1 - Выбрать критерии фильтрации" +
                                "\n2 - Закончить выбор критериев");
            String userInput = iScanner.nextLine();
            if (userInput.equals("2")) break;
            else if (userInput.equals("1")){

                System.out.println("Какой критерий вы хотите указать для фильтрации: " +
                        "\n1 - Наименование ноутбука" +
                        "\n2 - Объём оперативной памяти" +
                        "\n3 - Объём жесткого диска" +
                        "\n4 - Операционная система" +
                        "\n5 - цвет");
                String key = iScanner.nextLine();

                System.out.println("Введите значения по выбранному критерию: ");
                String value = iScanner.nextLine();

                selectNotebookMap.put(key, value);
            }
            else {
                System.out.println("Вы ввели что-то не то, попробуйте ещё раз!");
                userSelectNotebook(selectNotebookMap);
            }
        }
    }

    public static void filterExport(HashSet<Notebook> notebookHashSet, Map<String, String> criteriasNotebookMap){
        HashSet<Notebook> helpHashSet = new HashSet<>(notebookHashSet);

        for (Notebook value : notebookHashSet) {

            for (Object keyPair1 : criteriasNotebookMap.keySet()) {
                if (keyPair1.equals("1") && !value.getName().equals(criteriasNotebookMap.get(keyPair1))) {
                    helpHashSet.remove(value);
                }

                for (Object keyPair2 : criteriasNotebookMap.keySet()) {
                    if (keyPair2.equals("2") && !value.getRam().equals(criteriasNotebookMap.get(keyPair2))) {
                        helpHashSet.remove(value);
                    }

                    for (Object keyPair3 : criteriasNotebookMap.keySet()) {
                        if (keyPair3.equals("3") && !value.getHD().equals(criteriasNotebookMap.get(keyPair3))) {
                            helpHashSet.remove(value);
                        }

                        for (Object keyPair4 : criteriasNotebookMap.keySet()) {
                            if (keyPair4.equals("4") && !value.getOS().equals(criteriasNotebookMap.get(keyPair4))) {
                                helpHashSet.remove(value);
                            }

                            for (Object keyPair5 : criteriasNotebookMap.keySet()) {
                                if (keyPair5.equals("5") &&
                                        !value.getColour().equals(criteriasNotebookMap.get(keyPair5))) {
                                    helpHashSet.remove(value);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (criteriasNotebookMap.isEmpty()) {
            System.out.println("Вы не выбрали не один критерий, посмотрите что у нас есть: \n" + notebookHashSet);
        } else if (helpHashSet.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            System.out.println("Вот что мы можем предложить: \n" + helpHashSet.toString());
        }
    }

    public static void sortsExport(HashSet<Notebook> collectionNotebook){
        TreeSet<Notebook> sortsNotebook = new TreeSet<>();
        sortsNotebook.addAll(collectionNotebook);

        System.out.println(sortsNotebook.toString());
    }
}