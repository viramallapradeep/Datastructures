package arrayOne;

import java.util.HashMap;
import java.util.Map;

public class CommonElementInArrays {

    public static void main(String[] args) {

        int[] a = {1, 5, 10, 20, 70, 80};
        int[] b = {6, 7, 20, 80, 70};
        int[] c = {3, 70, 15, 20, 30, 70, 80, 120};


//		case 1
/*		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < c.length; j++) {
				if (b[i] == c[j])  {
					count++;
				}
			}
			
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j])  {
					count++;
				}
			}
			
			if (count > 1) {
				System.out.println(b[i]);
			}
		}*/

        //case2
        Map<Integer, Integer> hMap = new HashMap<>();


        for (int i = 0, j = 0, k = 0; j < b.length || i < a.length || k < c.length; j++, i++, k++) {
            if (j < a.length) {
                insert(a, hMap, i);
            }

            if (j < b.length) {
                insert(b, hMap, j);
            }

            if (k < c.length) {
                insert(c, hMap, k);
            }

        }


        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {

            if (entry.getValue() == 3) {

                System.out.println("cpmmon elements " + entry.getKey());
            }
        }
    }

    public static void insert(int[] a, Map<Integer, Integer> hMap, int i) {

        if (hMap.containsKey(a[i])) {
            int val = hMap.get(a[i]);
            hMap.put(a[i], val + 1);
        } else {
            hMap.put(a[i], 1);
        }
    }

}
