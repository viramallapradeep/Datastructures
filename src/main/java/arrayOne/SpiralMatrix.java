package arrayOne;

import java.util.ArrayList;

public class SpiralMatrix {


    public static void main(String[] args) {


        int[][] a = {{1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
                {13, 14, 15},
                {16, 17, 18}};

        //	System.out.println("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10");

        int rs = 0, cs = 0, rl = 4, cl = 2;

        int tc = 5 * 3;
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        while (list.size() < tc) {

            for (int i = rs, j = cs; j <= cl && list.size() < tc; j++) {
                list.add(a[i][j]);
            }

            rs++;

            for (int i = rs, j = cl; i <= rl && list.size() < tc; i++) {
                list.add(a[i][j]);
            }

            cl--;

            for (int i = rl, j = cl; j >= cs && list.size() < tc; j--) {
                list.add(a[i][j]);
            }

            rl--;

            for (int i = rl, j = cs; i >= rs && list.size() < tc; i--) {
                list.add(a[i][j]);
            }

            cs++;
        }

        System.out.println(list);
    }

}
	

