package arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] kkk) {

        int[] array = {1, 2, 3, 4, 5};

        //51234
        //45123
        //34512


//		int j=1001 % 5;
        int j = 1;

        int h = 0;

        int[] rotatedArray = new int[array.length];

        for (int k = rotatedArray.length - j; k < rotatedArray.length; k++) {
            rotatedArray[h++] = array[k];
        }

        for (int i = 0; i < array.length - 1; i++) {
            rotatedArray[h++] = array[i];

        }

//		System.out.println(Arrays.toString(rotatedArray));

        int[] array1 = {1, 2, 3, 4, 5, 6};

        int rot = 6;

//		TC O(n^2)

        while (rot > 0) {

            int temp = array1[array1.length - 1];

            for (int i = array1.length - 1; i > 0; i--) {

                array1[i] = array1[i - 1];
            }

            array1[0] = temp;
            rot--;

        }

//			System.out.println(Arrays.toString(array1));

        int k = 1;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        reverseArray(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

        reverseArray(arr, 0, arr.length - 1 - k);

        System.out.println(Arrays.toString(arr));

        reverseArray(arr, arr.length - k, arr.length - 1);

        System.out.println("gg=" + Arrays.toString(arr));

    }

    public static void reverseArray(int[] arr, int min, int max) {

        while (min < max) {
            int temp = arr[max];
            arr[max] = arr[min];
            arr[min] = temp;
            min++;
            max--;
        }


    }

}
