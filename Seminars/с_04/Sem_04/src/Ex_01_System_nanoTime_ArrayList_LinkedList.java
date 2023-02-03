import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex_01_System_nanoTime_ArrayList_LinkedList {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new LinkedList<>();

        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list1.add(i);
        }

        long end = System.nanoTime();
        System.out.println(end-start);

        long start2 = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list2.add(i);
        }

        long end2 = System.nanoTime();
        System.out.println(end2-start2);

    }
}