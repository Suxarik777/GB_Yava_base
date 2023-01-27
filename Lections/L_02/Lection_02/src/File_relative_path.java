
//Как обойти ограничения абсолютного пути и сделать доступ к файлу кросплатформенным

// Пример System.dir

import java.io.File;
public class File_relative_path {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath ());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt


        //// Обработка ошибок при работе с файломи

//        try {
//            Код, в котором может появиться ошибка
//        } catch (Exception e) {
//            Обработка, если ошибка случилась
//        }
//        finally {
//            Код, который выполнится в любом случае
//        }




    }
}



