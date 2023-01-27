
//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.


import java.io.FileWriter;
import java.io.IOException;

public class Ex_04_recording_file {


    public static StringBuilder testTestTest(String test_st){
        StringBuilder testTestTest = new StringBuilder();
        int count = 100; // количество повторений слова
        for (int i = 0; i < count; i++) testTestTest.append(test_st);
        return testTestTest;
    }

    public static void fileRecording (StringBuilder testTestTest){
        try (FileWriter fw = new FileWriter("file.txt", false)){
            // при true будет пытаться найти или создаст новый
            // при false просто перезапишет
            fw.append(testTestTest);
            fw.flush();              // принудительная запись в конце
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) {
        String test_str = "TEST";
        StringBuilder testTestTest_sb = new StringBuilder(testTestTest(test_str));
        fileRecording(testTestTest_sb);
        System.out.println("Файл записан");
    }
}
