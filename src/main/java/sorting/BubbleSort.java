package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {6, 5, -5, -4, 3, 0, 2, 1, 0};

        for (int i = 0; i < a.length; i++) {

            boolean flag = false;

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] >= a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }

            }

            if (!flag) {
                break;
            }

        }

        System.out.println(Arrays.toString(a));
    }

}
