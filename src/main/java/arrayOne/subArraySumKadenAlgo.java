package arrayOne;

public class subArraySumKadenAlgo {

    public static void main(String[] args) {


        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};


        int max = Integer.MIN_VALUE, curtMax = 0;


        for (int i = 0; i < a.length; i++) {

            curtMax += a[i];

            if (curtMax > max) {
                max = curtMax;
            }

            if (curtMax < 0) {
                curtMax = 0;
            }

        }


        System.out.println(max);

    }

}
