



public class Task_01_sravnenie_equals {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String (new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1==s3);
        System.out.println(s1.equals(s4));
    }
}
