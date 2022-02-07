package arrays;

public class KtheSmallestInArray {


    public static void main(String[] args) {

        int[] array = {23, 2, 3, 34, 87, 98, 32, 54, 12, 677};

        int min = array[0];

        int k = 5;

        for (int i = 0; i < k; i++) {
            min = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }

            for (int y = 0; y < array.length; y++) {
                if (array[y] == min) {
                    array[y] = Integer.MAX_VALUE;
                }

            }

        }

        System.out.println(min);
    }
}
