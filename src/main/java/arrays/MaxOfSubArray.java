package arrays;

public class MaxOfSubArray {


    public static void main(String[] args) {
        int[] arr = {-2, -7, -4, 4, -2, 5, -5, -3};

        int max = Integer.MIN_VALUE;

        int index1 = 0, index2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int summ = sumArray(arr, i, j);
                if (summ > max) {
                    max = summ;
                    index1 = i;
                    index2 = j;
                }

            }
        }

        System.out.println("max = " + max + " subarray is from " + index1 + " to " + index2);

        //case2
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));


        int max_sum = maxSubArraySum(arr, arr.length);
        System.out.println("Maximum contiguous sum is "
                + max_sum);

    }

    private static int sumArray(int[] arr, int i, int j) {

        int sum = 0;

        for (int k = i; k <= j; k++) {
            sum = sum + arr[k];
        }

        return sum;

    }

    //case2

    static int maxSubArraySum(int[] a) {
//		{-2, -7, -4, 4, -2, 5, 5, -3};
//		0     1   2  3  4   5  6   7
        int max_so_far = Integer.MIN_VALUE,
                max_ending_here = 0;

        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];

            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    //	case3
    static int maxSubArraySum(int[] a, int size)

//	int arr[] = {-2, -7, -4, 4, -2, 5, 5, -3};
    {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

}
