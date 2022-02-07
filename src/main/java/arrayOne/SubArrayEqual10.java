package arrayOne;

public class SubArrayEqual10 {

    public static void main(String[] args) {

        int[] a = {1, 0, 0, 1, 0, 1, 1};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = -1;
            }
        }

        long count = 0;

        for (int k = 0; k < a.length; k++) {

            int sum = a[k];

            for (int i = k + 1; i < a.length; i++) {

                sum += a[i];

                if (sum == 0) {
                    count++;
                }

            }

        }

        System.out.println(count);

    }
}
