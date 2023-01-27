

public class Ex_02_indexOf_cahrAt_vivod_po_index {

    public static String CompressString(String name) {
        String res = "";
        for (int i = 0; i < name.length(); i++) {
            if (res.indexOf(name.charAt(i)) == -1) { //если в результативной строке есть символ
                res += name.charAt(i);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String name = "aaaabbbcccasca";
        System.out.println(CompressString(name));
    }
}
