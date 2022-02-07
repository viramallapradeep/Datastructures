package arrays;

class NFactorial {

    public static void main(String[] args) {
        int v = 1000;

        int[] a = new int[10000];

        a[0] = 1;

        int asize = 1;

        for (int x = 2; x <= v; x++) {
            asize = multiply(a, x, asize);
        }

        for (int i = asize - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }

    }

    private static int multiply(int[] a, int x, int asize) {

        int carry = 0;
        for (int i = 0; i < asize; i++) {

            int res = a[i] * x + carry;
            carry = res / 10;
            a[i] = res % 10;
        }

        while (carry != 0) {
            a[asize] = carry % 10;
            carry = carry / 10;
            asize++;
        }
        return asize;
    }

}
