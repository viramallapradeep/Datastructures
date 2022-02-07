package arrayOne;

public class LuckyInteger {

    public int findLucky(int[] a) {

        int finalMax = 0;
        int value = -1;
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && (a[i] != k))
                    count++;
            }
            if (count > 0) {
                k = a[i];
            }

            if (a[i] != 1 && count == a[i]) {
                if (count > finalMax) {
                    finalMax = count;
                    value = a[i];
                }
            } else {
                if (a[i] == 1 && count == 1 && count > finalMax) {
                    value = 1;
                } else if (a[i] == 1 && count > 1 && finalMax == 0) {
                    value = -1;
                }
            }

        }
        return value;
    }
}