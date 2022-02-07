package arrays;

import java.util.Arrays;

public class ReverseArrayByRecursion {


    //TC O(n)
    public static void recurseArray(int[] array, int max, int min) {

        if (max > min) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
            recurseArray(array, max - 1, min + 1);
        }

    }

    public static void main(String[] args) {

        int[] array = {23, 2, 3, 34, 87, 98, 32, 54, 12, 677};

        recurseArray(array, array.length - 1, 0);
        System.out.println(Arrays.toString(array));
    }

}
