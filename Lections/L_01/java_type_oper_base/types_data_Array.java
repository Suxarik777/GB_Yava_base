package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;


public class types_data_Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr);
        System.out.println(arr.length); //10

        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length); //5

        // обращение к отдельному функционалу массива
        System.out.println(arr[3]); //4

        arr[3] = 13;
        System.out.println(arr[3]);

        //нюанс джавы
        //int[] ar2; // можно
        //int ar3[]; // тоже можно но есть отличи, отсылки в сторону языка C++
    }
}