package arrayOne;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {


    public static void main(String[] args) {

        int[] a = {-1, 3, -1, 2, 2};
		
		
	/*	
	 * case 1 O(n2)
	 for (int i = 0; i < a.length; i++) {
			int count = 1;
			
				for (int j = 0; j < a.length; j++) {
					
					if ((i!=j) && a[i] == a[j]) {
						count++;
					}
				}
				if (count==1) {
					System.out.println(count+" === " + a[i]);
				}
		}*/


        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            if (hMap.containsKey(a[i])) {
                int val = hMap.get(a[i]);
                hMap.put(a[i], val + 1);
            } else {
                hMap.put(a[i], 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println("non-Rep " + entry.getKey());
            }

        }

    }

}
