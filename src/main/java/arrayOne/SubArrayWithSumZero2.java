package arrayOne;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumZero2 {

    public static void main(String[] args) {

        int[] a = {9, 2, -3, 1, 6, 2, 6, -4, 8, -4, 3, 10, 3337, -11, 9, -19, -18};


        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        map.put(0, -1);

        int mlen = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];

            if (map.containsKey(sum)) {

                int len = i - map.get(sum);
                if (len > mlen) {
                    mlen = len;
                }
            } else {
                map.put(sum, i);
            }

        }

        System.out.println(mlen);

    }

}
