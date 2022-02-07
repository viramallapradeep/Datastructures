package arrayOne;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZer0 {

    public static void main(String[] args) {

        int[] a = {0, 2, -3, 1, 6};

        int sum = 1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            int cs = 0;

            for (int j = i; j < a.length; j++) {

                cs += a[j];

                if (cs == sum) {
                    System.out.println("hhh");
                }

            }

        }


    }

}
