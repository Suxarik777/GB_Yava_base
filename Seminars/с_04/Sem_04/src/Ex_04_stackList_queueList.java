
// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.


import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Ex_04_stackList_queueList {

    public static Stack<String> stackMethod(String[] array){
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.add(array[i]);
        }
        return stack;
    }

    public static Queue<String> queueMethod (String[] array){
        Queue <String> queue = new LinkedList<String>();

        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        return queue;
    }

    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5"};
        Stack<String> stack = stackMethod(array);
        Queue <String> queue= queueMethod(array);

        while(!stack.isEmpty()){
            System.out.println(stack.pop()); // удаление
        }
        System.out.println();

        while(!queue.isEmpty()){
            System.out.println(queue.remove()); // удаление
        }


//        System.out.println(stack); // [1, 2, 3, 4, 5]
//        System.out.println(queue); // [1, 2, 3, 4, 5]
//
//        stack.pop();
//        System.out.println(stack); // [1, 2, 3, 4]
//
//        queue.remove();
//        System.out.println(queue); // [2, 3, 4, 5]
    }
}
