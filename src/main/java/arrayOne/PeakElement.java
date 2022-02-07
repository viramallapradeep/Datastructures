package arrayOne;

public class PeakElement {

    public static void main(String[] args) {

        int[] a = {3, 4, 3, 5, 10, 20, 15};

        for (int i = 0; i < a.length - 2; i++) {

            if (a[i] < a[i + 1] && a[i + 1] > a[i + 2]) {

                System.out.println(a[i + 1]);

            }

        }

    }

}
