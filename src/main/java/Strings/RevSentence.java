package Strings;

public class RevSentence {

    public static void main(String[] args) {

        String s = "i.like.this.program.very.much";
        String[] sr = s.split("\\.");

        int len = sr.length;

        String ss = "";
        for (int i = len - 1; i >= 0; i--) {
            ss += sr[i] + ".";
        }
        System.out.println(ss);

        ss = ss.substring(0, ss.length() - 1);

        System.out.println(ss);

    }

}
