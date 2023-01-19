package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

// неявная типизация, если не знаешь что положишь
public class types_data_var_getType {
    public static void main(String[] args) {
        var i = 123;

        // но при компиляции будет подставлен то тип данных который наиболее подходящий

        // нельзя в одну и туже переменую var явно разные значения пихать
        // например положить double а потом попробовать запихнуть string

        //System.out.println(getType(a)) - посмотреть тип данных

        var a = 123;
        System.out.println(a);  // 123
        var d = 123.456;
        System.out.println(d);  // 123.456
        System.out.println(getType(a));  // Integer
        System.out.println(getType(d));  // Double
        d = 1022;
        System.out.println(d);  // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double
    }
    static String getType(Object o){            // это статический член класса
        return o.getClass().getSimpleName();
    }
}