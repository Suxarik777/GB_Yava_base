// Вывести все простые числа от 1 до 1000


public class T_02_Prostie_chisla_1_do_1000 {

    public static boolean checkSimpleNumbers(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;

        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
    public static void main(String[] args) {
        int digit_N = 1000;
        for (int i = 2; i < digit_N; i++) {
            if (checkSimpleNumbers(i))
                System.out.println(i);
        }
    }

}
