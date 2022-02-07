package arrays;

import java.util.Arrays;

public class UnionNInterSection {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5, 7};

        int[] arr2 = {2, 3, 5, 6};

        int[] unionArray = new int[arr1.length + arr2.length];

        int[] interArray = new int[arr2.length];
        int y = 0;
        int d = 0;

        for (int j = 0; j < arr1.length; j++) {
            unionArray[d++] = arr1[j];
        }


        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < unionArray.length; j++) {

                if (arr2[i] == unionArray[j]) {
                    found = true;
                    break;
                }

            }

            if (found) {
                interArray[y++] = arr2[i];
            } else {
                unionArray[d++] = arr2[i];
            }


        }


        System.out.println(Arrays.toString(interArray));
        System.out.println(Arrays.toString(unionArray));


    }

}
