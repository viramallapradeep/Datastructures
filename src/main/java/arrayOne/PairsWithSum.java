package arrayOne;

public class PairsWithSum {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 0, 6, 7, 8};

        int sum = 1;

        int cSum = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j <= a.length; j++) {

                if (cSum == sum) {
                    System.out.println(i + " -- " + (j - 1));

                }

                if (j == a.length) {
                    break;
                }

                cSum = a[i] + a[j];

            }

        }


    }

}
