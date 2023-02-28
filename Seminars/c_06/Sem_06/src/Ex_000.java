// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.


import java.util.*;

public class Ex_000 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 2, 4, 5, 6, 3};
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr)); // массив превращаем в лист и прокидываеим в хэш сэт
        set1.add(10);
        set1.remove(5);

        Iterator <Integer> iterator = set1.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        LinkedHashSet<Integer> linkSet = new LinkedHashSet<>(Arrays.asList(arr));
        Iterator <Integer> iterator2 = linkSet.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next() + " ");
        }

        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        Iterator<Integer> iterator3 = set3.iterator();
        while(iterator3.hasNext()){
            System.out.print(iterator3.next() + " ");
        }

    }















}