package arrayOne;

import java.util.Arrays;

public class AlternatePosAndNegWithOrder {

    private static void rotArr(int[] a, int i, int j) {

        int temp = a[j];

        for (int k = j; k > i; k--) {

            a[k] = a[k - 1];
        }

        a[i] = temp;
    }


    public static void main(String[] args) {

        int[] a = {4, 6, -1, -3};

        System.out.println(Arrays.toString(a));
        int i = 0;
        int j = 1;


        while (i < a.length && j < a.length) {

            if (i % 2 == 0 && a[i] >= 0) {
                i = i + 2;
                j = i + 1;
            } else if (a[j] >= 0) {
                rotArr(a, i, j);
                j++;
            } else {
                j++;
            }
        }


        System.out.println(Arrays.toString(a));
        i = 1;
        j = 2;

        while (i < a.length && j < a.length) {

            if (i % 2 == 1 && a[i] < 0) {
                i = i + 2;
                j = i + 1;
            } else if (a[j] < 0) {
                rotArr(a, i, j);
                j++;
            } else {
                j++;
            }
        }

        System.out.println(Arrays.toString(a));

    }

}