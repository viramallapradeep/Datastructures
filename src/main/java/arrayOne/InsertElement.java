package arrayOne;

import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 6, 3, 7, 5};

        int[] b = new int[a.length + 1];

        int k = 0;

        for (int i = 0; i < b.length; i++) {

            if (i == 3) {
                b[i] = 10;
            } else {
                b[i] = a[k++];
            }
        }

        System.out.println(Arrays.toString(b));

    }

}
