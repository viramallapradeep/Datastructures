package arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int negNum = 0;

        int[] arr = {-2, -3, -5, -4, 6, 7, 1, -45, -34, -23};
        int[] copyArray = new int[arr.length];

        int[] finalArray = new int[arr.length];

        int d = 0;
        int count = 0;
        for (int i = 0; i < copyArray.length; i++) {

            if (arr[i] < 0) {
                count++;
                copyArray[d++] = arr[i];
            }

        }

        for (int i = 0; i < copyArray.length; i++) {
            if (arr[i] >= 0) {
                copyArray[d++] = arr[i];
            }
        }

        System.out.println("lll==" + Arrays.toString(copyArray));


        int lim = count;

        int n = 0;
        for (int i = 0; i < finalArray.length - 1 && n < finalArray.length; i++) {

            finalArray[n++] = copyArray[i];
            n++;

        }
        int m = 1;
        for (int i = count; i < finalArray.length && m < finalArray.length; i++) {

            finalArray[m++] = copyArray[i];
            m++;

        }


        System.out.println("kkk==" + Arrays.toString(finalArray));

        int g = 1;

        for (int i = 30; i > 0; i--) {

            g *= i;

        }
        System.out.println(g);


    }

}
