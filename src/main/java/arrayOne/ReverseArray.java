package arrayOne;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        //case1 taking extra memory (external)
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] b = new int[a.length];

        int k = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            b[k++] = a[i];

        }

//		System.out.println(Arrays.toString(b));

        //case2 internal ,swaping first and last

        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0, j = c.length - 1; i <= c.length / 2; i++, j--) {

            int temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }

//		System.out.println(Arrays.toString(c));

//		case3 recursion 


        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int s = 0;
        int e = d.length - 1;

        swapR(d, s, e);

        System.out.println(Arrays.toString(d));

    }


    public static void swapR(int[] a, int start, int end) {

        if (start >= end)
            return;

        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        swapR(a, ++start, --end);
    }

}
