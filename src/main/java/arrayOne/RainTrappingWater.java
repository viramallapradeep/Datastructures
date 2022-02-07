package arrayOne;

public class RainTrappingWater {

    static long trappingWater(int[] a, int n) {

        int k = 1;

        long trp = 0;

        while (k < n) {

            int lm = 0;

            int c = k;

            while (c >= 0) {
                if (a[c] > lm) {
                    lm = a[c];
                }
                c--;
            }

            int d = k;
            int rm = 0;
            while (d < n) {
                if (a[d] > rm) {
                    rm = a[d];
                }
                d++;
            }
            trp += (Math.min(lm, rm) - a[k]);

            k++;
        }

        return trp;
    }


    public static void main(String[] args) {

        int[] a = {3, 0, 4, 2, 0, 4};

//		TC O(n2)

        System.out.println(trappingWater(a, a.length));


    }

}
