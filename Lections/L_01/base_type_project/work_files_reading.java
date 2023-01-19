package GB_Java_API_base.Shared_repo.Lections.L_01.Project_1;


import java.io.FileReader;
import java.io.BufferedReader;

// Чтение файла
public class work_files_reading {
    // обрати внимание! другой метод, чтобы в конце не дописывать перепроверку catch (IOException ex) (см recording)
    // мы одидаем что метод main закончится проверкой ошибкой
    // таким образом не нужны try и cath
    public static void main(String[] args) throws Exception {
        // вариант посимвольно
        FileReader fr = new FileReader("file.txt");
        int c;

        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }

        }

        // варинат построчно
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str); // вспоминаем маски
        }
        br.close();

    }
}
