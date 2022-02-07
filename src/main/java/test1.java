public class test1 {

    public static boolean isPrime(int n) {

        if (n == 1)
            return false;

        boolean flag = true;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                flag = false;

        return flag;
    }

    public static int nthUglyNumber(int k) {

        if (k <= 0)
            return 0;
        if (k == 1)
            return 1;

        int count = 0;

        int u = 0;
        int i = 1352;

        for (i = k / 2; i <= 23232323; i++) {

            int n = i;

            while (n % 2 == 0)
                n = n / 2;

            while (n % 3 == 0)
                n = n / 3;

            while (n % 5 == 0)
                n = n / 5;


            if (n == 1) {
                count++;
            }

            if (count == k) {
                u = i;
                break;
            }
        }

        return u;
    }

    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;

        while (n % 2 == 0)
            n = n / 2;

        while (n % 3 == 0)
            n = n / 3;

        while (n % 5 == 0)
            n = n / 5;

        return n == 1;
    }

    public static void main(String[] args) {

        int[] a = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        int index = -1;
        int l = 0, h = a.length - 1;

        int key = 3;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (key == a[mid]) {
                index = mid;
                break;
            } else if (a[l] <= a[mid]) {

                if (key >= a[l] && key <= a[mid]) {
                    h = mid - 1;
                }

            } else {
                l = mid + 1;
            }

        }


        System.out.println(index);


    }


}