package patternPrint;

public class Pyramid {


    public static void main(String[] args) {
//		leftPyramid();
//		System.out.println("------------------------------------------------");
//		rightPyramid();
//		centerPyramid();
//		topRightPyramid();
//		topleftPyramid();
//		toprighbottomlefttPyramid();
        jj();


    }

    private static void leftPyramid() {
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int k = n - i; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }


            System.out.println();

        }
    }

    private static void rightPyramid() {

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void centerPyramid() {

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*"); //Print Star
            }

            System.out.println();
        }
        //Newline
    }

    private static void topRightPyramid() {

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void topleftPyramid() {

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

        }
    }

    private static void toprighbottomlefttPyramid() {
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < 5; i++) {

            for (int j = n - 1; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();

        }


    }


    private static void jj() {
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }


}
