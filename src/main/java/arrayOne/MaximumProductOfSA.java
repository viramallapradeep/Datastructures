package arrayOne;

public class MaximumProductOfSA {

    private static int max;

    public static void main(String[] args) {

//	int a[] = {6, -3, -10, 0, 2};

        int[] a = {2, -3, -4, -5, -1, 0};

        int max = 0;

        for (int i = 0; i < a.length; i++) {

            int cuntProd = a[i];

            for (int j = i + 1; j < a.length; j++) {

                max = Math.max(cuntProd, max);

                cuntProd *= a[j];
            }
        }

        System.out.println(max);

    }

}
