// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;
import java.util.Random;

public class Ex_01_LinkedList_revers {

    public static void fillLinkedList(LinkedList<Integer> ll){
        int sizeLl = 10;
        int maxRandomDigit = 10;

        Random random = new Random();
        for (int i = 0; i < sizeLl; i++) {
            ll.add(random.nextInt(maxRandomDigit));
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> ll){
        int help = 0;
        int size = ll.size();

        for (int i = 0; i < size/2; i++) {
            int lastElementLl = ll.size() - 1 - i;
            help = ll.get(lastElementLl);
            ll.remove(lastElementLl);
            ll.add(lastElementLl, ll.get(i));
            ll.remove(i);
            ll.add(i, help);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        fillLinkedList(ll);
        System.out.println(ll);

        reverseLinkedList(ll);
        System.out.println(ll);

        // Collections.reverse(tempStack); //перевернуть коллекцию
    }
}