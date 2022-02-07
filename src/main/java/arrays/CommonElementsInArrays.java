package arrays;

import java.util.Arrays;

public class CommonElementsInArrays {

    public static void main(String[] k) {
        int[] ar1 = {1, 5, 10, 20, 40, 80};

        int[] ar2 = {6, 7, 20, 80, 100};

        int[] ar3 = {3, 4, 15, 20, 30, 70, 80, 120};

        int[] ar4 = {3, 4, 15, 20, 30, 70, 120};

        Object[] arrays = {ar1, ar2, ar3, ar4};

        int[] finalArray = new int[10];

        int v = 0;

        //1
        for (int i = 0; i < ar1.length; i++) {
            int count1 = 0;
            //2
            for (int x = 1; x < arrays.length; x++) {

                int[] temp = (int[]) arrays[x];
                //3
                for (int j = 0; j < temp.length; j++) {
                    if (ar1[i] == temp[j]) {
                        count1++;
                        break;
                    }
                }
            }

            if (count1 == arrays.length - 1) {
                finalArray[v++] = ar1[i];
            }

        }

        System.out.println(Arrays.toString(finalArray));

    }

}
