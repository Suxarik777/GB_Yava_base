// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex_02_LinkedList_enqueue_dequeue_first {

    public static Scanner iScanner = new Scanner(System.in);

    public static int inputUserInteger(String text){
        System.out.println(text);
        return iScanner.nextInt();
    }

    public static void fillLinkedList (LinkedList<Integer> ll){
        int size = 10;
        int maxDigitRandom = 10;

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            ll.add(random.nextInt(maxDigitRandom));
        }
    }

    public static void enqueueManual (LinkedList<Integer> ll, int element){
        // enqueue() - помещает элемент в конец очереди,
        int help = ll.get(element);
        ll.remove(element);
        ll.add(help);
    }

    public static int dequeueManual(LinkedList<Integer> ll){
        // dequeue() - возвращает первый элемент из очереди и удаляет его
        int element = ll.get(0);
        ll.pop();
        return element;
    }

    public static int firstManual(LinkedList<Integer> ll){
        // first() - возвращает первый элемент из очереди, не удаляя.
        return ll.get(0);
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        fillLinkedList(ll);
        System.out.println("Рандом лист\n" + ll);

        int element = inputUserInteger("Укажите индекс элемента: ");

        enqueueManual(ll, element);
        System.out.println("enqueue - помещает элемент в конец очереди сработало так:\n" + ll);

        System.out.println("-------");

        int elementDequeue = dequeueManual(ll);
        System.out.println("Рандом лист после функции dequeue\n" + ll);
        System.out.printf("Возвращаемый элемент: %d\n", elementDequeue);

        System.out.println("-------");

        int elementFirst = firstManual(ll);
        System.out.println("Рандом лист после функции first\n" + ll);
        System.out.printf("Возвращаемый элемент: %d\n", elementFirst);

        iScanner.close();
    }
}
