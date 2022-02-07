package arrays;

import java.util.Arrays;

public class OnePositiveAndOneNegetive {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -4, -1, 4};

        int[] copyArr = new int[arr.length];

        int count = 0;
        int negCount = 0;
        int g = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negCount++;
                copyArr[g++] = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                copyArr[g++] = arr[i];
            }

        }

        System.out.println(Arrays.toString(copyArr));

        int i = 0;
        int k = negCount;
        int n = 0;

        while (i < negCount && k < arr.length) {

            arr[n++] = copyArr[i++];
            arr[n++] = copyArr[k++];
        }

        while (k < arr.length) {
            arr[n++] = copyArr[k++];
        }

        while (i < negCount) {
            arr[n++] = copyArr[i++];
        }

        System.out.println(Arrays.toString(arr));


    }


}
