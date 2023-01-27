//
//// работа с папками, похожа на работу с файлами, смотри на File_Error_try_catch_finally
//
//import java.io.File;
//
//public class dir_file_work_folder {
//    String pathProject = System.getProperty("user.dir");
//    String pathDir = pathProject.concat("/files");
//    File dir = new File(pathDir);
//    System.out.println(dir.getAbsolutePath ());
//
//    if (dir.mkdir()) {
//        System.out.println("+");
//    } else {
//        System.out.println("-");
//    }
//    for (String fname : dir.list()) {
//        System.out.println(fname);
//    }
//}
