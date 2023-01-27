public class String_StringBuilder {
    public static void main(String[] args) {

        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        // ≈41000 ms

        //Но благодаря встроенному функционалу Api Java
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        // ≈9 ms


//        Функционал строки с помощью StringBuilder
//
//        concat():                               объединение строк
//        valueOf():                             Object в строковое представление (завязан на toString())
//        join():                                    объединяет набор строк в одну с учетом разделителя
//        charAt():                               получение символа по индексу
//        indexOf():                             первый индекс вхождения подстроки
//        lastIndexOf():                       последний индекс вхождения подстроки
//        startsWith()/endsWith():     определяет, начинается/заканчивается ли строка с подстроки
//        replace():                              замена одной подстроки на другую

//        trim(): удаляет начальные и конечные пробелы
//        substring(): возвращает подстроку, см.аргументы
//        toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
//        сompareTo(): сравнивает две строки
//        equals(): сравнивает строки с учетом регистра
//        equalsIgnoreCase(): сравнивает строки без учета регистра
//        regionMatches(): сравнивает подстроки в строках
    }
}