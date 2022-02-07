package Strings;

public class ReverseRec {


    public static String rec(String str, int x, String v) {

        if (x < 0) {
            return v;
        }

        v += str.charAt(x) + "";

        return rec(str, --x, v);
    }


    public static void main(String[] args) {

        String str = "abcdef";

        String v = "";

        System.out.println(rec(str, 5, v));
    }

}
