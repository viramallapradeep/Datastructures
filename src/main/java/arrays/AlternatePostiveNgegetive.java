package arrays;

public class AlternatePostiveNgegetive {

    public static void main(String[] args) {

        int[] arr = {-3, -44, -4, -5, -6, -5, -46, -47, 4, -8, -7};

        long start = System.currentTimeMillis();
        // some time passes

        int op = -1;

        for (int i = 0; i < arr.length; i++) {

            if (op != -1) {
                if ((arr[op] < 0 && arr[i] >= 0) || (arr[op] >= 0 && arr[i] < 0)) {
                    rotArr(arr, op, i);

                    i = op + 1;
                    op = -1;
                }

            }

            if (op == -1) {
                if ((i % 2 == 0 && arr[i] < 0) || (i % 2 == 1 && arr[i] >= 0)) {
                    op = i;
                }
            }

        }
        long end = System.currentTimeMillis();

        System.out.println((end - start));
    }


    private static void rotArr(int[] arr, int op, int i) {

        int temp = arr[i];

        for (int j = i; j > op; j--) {
            arr[j] = arr[j - 1];
        }
        arr[op] = temp;

    }

}
