package arrays;

import java.util.Arrays;

public class Snippet {


    // Driver code
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};

        int rot = 6;

        while (rot > 0) {
            int temp = array1[array1.length - 1];
            for (int i = array1.length - 1; i > 0; i--) {
                array1[i] = array1[i - 1];
            }
            array1[0] = temp;
            rot--;
        }


        System.out.println(Arrays.toString(array1));


    }
}

