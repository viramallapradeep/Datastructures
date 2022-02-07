package arrayOne;

import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {


        int[] a = {1, 2, 4, 6, 3, 7, 5};

        System.out.println(Arrays.toString(a));
        int d = 4;

        boolean f = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == d && f) {
                f = false;
            }

            if (!f) {
                a[i] = a[i + 1];
            }
        }
        a[a.length - 1] = Integer.MIN_VALUE;


        System.out.println(Arrays.toString(a));

    }

}
