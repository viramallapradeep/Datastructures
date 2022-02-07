package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {6, 5, 5, -4, 3, 0, 2, 1, 0};

        for (int i = 0; i < a.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] <= a[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }

        }

        System.out.println(Arrays.toString(a));

    }

}
