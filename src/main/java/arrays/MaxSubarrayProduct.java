package arrays;

public class MaxSubarrayProduct {

    public static void main(String[] args) {

        int[] arr = {6, -3, -10, 0, 2};

        int maxProd = arr[0];

        int start = 0, end = 0;


        for (int i = 0; i < arr.length; i++) {
            int prod = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int jj = arr[j];
                prod *= jj;
                if (prod > maxProd) {
                    start = i;
                    end = j;
                    maxProd = prod;
                }
            }

        }
        System.out.println(start + " == " + end + " == " + maxProd);


    }
}
