
// Основной принцип заключается в том, что данные можно извлекать
// как с начала так и с конца, и добавлять

import java.util.*;

public class Ex003_Deque_double_ended_queue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2); // вставить первый и последний элемент
        deque.pollFirst(); deque.pollLast(); // возвращает первый или последний элемент
        deque.getFirst(); deque.getLast(); //
        deque.peekFirst(); deque.peekLast();
    }
}