package Strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] a = {"g", "gees", "geek", "geekzer"};

        int n = a.length;

        String st = "-1";

        for (int i = 0; i < a[0].length(); i++) {

            String s = a[0].substring(0, i + 1);
            int count = 0;

            for (int j = 0; j < n; j++) {

                if (s.length() > a[j].length()) {
                    break;
                }

                String k = a[j].substring(0, i + 1);

                if (k.equals(s)) {
                    count++;
                } else {
                    break;
                }
                if (count == a.length) {
                    st = s;
                }

            }

        }

        System.out.println(st);


    }

}
