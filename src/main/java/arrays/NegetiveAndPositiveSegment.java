package arrays;

import java.util.Arrays;

public class NegetiveAndPositiveSegment {

    public static void main(String[] args) {

        int[] array = {222, -12, 11, -13, -5, 6, -7, 5, -3, -6};

        int negNum = 0;
        int[] copyArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < negNum) {
                copyArray[j++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= negNum) {
                copyArray[j++] = array[i];
            }
        }


        System.out.println(Arrays.toString(copyArray));


        int[] array1 = {222, -12, 11, -13, -5, 6, -7, 5, -3, -6};

        for (int i = 0; i < array1.length; i++) {

            for (int k = 0; k < array1.length - 1; k++) {

                if (array1[k] >= negNum) {
                    int temp = array1[k];
                    array1[k] = array1[k + 1];
                    array1[k + 1] = temp;
                }
            }

        }


        System.out.println(Arrays.toString(array1));


    }

}
