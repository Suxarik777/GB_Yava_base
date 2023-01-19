package GB_Java_API_base.Shared_repo.Lections.L_01.Project_1;

public class types_data_string {
    public static void main(String[] args) {
        String msg ="Hello world"; // один символ занимает в памяти 2 байта

        System.out.println(msg);

        // со строками всё не просто, есть сложности с хранением памяти
        // есть ПриветМир => 9 символов * 2 байта получаем выуделение 18 байт
        // и вот как потом положить доп. восклицательный знак - ответ позже

        // находим в строке символ ВНИМАНИЕ по индексу не ищет
        String s = "qwerty";
        s.length(); // определение длины
        s.charAt(2); //-> e -> обращение у конкретному символу строки
    }
}
