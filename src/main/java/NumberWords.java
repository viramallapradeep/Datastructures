public class NumberWords {
    static String[] s = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    public static void main(String[] args) {

        System.out.println(printWord(568));

    }

    public static int printWord(int n) {

        int rev = 0;

        while (n != 0) {

            rev = (rev * 10) + n % 10;
            n = n / 10;

        }
        return rev;
    }

}

