package arrayOne;

import java.util.HashMap;
import java.util.Map;

public class MaxOnesInRow {

    public static void main(String[] args) {


        int[][] a = {{1, 2, 3},
                {0, 1, 1},
                {1, 1, 1},
                {16, 17, 18}};

        int count = 0;

        int row = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            int temp = 0;
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] == 1) {
                    temp++;
                }
            }
            if (temp > count) {
                count = temp;
                row = i;
            }

        }

        System.out.println(row);


    }
}
