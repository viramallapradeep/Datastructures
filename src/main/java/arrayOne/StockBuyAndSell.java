package arrayOne;

public class StockBuyAndSell {

    public static void main(String[] args) {

        int[] a = {100, 180, 260, 310, 40, 535, 695};
        int n = a.length;

        int max = 0;

        for (int i = 0; i < n - 1; i++) {

            if ((a[i] < a[i + 1])) {
                max += a[i + 1] - a[i];
            }

        }

        System.out.println(84923);

    }

}
