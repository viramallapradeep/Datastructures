package arrays;

public class LargestThreeElements {


    public static void main(String[] kk) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 99};
        int max = arr[0];
        int r = 3;
        int k = 0;

        while (r > 0) {

            max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    k = i;
                }
            }

            System.out.println(max);
//			System.out.println(k);
            arr[k] = Integer.MIN_VALUE;
            r--;

        }


    }

}
