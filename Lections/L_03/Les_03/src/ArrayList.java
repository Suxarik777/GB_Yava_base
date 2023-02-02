public class ArrayList {

    public static void main(String[] args) {
        //ArrayList list = new ArrayList(); // не указал тип данных намеренно и получил object
        ArrayList <Integer> list = new ArrayList <Integer>();
        list.add(2809); // в итоге получил увел. время на преобразование в int
        // list.add("маша"); // в случае явного указания не получится положить в object положит



        for (object o : list) { System.out.println(o); }

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>(); // необязательно второй раз писать
        ArrayList<Integer> list3 = new ArrayList<>(10); // можно заранее выделить память
        ArrayList<Integer> list4 = new ArrayList<>(list3); // создавая новый лист можно скопировать



    }
}
