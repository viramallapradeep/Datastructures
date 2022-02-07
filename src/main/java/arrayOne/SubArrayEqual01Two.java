package arrayOne;

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqual01Two {

    public static void main(String[] args) {

        int[] a = {1, 0, 0, 1, 0, 1, 1};

        int sum = 0;
        int count = 0;


        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                a[i] = -1;

            sum += a[i];

            if (map.containsKey(sum) || sum == 0) {
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }

        }
        System.out.println(count);

    }
}
