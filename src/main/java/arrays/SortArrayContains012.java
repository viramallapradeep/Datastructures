package arrays;

import java.util.Arrays;

public class SortArrayContains012 {

    public static void main(String[] args) {

        int[] array = {0, 2, 1, 2, 1, 2, 2, 1, 2, 0, 2, 1, 0, 0, 1, 2, 2, 1};
        int count0 = 0, count1 = 0;
        int x = 0, y = 1, z = 2;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count0++;
            } else if (array[i] == y) {
                count1++;
            }
        }

        int len = array.length;

        count1 = count0 + count1;

        for (int i = 0; i < len; i++) {
            if (i < count0) {
                array[i] = x;
            } else if (i >= count0 && i < count1) {
                array[i] = y;
            } else {
                array[i] = z;
            }


        }
        System.out.println(Arrays.toString(array));

    }

}
