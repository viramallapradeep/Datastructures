package arrayOne;

public class SubArrayWithSum2 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 10, -3};

        int curntSum;

        for (int i = 0; i < a.length; i++) {

            curntSum = a[i];

            for (int j = i + 1; j <= a.length; j++) {

                if (13 == curntSum) {
                    System.out.println("Sum found between indexes " + i + " and " + (j - 1));
                }

                if (j >= a.length)
                    break;

                curntSum += a[j];
            }

        }

    }

}
