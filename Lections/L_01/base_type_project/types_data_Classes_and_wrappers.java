package GB_Java_API_base.Shared_repo.Lections.L_01.Project_1;

public class types_data_Classes_and_wrappers {
    public static void main(String[] args) {
        int i = 123_555_666; // фишка можно разделять разряды нижним подчеркивание (ни как не влияет)
        System.out.println(Integer.MIN_VALUE); // то есть для того чтобы нам что вызвать к переменной
                                            // нужно использовать обертку (см  таблицу)


        // делаем проверку символа на пренадлежность чего-нибудь
        // принадлежит ли данный символ числу, или букве или большой букве
        // char. не катит
        Character.isDigit('5');

        // находим в строке символ ВНИМАНИЕ по индексу не ищет
        String s = "qwerty";
        s.length(); // определение длины
        s.charAt(2); //-> e -> обращение у конкретному символу строки
    }
}
