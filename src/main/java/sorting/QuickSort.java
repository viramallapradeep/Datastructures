package sorting;

import java.util.Arrays;

public class QuickSort {


    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int div = partition(a, low, high);
            quickSort(a, low, div - 1);
            quickSort(a, div + 1, high);
        }

    }

    static int partition(int[] a, int low, int high) {

        int pivot = a[low];

        int lb = low;
        int hb = high;

        while (lb < hb) {

            while (lb <= high && a[lb] <= pivot)
                lb++;

            while (hb >= low && a[hb] > pivot)
                hb--;

            if (lb < hb) {
                int temp = a[lb];
                a[lb] = a[hb];
                a[hb] = temp;
            }

        }
        int temp = a[low];
        a[low] = a[hb];
        a[hb] = temp;

        return hb;

    }

    public static void main(String[] args) {

        int[] a = {3454, 5454, -1, 4, -8, 6, 022, 1, 0};

        quickSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));

    }

}
