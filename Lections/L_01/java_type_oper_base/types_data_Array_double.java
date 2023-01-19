package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

public class types_data_Array_double {
    public static void main(String[] args) {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item); // ОБРАТИ ВНИМАНИЕ printF
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++++");

        int[][] arr_2 = new int[3][4]; // это не совсем двумерный массив, это массив массивов

        for (int i = 0; i < arr_2.length; i++){
            for (int j = 0; j < arr_2[i].length; j++) {
                System.out.printf("%d ", arr_2[i][j]); // ОБРАТИ ВНИМАНИЕ printF
            }
        }
    }
}
