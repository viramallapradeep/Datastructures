package arrays;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {

        int[] arr = {333, 22222, 33331, 33332, 33333, 5};

        for (int i = 0; i < arr.length; i++) {

            boolean flag = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }

            }

            if (flag)
                break;
        }

        int pointer = arr[0];
        int count = 1;
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (pointer == arr[i + 1]) {
                pointer = arr[i + 1];
                continue;
            }
            if (1 + pointer == arr[i + 1]) {
                pointer = arr[i + 1];
                count++;
            } else {
                pointer = arr[i + 1];
                if (count > max) {
                    max = count;
                }
                count = 1;
            }

        }

        System.out.println(count + " == " + max);
        System.out.println(Arrays.toString(arr));


    }

}
