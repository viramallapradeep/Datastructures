package arrayOne;

import java.util.Arrays;

public class AlternatePositiveNegetive2 {

    public static void main(String[] args) {

        int[] a = {9, 4, 2, -1, -5, 10, 5, -3, 2, -44};

//		[-1, 9, -5, 4, -3, 2, -44, 10, 5, 2]


        int nc = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                nc++;
            }
        }

        int[] p = new int[a.length - nc];

        int[] n = new int[nc];

        int anc = 0, apc = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {
                n[anc++] = a[i];
            } else {
                p[apc++] = a[i];
            }

        }

        Arrays.fill(a, 0);
        int i = 0, kn = 0, jp = 0;

        while (kn < n.length || jp < p.length) {

            if (kn < n.length) {
                a[i++] = n[kn++];
            }

            if (jp < p.length) {
                a[i++] = p[jp++];
            }
        }

        System.out.println(Arrays.toString(a));

    }

}
