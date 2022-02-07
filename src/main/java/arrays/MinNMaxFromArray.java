package arrays;

public class MinNMaxFromArray {

    //TC O(n)
    //SC O(n)
    public static void main(String[] args) {
        int[] array = {4, 5, 3, 4, 9, 3, 1, 7, 5, 3, 12, 4};
        int min = array[1], max = array[1];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + "==" + max);

    }

}
