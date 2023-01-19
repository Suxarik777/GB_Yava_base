package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;


public class operator_switch {
    public static void main(String[] args) {
        int mounth = 2; // поставлю 2 провалимся в mistake
        String text = "";

        switch (mounth){  // чему равна переменная и пошли проверять
            case 1:              // этому?
                text = "Autumn";
                break;
            case 2:
                text = "Привет";
                break;
            //...
            //case two
            //...
            //необязательный оператор
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);


        // также можно устроить проверку от до
        int search = 5;
        String text2 = "";

        switch (search){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                text2 = "оно";
                break;
            case 7:
                text2 = "не оно";
                break;
            //default: не обязательна действует как else
        }
        System.out.println(text2);

    }
}
