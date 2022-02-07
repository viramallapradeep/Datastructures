package arrayOne;

import java.util.Arrays;

public class ZerosOnesTwos {


    public static void main(String[] args) {

        int[] a = {0, 2, 1, 2, 0, 0, 1, 2, 1, 2};
        int count0 = 0, count1 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count0++;
            } else if (a[i] == 1) {
                count1++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i < count0) {
                a[i] = 0;
            } else if (i >= count0 && i < count1 + count0) {
                a[i] = 1;
            } else {
                a[i] = 2;
            }


        }

        System.out.println(Arrays.toString(a));

    }

}
