// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper",  t = "title"


import java.util.HashMap;
import java.util.Map;

public class Ex_02_IsIzomorph_sravnenie_slov {

    public static boolean IsIzomorph() {
        Map<Character, Character> pairs = new HashMap<>(); //Character - ссылочные символы
        String s1 = "add";
        String s2 = "egg";

        // суть в том, чтобы не произошло совпадения занятости первой буквы с последующей
        // s = "paper", t = "title'
        // p -> t
        // a -> i
        // p -> t // уже было просто oq
        // e -> l
        // r -> e

        // представим что к букве p добавляю q
        // p -> q FALSE буква p занята p -> t


        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;

        for (int i = 0; i < s1.length(); i++) {
            Character a = s1.charAt(i);  // символ первого слова
            Character b = s2.charAt(i); // символ второго слова
            // если в map уже есть ключь "a", то тогда значение по ключу "а"
            // то значение должно уже совпадать с ранее введёным "b"
            // еще раз e у нас уже есть a -> b если новая a-b будет совпадать то ок

            if(pairs.containsKey(a) && pairs.get(a) != b){
                return false;
            }else{
                pairs.put(a,b);
            }


        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(IsIzomorph());
    }
}
