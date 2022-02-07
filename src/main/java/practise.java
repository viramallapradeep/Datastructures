import java.util.HashSet;
import java.util.Set;

public class practise {


    public static void rotArray(int[] a, int i, int j) {

        int temp = a[j];

        for (int b = j; b > i; b--) {
            a[b] = a[b - 1];
        }
        a[i] = temp;
    }

    public static void main(String[] args) {

        int n = 50, sum = 182;
        int[] a =
//				36,73
                {589, 343, 609, 61, 222, 759, 955, 889, 147, 691, 950, 844, 431, 621, 749, 68, 537, 784, 36, 227, 186, 39, 854, 630, 225, 749, 924, 360, 258, 767, 945, 956, 319, 727, 412, 26, 356, 2, 550, 497, 585, 516, 965, 343, 76, 914, 143, 197, 949, 73};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        boolean isExist = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (set.contains(sum - (a[i] + a[j]))) {
                    isExist = true;
                    break;
                }
            }
        }

        System.out.println(isExist);


    }

}