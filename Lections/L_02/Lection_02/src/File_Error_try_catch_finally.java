
// Работа с потенциальными ошибками

import java.io.File;

public class File_Error_try_catch_finally {
    public static void main(String[] args) {
        //        try {
//            Код, в котором может появиться ошибка
//        } catch (Exception e) {
//            Обработка, если ошибка случилась
//        }
//        finally {
//            Код, который выполнится в любом случае
//        }

        try {
            String pathProject = System.getProperty("user.dir"); // текущая папка
            String pathFile = pathProject.concat("/file.txt"); // конкретный файл
            File f3 = new File(pathFile); // связываем переменую по текущему пути
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }

        //второй вариант проверки
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) { // если файл создан (вернулась истина)
                System.out.println("file.created");  // работаем так
            }
            else {
                System.out.println("file.existed"); // работаем по другому
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

//        isHidden(): возвращает истину, если каталог или файл является скрытым
//        length(): возвращает размер файла в байтах
//        lastModified(): возвращает время последнего изменения файла или каталога
//        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
//        listFiles(): возвращает массив файлов и подкаталогов, которые находятся
//        в определенном каталоге
//        mkdir(): создает новый каталог
//        renameTo(File dest): переименовывает файл или каталог
//
//        length(): возвращает размер файла в байтах
//        lastModified(): возвращает время последнего изменения
//        файла или каталога
//        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
//        listFiles(): возвращает массив файлов и подкаталогов, которые
//        находятся в определенном каталоге
//        mkdir(): создает новый каталог
//        renameTo(File dest): переименовывает файл или каталог

    }
}
