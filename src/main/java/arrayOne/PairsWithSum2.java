package arrayOne;

import java.util.HashMap;
import java.util.Map;

public class PairsWithSum2 {

    public static void main(String[] args) {

        int[] a = {1, 1, 1, 1};

        int k = 2;


        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 0);
            }
        }


        for (int j : map.keySet()) {

            if (map.containsKey(k - j)) {
                count +=map.get(k-j);
            }

        }

        System.out.println(count);


    }

}
