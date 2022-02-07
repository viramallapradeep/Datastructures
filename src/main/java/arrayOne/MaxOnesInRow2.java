package arrayOne;

public class MaxOnesInRow2 {

    public static void main(String[] args) {

        int[][] a = {{0, 0, 1, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1}};


        int tc = 0;


        int n = 4;

        int row = 0;
        for (int i = 0; i < a.length; i++) {


            int temp = 0;

            for (int j = n - 1; j >= 0; j--) {

                if (a[i][j] == 1) {
                    n--;
                } else {
                    break;
                }

            }

            temp = 4 - n;

            if (temp > tc) {
                tc = temp;
                row = i;
            }

        }

        System.out.println(row + 1);


    }

}
