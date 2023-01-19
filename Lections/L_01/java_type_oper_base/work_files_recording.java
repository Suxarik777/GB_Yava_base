package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;


//импортируем pip
import java.io.FileWriter;
import java.io.IOException;

// СОЗДАНИЕ ЗАПИСЬ ДОЗАПИСЬ
public class work_files_recording {
    public static void main(String[] args) {
        // создаём переменную в которую кладём функционал в функции
        // создаём экземпляр класса fw, который мы должны идентифицировать при помощи конструктора
        try (FileWriter fw = new FileWriter("file.txt", false)){ //true || false нужно ли дописывать файл
                                                                // при true будет пытаться найти или создаст новый
                                                                // при false просто перезапишет
            fw.write("line1");  // в простом случае write и append одно и тоже
            fw.append('\n');
            fw.append("222222");
            fw.append('\n');
            fw.write("line 3");
            fw.flush();                         // принудительная запись в конце
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
