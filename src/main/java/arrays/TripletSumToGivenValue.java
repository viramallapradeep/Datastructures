package arrays;

public class TripletSumToGivenValue {


    public static void main1(String[] args) {


        int[] a = {12, 3, 4, 1, 6, 9};
        int sum = 24;


        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                for (int k = j; k < a.length; k++) {

                    if (sum == a[i] + a[j] + a[k]) {

                        System.out.println(a[i] + "==" + a[j] + "==" + a[k]);
                    }
                }
            }
        }

    }


    public static void main(String[] k) {
//		int arr[] = {1, 3, 9, 12, 6, 4}, sum = 24;

        int[] arr = {1, 3, 4, 6, 9, 12};
        int sum = 24;


        for (int i = 0; i < arr.length; i++) {

            int sp = i + 1, ep = arr.length - 1;

            while (sp < ep) {

                int tripSum = arr[i] + arr[sp] + arr[ep];
                if (tripSum == sum) {
                    System.out.println("values = " + arr[i] + "," + arr[sp] + "," + arr[ep]);
                    System.out.println("triplet found");
                    break;
                } else if (tripSum > sum) {
                    ep--;
                } else {
                    sp++;
                }

            }

        }

    }


}
