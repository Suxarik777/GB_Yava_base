public class arraycopy {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];

        //встроенный метод
        System.arraycopy(a, 0, b, 0, a.length);
        // (первый массив с 0 элемента, второй с 0 количество элементов массива


    }
    // или ручной метод
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
