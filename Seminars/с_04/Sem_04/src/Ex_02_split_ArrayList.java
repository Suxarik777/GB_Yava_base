
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
public class Ex_02_split_ArrayList {

    public static Scanner iScanner = new Scanner(System.in);





    public static void main(String[] args) {

        while(true){
            String str = iScanner.nextLine();
            if (str.equals("")){
                break;
            }

            List<String> names = new LinkedList<>();

            String[] strArr = str.split("-");
            int number = Integer.parseInt(strArr[1]);

            if (strArr[0].equals("print"))
                try {
                    System.out.println(names.get(number));
                    names.remove(number);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            else if (number != names.size()) {
                System.out.println("Incorrect index should be " + names.size());
                continue;
            }
            else names.add(number, strArr[0]);


            names.add(Integer.parseInt(strArr[1]), strArr[0]);
        }

        iScanner.close();
    }
}
