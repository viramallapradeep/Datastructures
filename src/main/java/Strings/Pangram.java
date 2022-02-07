package Strings;

public class Pangram {

    public static void main(String[] args) {

//		String str=	"Aawdsjog,flickquartz,vex nymph";
        String str = "Abcdefghijklmnopqrstuvwxyz";

        int count = 0;
        for (int i = 97; i <= 122; i++) {

            if (str.contains(((char) i) + "")) {
                count++;
            } else if (str.contains(((char) i + "").toUpperCase())) {
                count++;
            }
        }

        System.out.println(count);


    }

}
