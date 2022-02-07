package arrays;

public class SubArrayWithZeroSum {


    public static void main(String[] args) {

        int[] arr = {1, 4, 2, -3, 1, 6};

//		[5, 4, 6, 7, 8, 14];


        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if (sum(arr, i, j) == 0) {
                    found = true;
                    System.out.println(i + "=" + j);
                    break;
                }

            }

            if (found) {
                System.out.println("found");
                break;

            }
        }


    }

//	       int arr[]= {4, 2, -3, 1, 6};

    private static int sum(int[] arr, int i, int j) {

        int sum = 0;

        for (int k = i; k <= j; k++) {
            sum = sum + arr[k];
        }

        return sum;


    }

}
