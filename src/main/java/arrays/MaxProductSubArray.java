package arrays;

public class MaxProductSubArray {


    public static void main(String[] args) {

        int[] arr = {-1, -3, -10, 0, -60};

        int maxProd = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int prodSub = prod(arr, i, j);

                if (prodSub > maxProd) {
                    maxProd = prodSub;
                }
            }

        }
        //case 1
        System.out.println("maxProd == " + maxProd);

        //case2
        kadane(arr);

//		case 3
        main(arr);

    }

    private static int prod(int[] arr, int i, int j) {

        int prod = 1;

        for (int k = i; k <= j; k++) {
            prod *= arr[k];
        }
        return prod;
    }


    private static void kadane(int[] arr) {

        int curMax = arr[0];
        int totalMax = arr[0];

//		{-1, -3, 10 , 0, -60};

        for (int i = 1; i < arr.length; i++) {

            curMax = curMax * arr[i];


            if (curMax > totalMax) {
                totalMax = curMax;
            }


            if (curMax < 0 && ((i + 1) < arr.length && arr[i + 1] > 0)) {
                curMax = 1;
            }


        }

        System.out.println("totalMax == " + totalMax);

    }

    public static void main(int[] a) {

        int mxTot = a[0];
        int curTot = a[0];

        int start = 0;
        int s = 0;
        int end = 0;


        for (int i = 1; i < a.length; i++) {

            curTot = curTot * a[i];

            if (mxTot < curTot) {
                mxTot = curTot;
                end = i;
                start = s;
            }
            if ((curTot < 0 && ((i + 1 < a.length) && a[i + 1] > 0)) || curTot == 0) {
                curTot = 1;
                s = i + 1;

            }


        }

        System.out.println(mxTot);
        System.out.println(start + "  " + end);
    }

}
