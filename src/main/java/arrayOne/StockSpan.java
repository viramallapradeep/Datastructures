package arrayOne;

import java.util.Arrays;

public class StockSpan {

    public static void main(String[] args) {


        int n = 7;
        int[] p = {100, 80, 60, 70, 60, 75, 85};

        int[] op = new int[n];
        op[0] = 1;

        for (int i = 1; i < n; i++) {

            int val = p[i], temp = i - 1, count = 1;
            while (temp >= 0) {

                if (val >= p[temp]) {
                    count++;
                    op[i] = count;
                    temp--;
                } else {
                    op[i] = count;
                    break;
                }

            }
        }

        System.out.println(Arrays.toString(op));
    }

}

