
// - PriorityQueue - Наивысший приоритет имеет «наименьший» элемент.
//    - важный нюанс понятие наименьший для всех
//    типов данных разное (например число понятно, а вот котик, вопрос)

import java.util.PriorityQueue;

public class Ex000_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
       

    }
}

