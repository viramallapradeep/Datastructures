package arrays;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {

        //case1
        int[] array = {23, 2, 3, 34, 87, 98, 32, 54, 12, 677};
        int len = array.length;

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ",");
        }


        //case2
        int[] array2 = {23, 2, 3, 34, 87, 98, 32, 54, 12, 677};

        for (int i = 0; i < len / 2; i++) {
            int temp = array2[i];
            array2[i] = array2[len - 1 - i];
            array2[len - 1 - i] = temp;
        }
//		  System.out.println();
//		  System.out.println(Arrays.toString(array2));

        //case3

        int[] array3 = {23, 2, 3, 34, 87, 98, 32, 54, 12, 677};

        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            int temp = array3[i];
            array3[i] = array3[j];
            array3[j] = temp;
        }

        System.out.println();
        System.out.println(Arrays.toString(array3));


    }

}
