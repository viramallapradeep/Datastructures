package arrayOne;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {

        int[] a = {1, 12, 7, 10, 13, 11, 2};


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));

        int count = 1;

        int max = 0;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] + 1 == a[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }


        System.out.println(max);

    }

}
