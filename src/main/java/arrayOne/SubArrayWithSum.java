package arrayOne;

public class SubArrayWithSum {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 7, 5};
        // 1
        // 1,2
        // 1,2,3
        // 2,3

        int sum = 12;

        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                if (sum == sum(a, i, j)) {
                    System.out.println(i + "===" + j);

                    break;
                }

            }

        }

    }

    private static int sum(int[] a, int i, int j) {

        int sum = 0;

        for (int k = i; k <= j; k++) {
            sum += a[k];
        }

        return sum;
    }

}
