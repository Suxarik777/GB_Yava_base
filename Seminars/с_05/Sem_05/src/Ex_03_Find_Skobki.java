// Написать программу, определяющую правильность расстановки скобок в выражении.
//Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Ex_03_Find_Skobki {

    public static boolean FindSkobki(){
        String s1 = "[a+(1*3)]";
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');

        Stack<Character> states = new Stack<>();

        for(int i=0; i<s1.length(); i++){
            char el = s1.charAt(i);
            // если нашли такой ключ
            if(pairs.containsKey(el)){
                //закидываем значение
                states.push(pairs.get(el));
            }
            //если нашли значение
            else if(pairs.containsValue(el))
                if(states.isEmpty()) // если там пустое значение --- это сделано, чтобы исключить ошибку
                                    // при условии, что в конце много скобок
                    return false;
                else if (el != states.pop())
                    return false;
        }
        return states.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(FindSkobki());
    }

}
