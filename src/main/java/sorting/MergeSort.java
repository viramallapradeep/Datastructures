package sorting;

import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(int[] a, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int k = start;

        int[] b = new int[end + 1];

        while (left <= mid && right <= end) {
            if (a[left] <= a[right]) {
                b[k++] = a[left++];
            } else {
                b[k++] = a[right++];
            }
        }

        if (left > mid) {
            while (right <= end) {
                b[k++] = a[right++];
            }
        } else {
            while (left <= mid) {
                b[k++] = a[left++];
            }
        }

        for (int z = start; z <= end; z++)
            a[z] = b[z];

    }

    public static void main(String[] args) {


        int[] a = {3454, 5454, -1, 4, -8, 6, 022, 1, 0};

        mergeSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));


    }

}
